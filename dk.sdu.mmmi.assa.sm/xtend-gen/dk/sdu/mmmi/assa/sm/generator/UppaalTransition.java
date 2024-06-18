package dk.sdu.mmmi.assa.sm.generator;

import com.google.common.base.Objects;
import dk.sdu.mmmi.assa.sm.stateMachine.Machine;
import dk.sdu.mmmi.assa.sm.stateMachine.State;
import dk.sdu.mmmi.assa.sm.stateMachine.Statement;
import dk.sdu.mmmi.assa.sm.stateMachine.Transition;
import java.util.List;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class UppaalTransition {
  public String from;
  
  public String to;
  
  public String sync;
  
  public String channel;
  
  public float timeout;
  
  public boolean isTime;
  
  private String guard;
  
  public List<Statement> myActions = CollectionLiterals.<Statement>newArrayList();
  
  private Transition originalTx;
  
  private Machine originalMachine;
  
  public UppaalTransition(final Machine machine) {
    this.originalMachine = machine;
  }
  
  public UppaalTransition(final Transition transition) {
    this.originalTx = transition;
    this.originalMachine = EcoreUtil2.<Machine>getContainerOfType(transition, Machine.class);
    this.from = transition.getFrom().getName();
    this.to = transition.getTo().getName();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(transition.getWhen());
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      String _when = transition.getWhen();
      String _plus = (_when + "?");
      this.sync = _plus;
      this.channel = transition.getWhen();
    }
    boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(transition.getSignal());
    boolean _not_1 = (!_isNullOrEmpty_1);
    if (_not_1) {
      String _signal = transition.getSignal();
      String _plus_1 = (_signal + "!");
      this.sync = _plus_1;
      this.channel = transition.getSignal();
    }
    this.timeout = transition.getTimeout();
    this.isTime = transition.isTime();
  }
  
  public boolean hasChannel() {
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(this.channel);
    return (!_isNullOrEmpty);
  }
  
  public boolean hasGuard() {
    if ((this.originalTx == null)) {
      return (!(this.guard == null));
    }
    return this.originalTx.isHasGuard();
  }
  
  public Object getGuard() {
    Object _xifexpression = null;
    if ((this.originalTx == null)) {
      _xifexpression = this.guard;
    } else {
      _xifexpression = this.originalTx.getGuard();
    }
    return _xifexpression;
  }
  
  public void setGuard(final String guard) {
    this.guard = guard;
  }
  
  public List<Statement> putActions(final List<Statement> actions) {
    return this.myActions = actions;
  }
  
  public List<Statement> getActions() {
    if ((this.originalTx == null)) {
      return CollectionLiterals.<Statement>newArrayList();
    }
    return this.originalTx.getActions();
  }
  
  public boolean toStateWithTimeTransition() {
    final Function1<State, Boolean> _function = (State it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, this.to));
    };
    final State state = IterableExtensions.<State>findFirst(this.originalMachine.getStates(), _function);
    if ((state == null)) {
      return false;
    }
    final Function1<Transition, Boolean> _function_1 = (Transition it) -> {
      return Boolean.valueOf(it.isTime());
    };
    return IterableExtensions.<Transition>exists(this.getOutgoingTransitions(state), _function_1);
  }
  
  public Iterable<Transition> getOutgoingTransitions(final State state) {
    final Function1<Transition, Boolean> _function = (Transition it) -> {
      State _from = it.getFrom();
      return Boolean.valueOf(Objects.equal(_from, state));
    };
    return IterableExtensions.<Transition>filter(EcoreUtil2.<Machine>getContainerOfType(state, Machine.class).getTransitions(), _function);
  }
}
