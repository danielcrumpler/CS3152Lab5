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
	private Location location;
	private ArrayList<String> connections;

	/**
	 * Instantiates a new node
	 * 
	 * @pre none
	 * @post getLocation() == location
	 * @param location the location
	 */
	public Node(Location location) {
		this.location = location;
		this.connections = new ArrayList<String>();
	}
	
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
	public ArrayList<String> getConnections() {
		return this.connections;
	}

	/**
	 * Adds a node as a connection to the node
	 * 
	 * @pre node != null
	 * @post getConnections() += 1
	 * @return true if added successfully
	 * @param nodeName node to be added
	 */
	public boolean addConnection(String nodeName) {
		return this.connections.add(nodeName);
	}

	/**
	 * Gets the location
	 * 
	 * @return the location
	 */
	public Location getLocation() {
		return this.location;
	}
}
