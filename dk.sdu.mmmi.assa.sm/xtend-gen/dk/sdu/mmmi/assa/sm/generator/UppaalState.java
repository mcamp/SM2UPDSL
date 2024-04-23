package dk.sdu.mmmi.assa.sm.generator;

import dk.sdu.mmmi.assa.sm.stateMachine.State;

@SuppressWarnings("all")
public class UppaalState {
  public String name;
  
  public State originalState;
  
  public boolean committed = false;
  
  public UppaalState(final State state) {
    this.name = state.getName();
    this.originalState = state;
  }
  
  public UppaalState(final String name) {
    this.name = name;
  }
}
