package dk.sdu.mmmi.assa.sm.generator;

import dk.sdu.mmmi.assa.sm.stateMachine.Statement;
import dk.sdu.mmmi.assa.sm.stateMachine.Transition;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class UppaalTransition {
  public String from;
  
  public String to;
  
  public String sync;
  
  public String channel;
  
  public float timeout;
  
  public boolean isTime;
  
  private Transition originalTx;
  
  public UppaalTransition() {
  }
  
  public UppaalTransition(final Transition transition) {
    this.originalTx = transition;
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
      return false;
    }
    return this.originalTx.isHasGuard();
  }
  
  public boolean guard() {
    return this.originalTx.isGuard();
  }
  
  public List<Statement> actions() {
    if ((this.originalTx == null)) {
      return CollectionLiterals.<Statement>newArrayList();
    }
    return this.originalTx.getActions();
  }
}
