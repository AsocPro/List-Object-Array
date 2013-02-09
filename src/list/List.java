/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.lang.reflect.Array;

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
       // array = new object
                //traverse method walk through the method and printout all of it
    }
    /**
     * Constructor to create a list with a specific capacity
     * @param capacity capacity of the array
     */
    public List(int capacity)
    {
        
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
            System.out.println(array[index].toString());
        }
    }
    /**
     * Changes the size of the List.
     * @return the new size of the List
     */
    public int resize()
    {
        return 4;
    }
    /**
     * Replaces an object in the list.
     * @return The object that was replaced.
     */
    public T replace(int index, T element)
    {
        return null;
    }
    /**
     * Inserts an object
     */
    public void insert(int index, T item)
    {
        
    }
    /**
     * Deletes an object
     */
    public T delete()
    {
        return null;
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
            if(second.getItem(index) == null && this.getItem(index) == null)
            {
                
            }
            if(second.getItem(index).equals(this.getItem(index)))
            {
                return false;
            }
        }
        return true;
    }
}
