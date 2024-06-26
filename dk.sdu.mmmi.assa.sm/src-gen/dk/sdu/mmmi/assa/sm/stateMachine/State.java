/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.assa.sm.stateMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.State#isFail <em>Fail</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.State#isEnd <em>End</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.State#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.State#getProperties <em>Properties</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.State#getMachine <em>Machine</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject
{
  /**
   * Returns the value of the '<em><b>Fail</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fail</em>' attribute.
   * @see #setFail(boolean)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getState_Fail()
   * @model
   * @generated
   */
  boolean isFail();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.State#isFail <em>Fail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fail</em>' attribute.
   * @see #isFail()
   * @generated
   */
  void setFail(boolean value);

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(boolean)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getState_End()
   * @model
   * @generated
   */
  boolean isEnd();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.State#isEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #isEnd()
   * @generated
   */
  void setEnd(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.assa.sm.stateMachine.SafetyProperty}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getState_Properties()
   * @model containment="true"
   * @generated
   */
  EList<SafetyProperty> getProperties();

  /**
   * Returns the value of the '<em><b>Machine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Machine</em>' containment reference.
   * @see #setMachine(Machine)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getState_Machine()
   * @model containment="true"
   * @generated
   */
  Machine getMachine();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.State#getMachine <em>Machine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Machine</em>' containment reference.
   * @see #getMachine()
   * @generated
   */
  void setMachine(Machine value);

} // State
