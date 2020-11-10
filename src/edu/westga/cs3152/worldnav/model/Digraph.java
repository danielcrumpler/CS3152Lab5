package edu.westga.cs3152.worldnav.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Class Digraph
 * 
 * @param <T> the type of a node value
 * 
 * @author CS3152
 * @version Fall 2020
 */
public class Digraph<T> {

	private Collection<Node<T>> collection;
	
	public Digraph() {
		this.collection = new ArrayList<Node<T>>();
	}
	
	/**
	 * Adds a node to the collection.
	 * 
	 * @pre node != null
	 * @post getNodes() += 1
	 * @return true if node is added successfully
	 * @param node the node to be added
	 */
	public boolean addNode(Node<T> node) {
		if (node == null) {
			throw new IllegalArgumentException("The node cannot be null.");
		}
		return this.collection.add(node);
	}
	
	/**
	 * Gets the nodes.
	 *
	 * @pre none
	 * @post none
	 * @return a collection containing all nodes of this digraph
	 */
	public Collection<Node<T>> getNodes() {
		return this.collection;
	}

	/**
	 * Gets the list of nodes that can be reached from the specified node through an
	 * edge.
	 *
	 * @pre none
	 * @post none
	 * @param node whose adjacent nodes is to be determined
	 * @return a collection containing all end nodes of outgoing edges from the
	 *         specified node
	 */
	public Collection<Node<T>> getAdjacentNodes(Node<T> node) {
		Collection<Node<T>> nodes = new ArrayList<Node<T>>();
		for (String currString : node.getConnections()) {
			for (Node<T> currNode : this.collection) {
				if (currNode.getLocation().getName().equals(currString)) {
					nodes.add(currNode);
				}
			}
		}
		return nodes;
	}
	
	/**
	 * Add adjacent node to an individual node.
	 * 
	 * @pre mainNode exists in collection
	 * @post none
	 * @param mainNode node that is gaining an adjacent node
	 * @param adjacentNode node to be added to the main node
	 * @return true if node is added successfully
	 */
	public boolean addAdjacentNode(String mainNode, String adjacentNode) {
		if (mainNode == null) {
			throw new IllegalArgumentException("The mainNode cannot be null.");
		}
		if (adjacentNode == null) {
			throw new IllegalArgumentException("The adjacentNode cannot be null.");
		}
		for (Node<T> currNode : this.collection) {
			if (currNode.getLocation().getName().equals(mainNode)) {
				return currNode.addConnection(adjacentNode);
			}
		}
		return false;
	}
}
