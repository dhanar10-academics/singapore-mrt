/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package udinus.algorithmandcomplexity.singaporemrt;

import udinus.algorithmandcomplexity.singaporemrt.graph.Graph;
import udinus.algorithmandcomplexity.singaporemrt.graph.Node;
import udinus.algorithmandcomplexity.singaporemrt.algorithm.Djikstra;
import java.util.ArrayList;

/**
 *
 * @author dhanar10
 */
public class SingaporeMrt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SingaporeMrt singaporeMrt = new SingaporeMrt();
        singaporeMrt.testCase();
        
        //MrtMap mrtMap = new MrtMap();
        
        //mrtMap.createStation("NE1", "HarbourFront", "1°15′55″N 103°49′20″E");
        // TODO ...
        //mrtMap.createStation("NE11", "Woodleigh", "1°20′21″N 103°52′15″E");
        // TODO ...
        //mrtMap.createStation("NE17", "Punggol", "1°24′19″N 103°54′08″E");
    }
    
    public void testCase() {
        Graph graph = new Graph();
        
        Node nodeA = graph.createNode("A");
        Node nodeB = graph.createNode("B");
        Node nodeC = graph.createNode("C");
        Node nodeD = graph.createNode("D");
        Node nodeE = graph.createNode("E");
        Node nodeF = graph.createNode("F");
        Node nodeG = graph.createNode("G");
        Node nodeH = graph.createNode("H");
        Node nodeI = graph.createNode("I");
        Node nodeJ = graph.createNode("J");
        Node nodeK = graph.createNode("K");
        
        graph.createEdge(nodeA, nodeB, 4);
        graph.createEdge(nodeB, nodeC, 22);
        graph.createEdge(nodeB, nodeE, 2);
        graph.createEdge(nodeC, nodeD, 11);
        graph.createEdge(nodeC, nodeF, 1);
        graph.createEdge(nodeC, nodeG, 1);
        graph.createEdge(nodeE, nodeF, 4);
        graph.createEdge(nodeE, nodeH, 6);
        graph.createEdge(nodeF, nodeG, 1);
        graph.createEdge(nodeF, nodeH, 1);
        graph.createEdge(nodeG, nodeI, 1);
        graph.createEdge(nodeH, nodeI, 1);
        graph.createEdge(nodeH, nodeJ, 4);
        graph.createEdge(nodeI, nodeK, 1);
        
        ArrayList<Node> shortestPath = Djikstra.run(graph, nodeI, nodeA);
        
        System.out.print("Shortest Path: ");
        
        for (Node node : shortestPath) {
            System.out.print(node.getName() + " ");
        }
        
        System.out.println("");
    }
}
