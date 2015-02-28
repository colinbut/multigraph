package com.mycompany.multigraph;


/**
 * A representation of a 'Stack'
 * 
 * @author colin
 *
 */
public interface Stack {
	
	/**
	 * Checks whether the stack is empty
	 * 
	 * @return true if empty, false otherwise
	 */
	boolean sEmpty();
	
	/**
	 * Check whether the stack is full
	 * 
	 * @return true if full, false otherwise
	 */
	boolean sFull();
	
	/**
	 * Pushes a new element onto the top of the stack
	 * 
	 * @param x the element to add
	 */
	void sPush(Object x);
	
	/**
	 * Pops an element from the top of the stack
	 * 
	 * @return the element taken from the stack
	 */
	Object sPop();
	
	/**
	 * Retrieves the top element from the stack but does not removes it
	 * 
	 * @return the element at the top of the stack
	 */
	Object sPeek();


}
