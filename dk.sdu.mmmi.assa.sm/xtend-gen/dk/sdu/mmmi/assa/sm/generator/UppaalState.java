package dk.sdu.mmmi.assa.sm.generator;

import dk.sdu.mmmi.assa.sm.stateMachine.Machine;
import dk.sdu.mmmi.assa.sm.stateMachine.State;
import dk.sdu.mmmi.assa.sm.stateMachine.Transition;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class UppaalState {
  public String name;
  
  public State originalState;
  
  public boolean committed = false;
  
  public UppaalState(final State state) {
    this.name = state.getName();
    this.originalState = state;
    boolean _isFinal = this.isFinal(state);
    if (_isFinal) {
      this.committed = true;
    }
  }
  
  /**
   * TODO: Duplicated method, create utils
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
  
  public UppaalState(final String name) {
    this.name = name;
  }
}
