/*
 * |-------------------------------------------------
 * | Copyright © 2008 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.multigraph;

/**
 * An graph edge that connects two graph points (nodes) together.
 * 
 * @author Colin
 *
 */
public interface Edge {

	/**
	 * Sets the source node to be n. The source node is where the endpoint
	 * from where this edge starts connecting from to the destination node.
	 * 
	 * @param n the node to be the source
	 */
	void setSourceNode(Node n);

	/**
	 * Sets the destination node to be n. The destination node is the endpoint where this
	 * edge is connected by the source node.
	 * 
	 * @param n the node to be the destination
	 */
	void setDestNode(Node n);

	/**
	 * Returns the source node of this edge
	 * 
	 * @return the source node
	 */
	Node getSourceNode();

	/**
	 * Returns the destination node of this edge
	 * 
	 * @return the destination node
	 */
	Node getDestNode();

	/**
	 * Sets the label identifier to identify this edge
	 * 
	 * @param o the object to be the label identifier
	 */
	void setLabel(Object o);

	/**
	 * Gets the label identifier of this edge
	 * 
	 * @return the label identifier
	 */
	Object getLabel();

}
