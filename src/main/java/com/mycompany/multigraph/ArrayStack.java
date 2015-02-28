package com.mycompany.multigraph;


/**
 * An array-based implementation of the Stack interface. This stack is 
 * implemented using an internal array as storage to hold the list of 
 * elements
 * 
 * @author colin
 *
 */
public class ArrayStack implements Stack {
	
	private int max;
	private Object data[];
	private int head;
	private int tail;
	
	/**
	 * Constructor
	 * 
	 * @param s size of the Stack
	 */
	public ArrayStack(int s){
		max = s;
		data = new Object[max];
		head = -1;
		tail = -1;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.Stack#sEmpty()
	 */
	@Override
	public boolean sEmpty(){
		return (tail < 0);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.Stack#sFull()
	 */
	@Override
	public boolean sFull(){
		return (head == max);
    }
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.Stack#sPush(java.lang.Object)
	 */
	@Override
	public void sPush(Object x){
//		if(sEmpty()) {
//			head++;
//			tail++;
//			data[head] = x;
//		}
//		else if(!sFull()) {
//			head++;
//			data[head] = x;
//		}
		
		if(!sFull()){
			head++;
			data[head] = x;
		}
		
		if(sEmpty())
			tail++;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.Stack#sPop()
	 */
	@Override
	public Object sPop(){
		Object temp = ' ';
		if(!sEmpty()) {
			 temp = data[head];
			 head--;
			if(head == -1) {
				 tail--;
			 }
		}
		return temp;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.multigraph.Stack#sPeek()
	 */
	@Override
	public Object sPeek(){
		return data[head];
	}

}

