/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.assa.sm.stateMachine.impl;

import dk.sdu.mmmi.assa.sm.stateMachine.Machine;
import dk.sdu.mmmi.assa.sm.stateMachine.SafetyProperty;
import dk.sdu.mmmi.assa.sm.stateMachine.State;
import dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage;

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
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.impl.StateImpl#isFail <em>Fail</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.impl.StateImpl#isEnd <em>End</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.impl.StateImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.impl.StateImpl#getMachine <em>Machine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State
{
  /**
   * The default value of the '{@link #isFail() <em>Fail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFail()
   * @generated
   * @ordered
   */
  protected static final boolean FAIL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFail() <em>Fail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFail()
   * @generated
   * @ordered
   */
  protected boolean fail = FAIL_EDEFAULT;

  /**
   * The default value of the '{@link #isEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnd()
   * @generated
   * @ordered
   */
  protected static final boolean END_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnd()
   * @generated
   * @ordered
   */
  protected boolean end = END_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<SafetyProperty> properties;

  /**
   * The cached value of the '{@link #getMachine() <em>Machine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMachine()
   * @generated
   * @ordered
   */
  protected Machine machine;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateImpl()
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
    return StateMachinePackage.Literals.STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFail()
  {
    return fail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFail(boolean newFail)
  {
    boolean oldFail = fail;
    fail = newFail;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.STATE__FAIL, oldFail, fail));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEnd(boolean newEnd)
  {
    boolean oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.STATE__END, oldEnd, end));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.STATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SafetyProperty> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<SafetyProperty>(SafetyProperty.class, this, StateMachinePackage.STATE__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Machine getMachine()
  {
    return machine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMachine(Machine newMachine, NotificationChain msgs)
  {
    Machine oldMachine = machine;
    machine = newMachine;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateMachinePackage.STATE__MACHINE, oldMachine, newMachine);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMachine(Machine newMachine)
  {
    if (newMachine != machine)
    {
      NotificationChain msgs = null;
      if (machine != null)
        msgs = ((InternalEObject)machine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateMachinePackage.STATE__MACHINE, null, msgs);
      if (newMachine != null)
        msgs = ((InternalEObject)newMachine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateMachinePackage.STATE__MACHINE, null, msgs);
      msgs = basicSetMachine(newMachine, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateMachinePackage.STATE__MACHINE, newMachine, newMachine));
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
      case StateMachinePackage.STATE__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case StateMachinePackage.STATE__MACHINE:
        return basicSetMachine(null, msgs);
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
      case StateMachinePackage.STATE__FAIL:
        return isFail();
      case StateMachinePackage.STATE__END:
        return isEnd();
      case StateMachinePackage.STATE__NAME:
        return getName();
      case StateMachinePackage.STATE__PROPERTIES:
        return getProperties();
      case StateMachinePackage.STATE__MACHINE:
        return getMachine();
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
      case StateMachinePackage.STATE__FAIL:
        setFail((Boolean)newValue);
        return;
      case StateMachinePackage.STATE__END:
        setEnd((Boolean)newValue);
        return;
      case StateMachinePackage.STATE__NAME:
        setName((String)newValue);
        return;
      case StateMachinePackage.STATE__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends SafetyProperty>)newValue);
        return;
      case StateMachinePackage.STATE__MACHINE:
        setMachine((Machine)newValue);
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
      case StateMachinePackage.STATE__FAIL:
        setFail(FAIL_EDEFAULT);
        return;
      case StateMachinePackage.STATE__END:
        setEnd(END_EDEFAULT);
        return;
      case StateMachinePackage.STATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateMachinePackage.STATE__PROPERTIES:
        getProperties().clear();
        return;
      case StateMachinePackage.STATE__MACHINE:
        setMachine((Machine)null);
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
      case StateMachinePackage.STATE__FAIL:
        return fail != FAIL_EDEFAULT;
      case StateMachinePackage.STATE__END:
        return end != END_EDEFAULT;
      case StateMachinePackage.STATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateMachinePackage.STATE__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case StateMachinePackage.STATE__MACHINE:
        return machine != null;
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
    result.append(" (fail: ");
    result.append(fail);
    result.append(", end: ");
    result.append(end);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StateImpl
