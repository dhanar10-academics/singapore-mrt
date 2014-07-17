/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package udinus.algorithmandcomplexity.singaporemrt.graph;

import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author dhanar10
 */
public class Graph {
    private final HashMap<String,Node> nodes;
    
    public Graph() {
        this.nodes = new HashMap<>();
    }
    
    public Node createNode(String name) throws Exception {
        Node node = new Node(name);
        
        this.addNode(node);
        
        return node;
    }
    
    public void addNode(Node node) {
        if (this.nodes.containsKey(node.getName())) {
            throw new UnsupportedOperationException("Replacing existing node "
                    + "is currently not supported.");
        }
        
        this.nodes.put(node.getName(), node);
    }
    
    public Collection<Node> getAllNodes() {
        return this.nodes.values();
    }
    
    public void createEdge(Node fromNode, Node toNode, int distance) {
        this.createEdge(fromNode, toNode, distance, true);
    }
    
    public void createEdge(Node fromNode, Node toNode, int distance, 
            boolean viceversa) {
        fromNode.addEdge(new Edge(toNode, distance));
        
        if (viceversa) {
            toNode.addEdge(new Edge(fromNode, distance));
        }
    } 
}
