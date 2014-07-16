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
        //SingaporeMrt singaporeMrt = new SingaporeMrt();
        //singaporeMrt.testCase();
        
        MrtMap mrtMap = new MrtMap();
        
        // MRT Stations
        MrtStation staHarbourFront = mrtMap.createStation("CC29/NE1", "HarbourFront");
        MrtStation staOutramPark = mrtMap.createStation("EW16/NE3", "Outram Park");
        MrtStation staChinatown = mrtMap.createStation("NE4", "Chinatown");
        MrtStation staClarkeQuay = mrtMap.createStation("NE5", "Clarke Quay");
        MrtStation staDhobyGhaut = mrtMap.createStation("CC1/NS24/NE6", "Dhoby Ghaut");
        MrtStation staLittleIndia = mrtMap.createStation("NE7", "Little India");
        MrtStation staFarrerPark = mrtMap.createStation("NE8", "Farrer Park");
        MrtStation staBoonKeng = mrtMap.createStation("NE9", "Boon Keng");
        MrtStation staPotongPasir = mrtMap.createStation("NE10", "Potong Pasir");
        MrtStation staWoodleigh = mrtMap.createStation("NE11", "Woodleigh");
        MrtStation staSerangoon = mrtMap.createStation("CC13/NE12", "Serangoon");
        MrtStation staKovan = mrtMap.createStation("NE13", "Kovan");
        MrtStation staHougang = mrtMap.createStation("NE14", "Hougang");
        MrtStation staBuangkok = mrtMap.createStation("NE15", "Buangkok");
        MrtStation staSengkang = mrtMap.createStation("NE16", "Sengkang");
        MrtStation staPunggol = mrtMap.createStation("NE17", "Punggol");
        
        // North East Line
        mrtMap.createRailway(staHarbourFront, staOutramPark, 3 /*minutes*/);
        mrtMap.createRailway(staOutramPark, staChinatown, 2 /*minutes*/);
        mrtMap.createRailway(staChinatown, staClarkeQuay, 2 /*minutes*/);
        mrtMap.createRailway(staClarkeQuay, staDhobyGhaut, 2 /*minutes*/);
        mrtMap.createRailway(staDhobyGhaut, staLittleIndia, 2 /*minutes*/);
        mrtMap.createRailway(staLittleIndia, staFarrerPark, 2 /*minutes*/);
        mrtMap.createRailway(staFarrerPark, staBoonKeng, 2 /*minutes*/);
        mrtMap.createRailway(staBoonKeng, staPotongPasir, 2 /*minutes*/);
        mrtMap.createRailway(staPotongPasir, staWoodleigh, 2 /*minutes*/);
        mrtMap.createRailway(staWoodleigh, staSerangoon, 2 /*minutes*/);
        mrtMap.createRailway(staSerangoon, staKovan, 3 /*minutes*/);
        mrtMap.createRailway(staKovan, staHougang, 2 /*minutes*/);
        mrtMap.createRailway(staHougang, staBuangkok, 2 /*minutes*/);
        mrtMap.createRailway(staBuangkok, staSengkang, 3 /*minutes*/);
        mrtMap.createRailway(staSengkang, staPunggol, 1 /*minutes*/);
        
        ArrayList<Node> shortestPath = Djikstra.run(mrtMap, staHarbourFront, staPotongPasir);
        
        for (Node node : shortestPath) {
            MrtStation station = (MrtStation) node;
            
            System.out.println(station.getName());
        }
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
