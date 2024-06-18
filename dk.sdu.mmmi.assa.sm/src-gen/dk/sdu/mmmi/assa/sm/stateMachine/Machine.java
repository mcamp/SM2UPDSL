/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.assa.sm.stateMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Machine#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Machine#getProperties <em>Properties</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Machine#getVars <em>Vars</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Machine#getStates <em>States</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Machine#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getMachine_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.Machine#getName <em>Name</em>}' attribute.
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
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getMachine_Properties()
   * @model containment="true"
   * @generated
   */
  EList<SafetyProperty> getProperties();

  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.assa.sm.stateMachine.VarDefinition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference list.
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getMachine_Vars()
   * @model containment="true"
   * @generated
   */
  EList<VarDefinition> getVars();

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.assa.sm.stateMachine.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getMachine_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.assa.sm.stateMachine.Transition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getMachine_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

} // Machine
