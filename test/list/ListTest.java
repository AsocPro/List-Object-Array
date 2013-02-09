/* @author Zachary Pratt Gibbs
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zachary
 */
public class ListTest {
    
    int[] stdArray;
    List<Integer> stdList;
    
    public ListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        stdArray = new int[5];
        int[] stdArray = {1,2,3,4,5};
        stdList = new List<>(5);
        for(int index = 0; index < 5; index++)
        {
            stdList.insert(index,stdArray[index]);
        }
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of traverse method, of class List.
     */
    @Test
    public void testTraverse() {
        System.out.println("traverse");
        stdList.traverse();
        fail("check this one manually");
    }

    /**
     * Test of resize method, of class List.
     */
    @Test
    public void testResize() {
        System.out.println("resize");
        List<Integer> newList = new List<>(10);
        for(int index = 0; index < 5; index++)
        {
            newList.insert(index,stdArray[index]);
        }
        for(int index = 5; index < 10; index++)
        {
            newList.insert(index, null);
        }
    }

    /**
     * Test of replace method, of class List.
     */
    @Test
    public void testReplace() {
        System.out.println("replace");
        List<Integer> newList = new List<>(5);
        for(int index = 0; index < 5; index++)
        {
            newList.insert(index,stdArray[index]);
        }
        newList.replace(2,333);
        newList.traverse();
        fail("check this one manually");
    }

    /**
     * Test of insert method, of class List.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        List instance = new List();
        //instance.insert();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class List.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        List instance = new List();
        Object expResult = null;
        Object result = instance.delete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLength method, of class List.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        assertTrue(stdList.getLength()==5);
    }
    /**
     * Test of getItem method, of class List.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        assertTrue(stdList.getItem(0) == 1);
    }

    /**
     * Test of equals method, of class List.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        List<Integer> newList = new List<>(5);
        for(int index = 0; index < 5; index++)
        {
            newList.insert(index,stdArray[index]);
        }
        assertTrue(newList.equals(stdList)&&stdList.equals(newList));
    }
    @Test
    public void testEqualsFail() {
        System.out.println("equals");
        List<Integer> newList = new List<>(5);
        for(int index = 0; index < 4; index++)
        {
            newList.insert(index,stdArray[index]);
        }
        newList.insert(4,4);
        assertTrue(!(newList.equals(stdList)&&stdList.equals(newList)));
    }
}
