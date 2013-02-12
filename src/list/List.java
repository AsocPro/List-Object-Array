/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.lang.reflect.Array;
import java.security.InvalidParameterException;

/**
 *
 * @author zachary
 */
public class List <T>{

    /**
     * @param args the command line arguments
     */
    //Object[] array;
    T[] array;
    final int DEFAULT_SIZE = 10;
    int length;
    public List(Class<T> c)
    {
        array = (T[]) Array.newInstance(c,DEFAULT_SIZE);
        for(int index = length; index < DEFAULT_SIZE; index++)
        {
            array[index] = null;
	}
        length = DEFAULT_SIZE;
    }
    /**
     * Constructor to create a list with a specific capacity
     * @param capacity capacity of the array
     */
    public List(Class<T> c, int capacity)
    {
        array = (T[]) Array.newInstance(c,capacity);
        for(int index = length; index < capacity; index++)
        {
            array[index] = null;
	}
        length = capacity;
    }
    /**
     * Gets a specific item from the list.
     */
    /**
     * Prints out the List object to system.out.
     */
    public void traverse()
    {
        for(int index = 0; index < length; index++)
        {
            System.out.print((index+1) + ". ");
            if(array[index] == null)
            {
                System.out.println("Empty");
            }
            else
            {
                System.out.println(array[index].toString());
            }
        }
    }
    /**
     * Changes the size of the List.
     * @param newSize the new size of the list
     * @param sizeCheck if you want to check that the new size is bigger to prevent data loss
     * @return the new size of the List
     */
    public void resize(int newSize, boolean sizeCheck)
    {
        if(newSize < length && sizeCheck)
        {
            throw new InvalidParameterException("The new Size must"
                                + "be greater than the old size.");
        }
        //FIX THIS
        T[] newArray = (T[]) Array.newInstance(foo.getClass(), newSize);
        for(int index =0; index < length; index++)
        {
           newArray[index] = array[index];
        }
        for(int index = length; index < newSize; index++)
        {
            newArray[index] = null;
        }
        array = newArray;
        length = newSize;
    }
    /**
     * Replaces an object in the list.
     * @return The object that was replaced.
     */
    public T replace(int index, T element)
    {
        if(index < 0 || index >= length)
        {
            throw new InvalidParameterException("Index must be "
                                + "between 0 and " + length + ".");
        }
        T oldElement = array[index];
        array[index] = element;
        return oldElement;
    }
    /**
     * Inserts an object
     */
    public void insert(int index, T item)
    {
        checkValidIndex(index);
        //FIX THIST foo = null;
        length++;
        T[] newArray = (T[]) Array.newInstance(foo.getClass(), length);
        for(int count = 0; count < index; count++)
        {
            newArray[count] = array[count];
        }
        for(int count = index; count < length; count++)
        {
            newArray[count+1] = array[count];
        }
        array = newArray;
        array[index] = item;
    }
    /**
     * Deletes an object
     */
    public T delete(int index)
    {
        checkValidIndex(index);
        //FIX THIS
        length--;
        T[] newArray = (T[]) Array.newInstance(foo.getClass(), length);
        for(int count = 0; count < index; count++)
        {
            newArray[count] = array[count];
        }
        for(int count = index; count < length; count++)
        {
            newArray[count] = array[count+1];
        }
        T item = array[index];
        array = newArray;
        return item;
    }
    public int getLength()
    {
        return length;
    }
    public T getItem(int index)
    {
        T item = array[index];
        return item;
    }
    @Override
    public boolean equals(Object object)
    {
        if(object == null)
        {
            return false;
        }
        if(this == object)
        {
            return true;
        }
        if(!(object instanceof List))
        {
            return false;
        }
        List second = (List)object;
        if(second.getLength() != this.getLength())
        {
            return false;
        }
        for(int index = 0; index < this.getLength(); index++)
        {
            if(second.getItem(index) == null ^ this.getItem(index) == null)
	    {
                return false;
	    }
	    else if(second.getItem(index).equals(this.getItem(index)))
            {
                return false;
            }
        }
        return true;
    }
    private void checkValidIndex(int index)
    {
        if(index < 0 || index >= length)
        {
            throw new InvalidParameterException("Index must be "
                                + "between 0 and " + length + ".");
        }
    }
}
