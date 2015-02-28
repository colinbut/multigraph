package com.mycompany.multigraph;

/**
 * A class to represent an abstract data structure object that holds
 * an actual item to be stored in a data structure
 * 
 * @author colin
 *
 */
public interface Node {
	
	/**
	 * Sets the item it holds
	 * 
	 * @param o the item this node contains
	 */
	void setElement(Object o);
	
	/**
	 * Returns the item it holds
	 * 
	 * @return the object this node contains
	 */
	Object getElement();

}
