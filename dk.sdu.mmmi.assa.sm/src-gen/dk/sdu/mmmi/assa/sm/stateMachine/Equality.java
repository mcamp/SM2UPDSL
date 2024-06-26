/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.assa.sm.stateMachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Equality#getLeft <em>Left</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Equality#getOp <em>Op</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Equality#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getEquality()
 * @model
 * @generated
 */
public interface Equality extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getEquality_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.Equality#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getEquality_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.Equality#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getEquality_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.Equality#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // Equality
