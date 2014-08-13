/**
 */
package com.euclideanspace.aldor.editor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterators1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.euclideanspace.aldor.editor.Iterators1#getItr <em>Itr</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.euclideanspace.aldor.editor.EditorPackage#getIterators1()
 * @model
 * @generated
 */
public interface Iterators1 extends Iterators
{
  /**
   * Returns the value of the '<em><b>Itr</b></em>' containment reference list.
   * The list contents are of type {@link com.euclideanspace.aldor.editor.Iterator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Itr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Itr</em>' containment reference list.
   * @see com.euclideanspace.aldor.editor.EditorPackage#getIterators1_Itr()
   * @model containment="true"
   * @generated
   */
  EList<Iterator> getItr();

} // Iterators1
