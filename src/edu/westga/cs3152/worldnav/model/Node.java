package edu.westga.cs3152.worldnav.model;

import java.util.ArrayList;

/**
 * The Class Node
 * 
 * @param <T> the type of a node value
 * 
 * @author CS3152
 * @version Fall 2020
 */
public class Node<T> {
	private T value;
	private ArrayList<Node<T>> connections;

	/**
	 * Gets the value of this node.
	 *
	 * @pre none
	 * @post none
	 * @return the value of this node
	 */
	public T getValue() {
		return this.value;
	}

	/**
	 * Gets the connections to the node.
	 * 
	 * @pre none
	 * @post none
	 * @return the collection of adjacent nodes
	 */
	public ArrayList<Node<T>> getConnections() {
		return this.connections;
	}

	/**
	 * Adds a node as a connection to the node
	 * 
	 * @pre node != null
	 * @post getConnections() += 1
	 * @return true if added successfully
	 * @param node node to be added
	 */
	public boolean addConnection(Node<T> node) {
		return this.connections.add(node);
	}
}
