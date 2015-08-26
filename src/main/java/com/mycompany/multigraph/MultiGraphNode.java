/*
 * |-------------------------------------------------
 * | Copyright © 2008 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.multigraph;

/**
 * A node to be used in a 'MultiGraph'
 * 
 * @author colin
 *
 */
public class MultiGraphNode implements Node{

	private Object element;
	
	/**
	 * Constructor
	 * 
	 * @param element the element this node holds
	 */
	public MultiGraphNode(Object element) {
		this.element = element;
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.Node#setElement(java.lang.Object)
	 */
	@Override
	public void setElement(Object o) {
		element = o;
	}

	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.Node#getElement()
	 */
	@Override
	public Object getElement() {
		return element;
	}

}
