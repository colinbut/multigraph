package com.mycompany.multigraph;

import java.util.List;

/**
 * A representation of the Graph data structure
 * 
 * @author colin
 *
 */
public interface Graph {
	
	/**
	 * Adds a node to the graph
	 * 
	 * @param n the node to add
	 */
	void addNode(Node n);
	
	/**
	 * Gets a node from the given object element
	 * 
	 * @param o the object that the node contains
	 * @return the node
	 */
	Node getNode(Object o);
	
	/**
	 * Establishes a graph edge between the given two nodes within
	 * the graph
	 * 
	 * @param n1 first node
	 * @param n2 second node
	 * @param label an identifier for the edge
	 */
	void addEdge(Node n1, Node n2, Object label);
	
	
	/**
	 * Returns a list of all the successor nodes for the given node. Successor nodes are 
	 * all nodes that are connected from the given node.
	 * 
	 * @param n the node we successor of
	 * @return the list of nodes that are the successors for the given node
	 */
	public List<Node> getSuccessors(Node n);
	
	/**
	 * This method gets the node count (number of nodes) in this
	 * graph
	 * 
	 * @return the size of the graph
	 */
	public int size();

	
	/**
	 * Checks if two Nodes are Connected through an Edge
	 *  
	 * @param n1 first node
	 * @param n2 second node
	 * @return true if it is connected, otherwise false
	 */
	boolean isConnected(Node n1, Node n2);
	
}
