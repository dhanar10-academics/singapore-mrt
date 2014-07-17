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
public class Djikstra {
    public static ArrayList<Node> run(Graph graph, Node startNode, 
            Node endNode) {
        System.out.println("Start Node: " + startNode.getName());
        System.out.println("End Node: " + endNode.getName());
        
        System.out.println("");
        
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
            
            System.out.println("Current: " + currentNode.getName() + 
                    ", " + "Distance: " + currentNode.getDistance());
            
            queue.remove(currentNode);
            
            for (Edge edge : currentNode.getAllEdges()) {
                Node neighbour = edge.getNeighbouringNode();
                int distance = edge.getDistance();
                
                int altDistance = currentNode.getDistance() + distance;
                                
                if (altDistance < neighbour.getDistance()) {
                    neighbour.setDistance(altDistance);
                    neighbour.setPreviousNode(currentNode);
                }
                
                System.out.println("Neighbour: " + neighbour.getName() + 
                        ", " + "Distance: " + neighbour.getDistance() + 
                        (neighbour.getPreviousNode() != null ? 
                                ", " + "Previous: " + 
                                neighbour.getPreviousNode().getName() : ""));
            }
        }
        
        System.out.println("");
        
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
