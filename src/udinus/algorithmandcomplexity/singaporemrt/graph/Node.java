/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package udinus.algorithmandcomplexity.singaporemrt.graph;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author dhanar10
 */
public class Node {
    private final String id;
    private int distance;
    private Node previousNode;
    private final ArrayList<Edge> edges;
    
    public Node(String id) {
        this.id = id;
        this.distance = Integer.MAX_VALUE;
        this.previousNode = null;
        this.edges = new ArrayList<>();
    }

    public String getId() {
        return id;
    }
    
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    
    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }
    
    public void addEdge(Edge edge) {
        this.edges.add(edge);
    }
    
    public Collection<Edge> getAllEdges() {
        return this.edges;
    }
    
    @Override
    public String toString() {
        return this.id;
    }
}
