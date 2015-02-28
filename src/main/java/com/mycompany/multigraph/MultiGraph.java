package com.mycompany.multigraph;

import java.util.ArrayList;
import java.util.List;

/**
 * A special type of the Graph data structure - "MultiGraph"
 * 
 * @author colin
 *
 */
public class MultiGraph implements Graph{
	
	//A set of Nodes & Edges
	private List<Node> nodeList = null;
	private List<Edge> edgeList = null;
		
	/**
	 * Constructor
	 */
	public MultiGraph(){
		nodeList = new ArrayList<>();
		edgeList = new ArrayList<>();
	}
	
	/**
	 * Checks whether a particular exist or not
	 * 
	 * @param obj the object that the node contains
	 * @return true if so, false otherwise
	 */
	public boolean existNode(Object obj){
		return (getNode(obj) == null);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.MultiGraph#addNode(com.mycompany.multigraph.Node)
	 */
	@Override
	public void addNode(Node n){
		nodeList.add(n);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.MultiGraph#addEdge(com.mycompany.multigraph.Node, com.mycompany.multigraph.Node, java.lang.Object)
	 */
	@Override
	public void addEdge(Node n1, Node n2, Object label){
		edgeList.add(new Link(n1,n2,label));
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.MultiGraph#getNode(java.lang.Object)
	 */
	@Override
	public Node getNode(Object id){
		for(Node n : nodeList){
			if(n.getElement().equals(id)){
				return n;
			}
		}
		return null;
	}

	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.MultiGraph#getNodeCount()
	 */
	@Override
	public int size(){
		return nodeList.size();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.MultiGraph#isConnected(com.mycompany.multigraph.Node, com.mycompany.multigraph.Node)
	 */
	@Override
	public boolean isConnected(Node src, Node dest){
		for(Edge e : edgeList){
			if(e.getSourceNode().equals(src) &&
					e.getDestNode().equals(dest)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Gets a list of all the edges within this multigraph
	 * 
	 * @return the list of all edges
	 */
	public List<Edge> getEdges(){
		return edgeList;
	}
	
	/**
	 * Gets a list of all the nodes within this multigraph
	 * 
	 * @return the list of all nodes 
	 */
	public List<Node> getNodes(){
		return nodeList;
	}
	
	/**
	 * Checks whether this multigraph has an edge between the two given
	 * nodes (source & destination)
	 * 
	 * @param src the source node
	 * @param dest the destination node
	 * @return the edge between the src & dest, null if there is not an edge between
	 *          these src & dest
	 */
	public Edge haveEdge(Node src, Node dest){
		for(Edge e : edgeList){
			if(e.getSourceNode().equals(src) &&
					e.getDestNode().equals(dest)){
				return e;
			}
		}
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.MultiGraph#getSuccessors(com.mycompany.multigraph.Node)
	 */
	@Override
	public List<Node> getSuccessors(Node n){
		List<Node> successors = new ArrayList<Node>();
		
		for(Edge edge : edgeList){
			if(edge.getSourceNode() == n){
				successors.add(edge.getDestNode());
			}
		}
		return successors;
	}
	


}
