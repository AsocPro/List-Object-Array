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
        List instance = new List();
        instance.traverse();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resize method, of class List.
     */
    @Test
    public void testResize() {
        System.out.println("resize");
        
    }

    /**
     * Test of replace method, of class List.
     */
    @Test
    public void testReplace() {
        System.out.println("replace");
        List instance = new List();
        Object expResult = null;
        Object result = instance.replace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
}
