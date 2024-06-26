/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.assa.sm.stateMachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Range#getFrom <em>From</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Range#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getRange()
 * @model
 * @generated
 */
public interface Range extends TimeOrRange
{
  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(int)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getRange_From()
   * @model
   * @generated
   */
  int getFrom();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.Range#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(int value);

  /**
   * Returns the value of the '<em><b>To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' attribute.
   * @see #setTo(int)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getRange_To()
   * @model
   * @generated
   */
  int getTo();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.Range#getTo <em>To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' attribute.
   * @see #getTo()
   * @generated
   */
  void setTo(int value);

} // Range
