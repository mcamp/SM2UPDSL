/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.assa.sm.stateMachine.impl;

import dk.sdu.mmmi.assa.sm.stateMachine.State;
import dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage;
import dk.sdu.mmmi.assa.sm.stateMachine.Statement;
import dk.sdu.mmmi.assa.sm.stateMachine.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.impl.TransitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.impl.TransitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.impl.TransitionImpl#isHasGuard <em>Has Guard</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.impl.TransitionImpl#isGuard <em>Guard</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.impl.TransitionImpl#isHasWhen <em>Has When</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.impl.TransitionImpl#getWhen <em>When</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.impl.TransitionImpl#isTime <em>Time</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.impl.TransitionImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.impl.TransitionImpl#isHasSignal <em>Has Signal</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.impl.TransitionImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.impl.TransitionImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected State from;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected State to;

  /**
   * The default value of the '{@link #isHasGuard() <em>Has Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasGuard()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_GUARD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasGuard() <em>Has Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasGuard()
   * @generated
   * @ordered
   */
  protected boolean hasGuard = HAS_GUARD_EDEFAULT;

  /**
   * The default value of the '{@link #isGuard() <em>Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGuard()
   * @generated
   * @ordered
   */
  protected static final boolean GUARD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isGuard() <em>Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGuard()
   * @generated
   * @ordered
   */
  protected boolean guard = GUARD_EDEFAULT;

  /**
   * The default value of the '{@link #isHasWhen() <em>Has When</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasWhen()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_WHEN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasWhen() <em>Has When</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasWhen()
   * @generated
   * @ordered
   */
  protected boolean hasWhen = HAS_WHEN_EDEFAULT;

  /**
   * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhen()
   * @generated
   * @ordered
   */
  protected static final String WHEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWhen() <em>When</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhen()
   * @generated
   * @ordered
   */
  protected String when = WHEN_EDEFAULT;

  /**
   * The default value of the '{@link #isTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTime()
   * @generated
   * @ordered
   */
  protected static final boolean TIME_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTime()
   * @generated
   * @ordered
   */
  protected boolean time = TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeout()
   * @generated
   * @ordered
   */
  protected static final float TIMEOUT_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeout()
   * @generated
   * @ordered
   */
  protected float timeout = TIMEOUT_EDEFAULT;

  /**
   * The default value of the '{@link #isHasSignal() <em>Has Signal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasSignal()
   * @generated
   * @ordered
   */
  protected static final boolean HAS_SIGNAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHasSignal() <em>Has Signal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHasSignal()
   * @generated
   * @ordered
   */
  protected boolean hasSignal = HAS_SIGNAL_EDEFAULT;

  /**
   * The default value of the '{@link #getSignal() <em>Signal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignal()
   * @generated
   * @ordered
   */
  protected static final String SIGNAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSignal() <em>Signal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignal()
   * @generated
   * @ordered
   */
  protected String signal = SIGNAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Statement> actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return StateMachinePackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State getFrom()
  {
    if (from != null && from.eIsProxy())
    {
      InternalEObject oldFrom = (InternalEObject)from;
      from = (State)eResolveProxy(oldFrom);
      if (from != oldFrom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.TRANSITION__FROM, oldFrom, from));
      }
    }
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFrom(State newFrom)
  {
    State oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State getTo()
  {
    if (to != null && to.eIsProxy())
    {
      InternalEObject oldTo = (InternalEObject)to;
      to = (State)eResolveProxy(oldTo);
      if (to != oldTo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinePackage.TRANSITION__TO, oldTo, to));
      }
    }
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTo(State newTo)
  {
    State oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isHasGuard()
  {
    return hasGuard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHasGuard(boolean newHasGuard)
  {
    boolean oldHasGuard = hasGuard;
    hasGuard = newHasGuard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__HAS_GUARD, oldHasGuard, hasGuard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGuard(boolean newGuard)
  {
    boolean oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__GUARD, oldGuard, guard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isHasWhen()
  {
    return hasWhen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHasWhen(boolean newHasWhen)
  {
    boolean oldHasWhen = hasWhen;
    hasWhen = newHasWhen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__HAS_WHEN, oldHasWhen, hasWhen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getWhen()
  {
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWhen(String newWhen)
  {
    String oldWhen = when;
    when = newWhen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__WHEN, oldWhen, when));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTime(boolean newTime)
  {
    boolean oldTime = time;
    time = newTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__TIME, oldTime, time));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getTimeout()
  {
    return timeout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTimeout(float newTimeout)
  {
    float oldTimeout = timeout;
    timeout = newTimeout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__TIMEOUT, oldTimeout, timeout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isHasSignal()
  {
    return hasSignal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHasSignal(boolean newHasSignal)
  {
    boolean oldHasSignal = hasSignal;
    hasSignal = newHasSignal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__HAS_SIGNAL, oldHasSignal, hasSignal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSignal()
  {
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSignal(String newSignal)
  {
    String oldSignal = signal;
    signal = newSignal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.TRANSITION__SIGNAL, oldSignal, signal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Statement> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<Statement>(Statement.class, this, StateMachinePackage.TRANSITION__ACTIONS);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StateMachinePackage.TRANSITION__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StateMachinePackage.TRANSITION__FROM:
        if (resolve) return getFrom();
        return basicGetFrom();
      case StateMachinePackage.TRANSITION__TO:
        if (resolve) return getTo();
        return basicGetTo();
      case StateMachinePackage.TRANSITION__HAS_GUARD:
        return isHasGuard();
      case StateMachinePackage.TRANSITION__GUARD:
        return isGuard();
      case StateMachinePackage.TRANSITION__HAS_WHEN:
        return isHasWhen();
      case StateMachinePackage.TRANSITION__WHEN:
        return getWhen();
      case StateMachinePackage.TRANSITION__TIME:
        return isTime();
      case StateMachinePackage.TRANSITION__TIMEOUT:
        return getTimeout();
      case StateMachinePackage.TRANSITION__HAS_SIGNAL:
        return isHasSignal();
      case StateMachinePackage.TRANSITION__SIGNAL:
        return getSignal();
      case StateMachinePackage.TRANSITION__ACTIONS:
        return getActions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StateMachinePackage.TRANSITION__FROM:
        setFrom((State)newValue);
        return;
      case StateMachinePackage.TRANSITION__TO:
        setTo((State)newValue);
        return;
      case StateMachinePackage.TRANSITION__HAS_GUARD:
        setHasGuard((Boolean)newValue);
        return;
      case StateMachinePackage.TRANSITION__GUARD:
        setGuard((Boolean)newValue);
        return;
      case StateMachinePackage.TRANSITION__HAS_WHEN:
        setHasWhen((Boolean)newValue);
        return;
      case StateMachinePackage.TRANSITION__WHEN:
        setWhen((String)newValue);
        return;
      case StateMachinePackage.TRANSITION__TIME:
        setTime((Boolean)newValue);
        return;
      case StateMachinePackage.TRANSITION__TIMEOUT:
        setTimeout((Float)newValue);
        return;
      case StateMachinePackage.TRANSITION__HAS_SIGNAL:
        setHasSignal((Boolean)newValue);
        return;
      case StateMachinePackage.TRANSITION__SIGNAL:
        setSignal((String)newValue);
        return;
      case StateMachinePackage.TRANSITION__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Statement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StateMachinePackage.TRANSITION__FROM:
        setFrom((State)null);
        return;
      case StateMachinePackage.TRANSITION__TO:
        setTo((State)null);
        return;
      case StateMachinePackage.TRANSITION__HAS_GUARD:
        setHasGuard(HAS_GUARD_EDEFAULT);
        return;
      case StateMachinePackage.TRANSITION__GUARD:
        setGuard(GUARD_EDEFAULT);
        return;
      case StateMachinePackage.TRANSITION__HAS_WHEN:
        setHasWhen(HAS_WHEN_EDEFAULT);
        return;
      case StateMachinePackage.TRANSITION__WHEN:
        setWhen(WHEN_EDEFAULT);
        return;
      case StateMachinePackage.TRANSITION__TIME:
        setTime(TIME_EDEFAULT);
        return;
      case StateMachinePackage.TRANSITION__TIMEOUT:
        setTimeout(TIMEOUT_EDEFAULT);
        return;
      case StateMachinePackage.TRANSITION__HAS_SIGNAL:
        setHasSignal(HAS_SIGNAL_EDEFAULT);
        return;
      case StateMachinePackage.TRANSITION__SIGNAL:
        setSignal(SIGNAL_EDEFAULT);
        return;
      case StateMachinePackage.TRANSITION__ACTIONS:
        getActions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StateMachinePackage.TRANSITION__FROM:
        return from != null;
      case StateMachinePackage.TRANSITION__TO:
        return to != null;
      case StateMachinePackage.TRANSITION__HAS_GUARD:
        return hasGuard != HAS_GUARD_EDEFAULT;
      case StateMachinePackage.TRANSITION__GUARD:
        return guard != GUARD_EDEFAULT;
      case StateMachinePackage.TRANSITION__HAS_WHEN:
        return hasWhen != HAS_WHEN_EDEFAULT;
      case StateMachinePackage.TRANSITION__WHEN:
        return WHEN_EDEFAULT == null ? when != null : !WHEN_EDEFAULT.equals(when);
      case StateMachinePackage.TRANSITION__TIME:
        return time != TIME_EDEFAULT;
      case StateMachinePackage.TRANSITION__TIMEOUT:
        return timeout != TIMEOUT_EDEFAULT;
      case StateMachinePackage.TRANSITION__HAS_SIGNAL:
        return hasSignal != HAS_SIGNAL_EDEFAULT;
      case StateMachinePackage.TRANSITION__SIGNAL:
        return SIGNAL_EDEFAULT == null ? signal != null : !SIGNAL_EDEFAULT.equals(signal);
      case StateMachinePackage.TRANSITION__ACTIONS:
        return actions != null && !actions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (hasGuard: ");
    result.append(hasGuard);
    result.append(", guard: ");
    result.append(guard);
    result.append(", hasWhen: ");
    result.append(hasWhen);
    result.append(", when: ");
    result.append(when);
    result.append(", time: ");
    result.append(time);
    result.append(", timeout: ");
    result.append(timeout);
    result.append(", hasSignal: ");
    result.append(hasSignal);
    result.append(", signal: ");
    result.append(signal);
    result.append(')');
    return result.toString();
  }

} //TransitionImpl
