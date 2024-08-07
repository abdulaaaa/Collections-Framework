package org.Collections.AbdulWajid;

import java.util.Iterator;

/**
 * A generic collection interface with various methods to manipulate and query the collection.
 *
 * @param <E> the type of elements in this collection
 */
public interface Collection<E> {

    /**
     * Ensures that this collection contains the specified element
     * (optional operation).
     *
     * @param e the element to be added
     * @return {@code true} if the element was added, {@code false} otherwise
     */
    boolean add(E e);

    /**
     * Adds all the elements in the specified collection to this collection
     * (optional operation).
     *
     * @param c the collection containing elements to be added
     * @return {@code true} if the collection was modified as a result of the
     * call
     */
    boolean addAll(Collection<? extends E> c);

    /**
     * Removes all the elements from this collection (optional operation).
     */
    void clear();

    /**
     * Returns {@code true} if this collection contains the specified element.
     *
     * @param o the element whose presence in this collection is to be tested
     * @return {@code true} if this collection contains the specified element,
     * {@code false} otherwise
     */
    boolean contains(Object o);

    /**
     * Returns {@code true} if this collection contains all of the elements in
     * the specified collection.
     *
     * @param c the collection to be checked for containment in this collection
     * @return {@code true} if this collection contains all of the elements in
     * the specified collection
     */
    boolean containsAll(Collection<?> c);

    /**
     * Compares the specified object with this collection for equality.
     *
     * @param o the object to be compared for equality with this collection
     * @return {@code true} if the specified object is equal to this collection
     */
    boolean equals(Object o);

    /**
     * Returns the hash code value for this collection.
     *
     * @return the hash code value for this collection
     */
    int hashCode();

    /**
     * Returns {@code true} if this collection contains no elements.
     *
     * @return {@code true} if this collection contains no elements,
     * {@code false} otherwise
     */
    boolean isEmpty();

    /**
     * Returns an iterator over the elements in this collection.
     *
     * @return an {@code Iterator} over the elements in this collection
     */
    Iterator<E> iterator();

    /**
     * Removes a single instance of the specified element from this collection,
     * if it is present (optional operation).
     *
     * @param o the element to be removed from this collection, if present
     * @return {@code true} if the element was removed, {@code false} otherwise
     */
    boolean remove(Object o);

    /**
     * Removes all of this collection's elements that are also contained in the
     * specified collection (optional operation).
     *
     * @param c the collection containing elements to be removed from this
     *          collection
     * @return {@code true} if this collection was modified as a result of the
     * call
     */
    boolean removeAll(Collection<?> c);

    /**
     * Retains only the elements in this collection that are contained in the
     * specified collection (optional operation).
     *
     * @param c the collection containing elements to be retained in this
     *          collection
     * @return {@code true} if this collection was modified as a result of the
     * call
     */
    boolean retainAll(Collection<?> c);

    /**
     * Returns the number of elements in this collection.
     *
     * @return the number of elements in this collection
     */
    int size();

    /**
     * Returns an array containing all the elements in this collection.
     *
     * @return an array containing all the elements in this collection
     */
    Object[] toArray();

    /**
     * Returns an array containing all the elements in this collection; the
     * runtime type of the returned array is that of the specified array.
     *
     * @param <T> the runtime type of the array to contain the collection
     * @param a   the array into which the elements of this collection are to be
     *            stored, if it is big enough; otherwise, a new array of the same
     *            runtime type is allocated for this purpose
     * @return an array containing all the elements in this collection
     */
    <T> T[] toArray(T[] a);
}
