/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.assa.sm.stateMachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.VarDefinition#getType <em>Type</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.VarDefinition#getName <em>Name</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.VarDefinition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getVarDefinition()
 * @model
 * @generated
 */
public interface VarDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getVarDefinition_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.VarDefinition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getVarDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.VarDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getVarDefinition_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.VarDefinition#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // VarDefinition
