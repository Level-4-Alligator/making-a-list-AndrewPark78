import static org.junit.Assert.*;

import org.junit.Test;

public class ListTest {

	 @Test
	    public void testNewLinkedList(){
	        LinkedList singly = new LinkedList();
	        assertTrue(singly.isEmpty());       // linked list should be empty
	        assertEquals(0, singly.sizeCheck());   // length of linked list should be zero
	        singly.addLast("ABC");
	        assertFalse(singly.isEmpty());     // linked list should not be empty
	        assertEquals(1, singly.sizeCheck());  // length of linked list should be 1
	    }
	 
	 @Test
	    public void testLinkedListAddLast(){
	        LinkedList singly = new LinkedList();
	        singly.addLast("You ");
	        singly.addLast("are ");
	        singly.addLast("awesome!!");
	        assertFalse(singly.isEmpty());     // linked list should not be empty
	        assertEquals("You are awesome!!", singly.toString());  // length of linked list should be 1
	    }
	 @Test
	    public void testLinkedListRemoved(){
	        LinkedList singly = new LinkedList();
	        singly.addLast("You ");
	        singly.addLast("are ");
	        singly.addLast("awesome!!");
	        assertFalse(singly.isEmpty());     // linked list should not be empty
	        singly.remove(2);
	        assertEquals("You are ", singly.toString());  // length of linked list should be 1
	    }
	 @Test
	    public void testLinkedListAddFirst(){
	        LinkedList singly = new LinkedList();
	        singly.addLast("am ");
	        singly.addLast("awesome!!");
	        assertFalse(singly.isEmpty());     // linked list should not be empty
	        singly.addFirst("I ");
	        assertEquals("I am awesome!!", singly.toString());  // length of linked list should be 1
	    }
	 @Test
	    public void testLinkedListAdd(){
	        LinkedList singly = new LinkedList();
	        singly.addLast("I ");
	        singly.addLast("awesome!!");
	        assertFalse(singly.isEmpty());     // linked list should not be empty
	        singly.add("am ", 1);
	        assertEquals("I am awesome!!", singly.toString());  // length of linked list should be 1
	    }
}
