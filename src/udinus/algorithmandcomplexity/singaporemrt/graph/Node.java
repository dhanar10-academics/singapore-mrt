/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package udinus.algorithmandcomplexity.singaporemrt.graph;

import java.util.ArrayList;

/**
 *
 * @author dhanar10
 */
public class Node {
    private final String name;
    private int distance;
    private Node previousNode;
    private final ArrayList<Edge> edges;
    
    public Node(String name) {
        this.name = name;
        this.distance = Integer.MAX_VALUE;
        this.previousNode = null;
        this.edges = new ArrayList<>();
    }

    public String getName() {
        return name;
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
    
    public ArrayList<Edge> getEdges() {
        return this.edges;
    }
}
