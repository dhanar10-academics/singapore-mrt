/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package udinus.algorithmandcomplexity.singaporemrt.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import udinus.algorithmandcomplexity.singaporemrt.graph.Edge;
import udinus.algorithmandcomplexity.singaporemrt.graph.Graph;
import udinus.algorithmandcomplexity.singaporemrt.graph.Node;

/**
 *
 * @author dhanar10
 */
public class Dijkstra {
    public static ArrayList<Node> run(Graph graph, Node startNode, 
            Node endNode) throws Exception {
        if (startNode == null) {
            throw new Exception("startNode cannot be null!");
        }
        
        if (endNode == null) {
            throw new Exception("endNode cannot be null!");
        }
        
        startNode.setDistance(0);
        
        HashSet<Node> queue = new HashSet<>(graph.getAllNodes());
        
        while (!queue.isEmpty()) {
            Node currentNode = null;
            
            for (Node node : queue) {
                if (currentNode == null || 
                        node.getDistance() < currentNode.getDistance()) {
                    currentNode = node;
                }
            }
            
            System.out.println("* Current: " + currentNode + " (" +
                        (currentNode.getPreviousNode() != null ? 
                                "Previous: " + 
                                        currentNode.getPreviousNode() + 
                                        ", " :  "") +
                        "Distance: " + currentNode.getDistance() + ")");
            
            queue.remove(currentNode);
            
            // Shortcut for determining shortest path only
            if (currentNode == endNode) {
                break;
            }
            
            for (Edge edge : currentNode.getAllEdges()) {
                Node neighbouringNode = edge.getNeighbouringNode();
                int distance = edge.getDistance();
                
                int altDistance = currentNode.getDistance() + distance;
                                
                if (altDistance < neighbouringNode.getDistance()) {
                    neighbouringNode.setDistance(altDistance);
                    neighbouringNode.setPreviousNode(currentNode);
                }
                
                System.out.println("** Neighbour: " + neighbouringNode + " (" +
                        (neighbouringNode.getPreviousNode() != null ? 
                                "Previous: " + 
                                        neighbouringNode.getPreviousNode() + 
                                        ", " :  "") +
                        "Distance: " + neighbouringNode.getDistance() + ")");
            }
        }

        ArrayList<Node> shortestPath = new ArrayList<>();
        
        Node n = endNode;
        
        while (n.getPreviousNode() != null) {
            shortestPath.add(n);
            n = n.getPreviousNode();
        }
        
        shortestPath.add(startNode);
        
        Collections.reverse(shortestPath);
        
        return shortestPath;
    }
}
