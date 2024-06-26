/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.assa.sm.stateMachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#getTo <em>To</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#isHasGuard <em>Has Guard</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#isHasWhen <em>Has When</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#getWhen <em>When</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#isTime <em>Time</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#isHasSignal <em>Has Signal</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#getSignal <em>Signal</em>}</li>
 *   <li>{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(State)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getTransition_From()
   * @model
   * @generated
   */
  State getFrom();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(State value);

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(State)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getTransition_To()
   * @model
   * @generated
   */
  State getTo();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(State value);

  /**
   * Returns the value of the '<em><b>Has Guard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Guard</em>' attribute.
   * @see #setHasGuard(boolean)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getTransition_HasGuard()
   * @model
   * @generated
   */
  boolean isHasGuard();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#isHasGuard <em>Has Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Guard</em>' attribute.
   * @see #isHasGuard()
   * @generated
   */
  void setHasGuard(boolean value);

  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(Expression)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getTransition_Guard()
   * @model containment="true"
   * @generated
   */
  Expression getGuard();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Expression value);

  /**
   * Returns the value of the '<em><b>Has When</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has When</em>' attribute.
   * @see #setHasWhen(boolean)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getTransition_HasWhen()
   * @model
   * @generated
   */
  boolean isHasWhen();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#isHasWhen <em>Has When</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has When</em>' attribute.
   * @see #isHasWhen()
   * @generated
   */
  void setHasWhen(boolean value);

  /**
   * Returns the value of the '<em><b>When</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' attribute.
   * @see #setWhen(String)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getTransition_When()
   * @model
   * @generated
   */
  String getWhen();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#getWhen <em>When</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When</em>' attribute.
   * @see #getWhen()
   * @generated
   */
  void setWhen(String value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(boolean)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getTransition_Time()
   * @model
   * @generated
   */
  boolean isTime();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#isTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #isTime()
   * @generated
   */
  void setTime(boolean value);

  /**
   * Returns the value of the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeout</em>' attribute.
   * @see #setTimeout(float)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getTransition_Timeout()
   * @model
   * @generated
   */
  float getTimeout();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#getTimeout <em>Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeout</em>' attribute.
   * @see #getTimeout()
   * @generated
   */
  void setTimeout(float value);

  /**
   * Returns the value of the '<em><b>Has Signal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Signal</em>' attribute.
   * @see #setHasSignal(boolean)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getTransition_HasSignal()
   * @model
   * @generated
   */
  boolean isHasSignal();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#isHasSignal <em>Has Signal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Signal</em>' attribute.
   * @see #isHasSignal()
   * @generated
   */
  void setHasSignal(boolean value);

  /**
   * Returns the value of the '<em><b>Signal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signal</em>' attribute.
   * @see #setSignal(String)
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getTransition_Signal()
   * @model
   * @generated
   */
  String getSignal();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.assa.sm.stateMachine.Transition#getSignal <em>Signal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal</em>' attribute.
   * @see #getSignal()
   * @generated
   */
  void setSignal(String value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.assa.sm.stateMachine.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see dk.sdu.mmmi.assa.sm.stateMachine.StateMachinePackage#getTransition_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getActions();

} // Transition
