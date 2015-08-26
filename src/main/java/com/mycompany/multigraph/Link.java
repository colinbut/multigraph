/*
 * |-------------------------------------------------
 * | Copyright © 2008 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.multigraph;

/**
 * A link is a link between two nodes with in the multigraph
 * 
 * @author colin
 *
 */
public class Link implements Edge{
	
	private String label;
	private Node src = null;
	private Node dest = null;

	
	/**
	 * Constructor
	 * 
	 * @param src
	 * @param dest
	 * @param label
	 */
	public Link(Node src, Node dest, Object label){
		this.src = src;
		this.dest = dest;
		this.label = (String)label;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.Edge#getLabel()
	 */
	@Override
	public Object getLabel(){
		return label;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.Edge#setLabel(java.lang.Object)
	 */
	@Override
	public void setLabel(Object l){
		label = (String)l;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.Edge#setSourceNode(com.mycompany.multigraph.Node)
	 */
	@Override
	public void setSourceNode(Node n){
		src = n;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.Edge#setDestNode(com.mycompany.multigraph.Node)
	 */
	@Override
	public void setDestNode(Node n){
		dest = n;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.Edge#getSourceNode()
	 */
	@Override
	public Node getSourceNode(){
		return src;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.Edge#getDestNode()
	 */
	@Override
	public Node getDestNode(){
		return dest;
	}

}
