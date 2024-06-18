package dk.sdu.mmmi.assa.sm.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import dk.sdu.mmmi.assa.sm.stateMachine.Delay;
import dk.sdu.mmmi.assa.sm.stateMachine.Machine;
import dk.sdu.mmmi.assa.sm.stateMachine.Range;
import dk.sdu.mmmi.assa.sm.stateMachine.State;
import dk.sdu.mmmi.assa.sm.stateMachine.Statement;
import dk.sdu.mmmi.assa.sm.stateMachine.Time;
import dk.sdu.mmmi.assa.sm.stateMachine.TimeOrRange;
import dk.sdu.mmmi.assa.sm.stateMachine.Transition;
import dk.sdu.mmmi.assa.sm.stateMachine.VarDefinition;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class UppaalProcess {
  public String name;
  
  public final List<UppaalState> states = CollectionLiterals.<UppaalState>newArrayList();
  
  public final List<UppaalTransition> transitions = CollectionLiterals.<UppaalTransition>newArrayList();
  
  public final List<UppaalState> firstGeneratedStates = CollectionLiterals.<UppaalState>newArrayList();
  
  public Machine originalMachine;
  
  public UppaalProcess(final Machine machine) {
    this.originalMachine = machine;
    this.name = this.processName(machine);
    boolean _isNested = this.isNested(machine);
    if (_isNested) {
      this.genInitNestedMachine(machine);
    }
    boolean _hasStartupDelay = this.hasStartupDelay(machine);
    if (_hasStartupDelay) {
      this.genStartupDelay(machine);
    }
    this.fillTransitions(machine);
    this.fillStates(machine);
    this.states.addAll(this.firstGeneratedStates);
  }
  
  public UppaalProcess() {
  }
  
  public static UppaalProcess fromSignalTransition(final Transition transition) {
    final UppaalProcess process = new UppaalProcess();
    String _signal = transition.getSignal();
    String _plus = ("gen_sync_" + _signal);
    process.name = _plus;
    UppaalState _uppaalState = new UppaalState("initSync");
    process.states.add(_uppaalState);
    Machine _containerOfType = EcoreUtil2.<Machine>getContainerOfType(transition, Machine.class);
    final UppaalTransition tx = new UppaalTransition(_containerOfType);
    tx.from = "initSync";
    tx.to = "initSync";
    String _signal_1 = transition.getSignal();
    String _plus_1 = (_signal_1 + "?");
    tx.sync = _plus_1;
    process.transitions.add(tx);
    return process;
  }
  
  public static UppaalProcess fromWhenTransition(final Transition transition) {
    final UppaalProcess process = new UppaalProcess();
    String _when = transition.getWhen();
    String _plus = ("gen_sync_" + _when);
    process.name = _plus;
    UppaalState _uppaalState = new UppaalState("initSync");
    process.states.add(_uppaalState);
    Machine _containerOfType = EcoreUtil2.<Machine>getContainerOfType(transition, Machine.class);
    final UppaalTransition tx = new UppaalTransition(_containerOfType);
    tx.from = "initSync";
    tx.to = "initSync";
    String _when_1 = transition.getWhen();
    String _plus_1 = (_when_1 + "!");
    tx.sync = _plus_1;
    process.transitions.add(tx);
    return process;
  }
  
  public List<VarDefinition> vars() {
    if ((this.originalMachine == null)) {
      return CollectionLiterals.<VarDefinition>newArrayList();
    }
    return this.originalMachine.getVars();
  }
  
  private boolean genInitNestedMachine(final Machine machine) {
    boolean _xblockexpression = false;
    {
      final String genInit = "gen_init";
      UppaalState _uppaalState = new UppaalState("gen_init");
      this.states.add(_uppaalState);
      boolean _xifexpression = false;
      boolean _isEmpty = machine.getStates().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        boolean _xblockexpression_1 = false;
        {
          final UppaalTransition newTransition = new UppaalTransition(machine);
          newTransition.from = genInit;
          final State toState = machine.getStates().get(0);
          boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(toState.getProperties());
          if (_isNullOrEmpty) {
            newTransition.to = toState.getName();
          } else {
            newTransition.to = this.preStateName(toState);
          }
          newTransition.channel = this.startMachineChannel(machine);
          newTransition.sync = (newTransition.channel + "?");
          _xblockexpression_1 = this.transitions.add(newTransition);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private void fillStates(final Machine machine) {
    EList<State> _states = machine.getStates();
    for (final State state : _states) {
      {
        boolean _hasNestedMachine = this.hasNestedMachine(state);
        if (_hasNestedMachine) {
          final String preStateName = this.preStateName(state);
          final UppaalState preState = new UppaalState(preStateName);
          preState.committed = true;
          this.states.add(preState);
          final UppaalTransition newTransition = new UppaalTransition(machine);
          newTransition.from = preStateName;
          newTransition.to = state.getName();
          newTransition.channel = this.startMachineChannel(state.getMachine());
          newTransition.sync = (newTransition.channel + "!");
          this.transitions.add(newTransition);
        }
        boolean _isFinal = this.isFinal(state);
        if (_isFinal) {
          final UppaalTransition newTransition_1 = new UppaalTransition(machine);
          newTransition_1.from = state.getName();
          newTransition_1.to = "gen_init";
          this.transitions.add(newTransition_1);
        }
        UppaalState _uppaalState = new UppaalState(state);
        this.states.add(_uppaalState);
      }
    }
  }
  
  private void fillTransitions(final Machine machine) {
    EList<Transition> _transitions = machine.getTransitions();
    for (final Transition transition : _transitions) {
      boolean _hasNestedMachine = this.hasNestedMachine(transition.getTo());
      if (_hasNestedMachine) {
        this.genTransitionToStartNestedMachine(transition);
      } else {
        boolean _not = (!(StringExtensions.isNullOrEmpty(transition.getSignal()) || StringExtensions.isNullOrEmpty(transition.getWhen())));
        if (_not) {
          this.genTransitionWithWhenSignal(transition);
        } else {
          boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(transition.getTo().getProperties());
          boolean _not_1 = (!_isNullOrEmpty);
          if (_not_1) {
          } else {
            UppaalTransition _uppaalTransition = new UppaalTransition(transition);
            this.transitions.add(_uppaalTransition);
          }
        }
      }
    }
  }
  
  /**
   * If a transition goes to a state with a nested machine
   * We need to modify this transition to point to the generated "pre" state
   * And create a new one that goes from pre to the original state, activating the nested machine
   */
  private boolean genTransitionToStartNestedMachine(final Transition transition) {
    boolean _xblockexpression = false;
    {
      final UppaalTransition newTransition = new UppaalTransition(transition);
      final String newState = this.preStateName(transition.getTo());
      newTransition.to = newState;
      _xblockexpression = this.transitions.add(newTransition);
    }
    return _xblockexpression;
  }
  
  /**
   * If a transition has a when and a signal, we need to add a new state to support multiple sync in uppaal
   * Moreover, it creates the pre_state if needed
   */
  private boolean genTransitionWithWhenSignal(final Transition transition) {
    boolean _xblockexpression = false;
    {
      final String newStateName = this.preStateName(transition.getTo());
      Machine _containerOfType = EcoreUtil2.<Machine>getContainerOfType(transition, Machine.class);
      final UppaalTransition newTransition1 = new UppaalTransition(_containerOfType);
      newTransition1.from = transition.getFrom().getName();
      newTransition1.to = newStateName;
      String _when = transition.getWhen();
      String _plus = (_when + "?");
      newTransition1.sync = _plus;
      this.transitions.add(newTransition1);
      Machine _containerOfType_1 = EcoreUtil2.<Machine>getContainerOfType(transition, Machine.class);
      final UppaalTransition newTransition2 = new UppaalTransition(_containerOfType_1);
      newTransition2.from = newStateName;
      newTransition2.to = transition.getTo().getName();
      String _signal = transition.getSignal();
      String _plus_1 = (_signal + "!");
      newTransition2.sync = _plus_1;
      this.transitions.add(newTransition2);
      final Function1<UppaalState, Boolean> _function = (UppaalState it) -> {
        return Boolean.valueOf(Objects.equal(it.name, newStateName));
      };
      final UppaalState newState = IterableExtensions.<UppaalState>findFirst(this.firstGeneratedStates, _function);
      boolean _xifexpression = false;
      if ((newState == null)) {
        boolean _xblockexpression_1 = false;
        {
          final UppaalState preState = new UppaalState(newStateName);
          preState.committed = true;
          _xblockexpression_1 = this.firstGeneratedStates.add(preState);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public UppaalState initState() {
    UppaalState _xifexpression = null;
    boolean _isEmpty = this.states.isEmpty();
    if (_isEmpty) {
      _xifexpression = null;
    } else {
      _xifexpression = this.states.get(0);
    }
    return _xifexpression;
  }
  
  /**
   * Returns all channels used in the process
   * Iterate over all transitions, check if the channel is defined, and if it has not been added to the array
   * Then, return array
   */
  public List<String> allChannels() {
    List<String> _xblockexpression = null;
    {
      final List<String> ret = CollectionLiterals.<String>newArrayList();
      for (final UppaalTransition transition : this.transitions) {
        if ((transition.hasChannel() && (!ret.contains(transition.channel)))) {
          ret.add(transition.channel);
        }
      }
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public boolean isNested(final Machine machine) {
    State _containerOfType = EcoreUtil2.<State>getContainerOfType(machine, State.class);
    boolean _tripleEquals = (_containerOfType == null);
    if (_tripleEquals) {
      return false;
    }
    return true;
  }
  
  public State parentState(final Machine machine) {
    return EcoreUtil2.<State>getContainerOfType(machine, State.class);
  }
  
  public String processName(final Machine machine) {
    boolean _isNested = this.isNested(machine);
    if (_isNested) {
      String _name = this.parentState(machine).getName();
      String _plus = (_name + "_");
      String _name_1 = machine.getName();
      return (_plus + _name_1);
    }
    return machine.getName();
  }
  
  public boolean hasNestedMachine(final State state) {
    Machine _machine = state.getMachine();
    return (_machine != null);
  }
  
  public String preStateName(final State state) {
    String _name = state.getName();
    return ("gen_pre_" + _name);
  }
  
  public String startMachineChannel(final Machine machine) {
    String _processName = this.processName(machine);
    String _plus = ("gen_" + _processName);
    return (_plus + "_start");
  }
  
  /**
   * A state is defined as final if:
   *   It is an outgoing state of a transition with signal used on parent machine
   *   The transition using the signal (when) should start from the parent state
   *   It does not have outgoing transitions [TODO: this should be imposed in the DSL itself]
   * TODO: This approach only works with direct parent, not ancestors
   */
  public boolean isFinal(final State state) {
    final Machine machine = EcoreUtil2.<Machine>getContainerOfType(state, Machine.class);
    final State parentState = EcoreUtil2.<State>getContainerOfType(machine, State.class);
    if ((parentState == null)) {
      return false;
    }
    final Function1<Transition, Boolean> _function = (Transition it) -> {
      return Boolean.valueOf(((it.getTo() == state) && (!StringExtensions.isNullOrEmpty(it.getSignal()))));
    };
    final Transition tx = IterableExtensions.<Transition>findFirst(machine.getTransitions(), _function);
    if ((tx == null)) {
      return false;
    }
    final Machine parentMachine = EcoreUtil2.<Machine>getContainerOfType(parentState, Machine.class);
    final Function1<Transition, Boolean> _function_1 = (Transition it) -> {
      return Boolean.valueOf(((it.getFrom() == parentState) && (tx.getSignal() == it.getWhen())));
    };
    final Transition parentTx = IterableExtensions.<Transition>findFirst(parentMachine.getTransitions(), _function_1);
    if ((parentTx != null)) {
      return false;
    }
    return true;
  }
  
  public boolean hasCommittedState() {
    final Function1<UppaalState, Boolean> _function = (UppaalState it) -> {
      return Boolean.valueOf(it.committed);
    };
    UppaalState _findFirst = IterableExtensions.<UppaalState>findFirst(this.states, _function);
    return (_findFirst != null);
  }
  
  public CharSequence toClockString(final float seconds) {
    final float clock = seconds;
    int _int = this.toInt(clock);
    return (Integer.valueOf(_int) + "");
  }
  
  public int toInt(final float number) {
    return Math.round(number);
  }
  
  public boolean hasStartupDelay(final Machine machine) {
    boolean _isEmpty = IterableExtensions.isEmpty(Iterables.<Delay>filter(machine.getProperties(), Delay.class));
    return (!_isEmpty);
  }
  
  private boolean genStartupDelay(final Machine machine) {
    boolean _xblockexpression = false;
    {
      final UppaalState uppaalstate = new UppaalState("gen_init");
      this.states.add(uppaalstate);
      final Delay property = IterableExtensions.<Delay>head(Iterables.<Delay>filter(machine.getProperties(), Delay.class));
      final int fromTime = this.getFrom(property.getTime());
      final int toTime = this.getTo(property.getTime());
      uppaalstate.body = ("startup_clock <= " + Integer.valueOf(toTime));
      boolean _xifexpression = false;
      boolean _isEmpty = machine.getStates().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        boolean _xblockexpression_1 = false;
        {
          final UppaalTransition newTransition = new UppaalTransition(machine);
          newTransition.from = uppaalstate.name;
          newTransition.to = machine.getStates().get(0).getName();
          newTransition.setGuard(("startup_clock >= " + Integer.valueOf(fromTime)));
          final List<Statement> actions = property.getStatements();
          newTransition.putActions(actions);
          _xblockexpression_1 = this.transitions.add(newTransition);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected int _getFrom(final Time time) {
    return time.getValue();
  }
  
  protected int _getFrom(final Range range) {
    return range.getFrom();
  }
  
  protected int _getTo(final Time time) {
    return time.getValue();
  }
  
  protected int _getTo(final Range range) {
    return range.getTo();
  }
  
  public int getFrom(final TimeOrRange range) {
    if (range instanceof Range) {
      return _getFrom((Range)range);
    } else if (range instanceof Time) {
      return _getFrom((Time)range);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(range).toString());
    }
  }
  
  public int getTo(final TimeOrRange range) {
    if (range instanceof Range) {
      return _getTo((Range)range);
    } else if (range instanceof Time) {
      return _getTo((Time)range);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(range).toString());
    }
  }
}
