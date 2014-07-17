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
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
//        SingaporeMrt singaporeMrt = new SingaporeMrt();
//        singaporeMrt.testCase();
//        System.exit(0);
        
        System.out.println("Singapore MRT");
        System.out.println("");

        MrtMap mrtMap = new MrtMap();
        
        // MRT Stations
        // TODO CC
        MrtStation staPayaLebar = mrtMap.createStation("CC9/EW8", "Paya lebar");
        MrtStation staMacPherson = mrtMap.createStation("CC10", "MacPherson");
        MrtStation staTaiseng = mrtMap.createStation("CC11", "Tai seng");
        MrtStation staBartley = mrtMap.createStation("CC12", "Bartley");
        MrtStation staSerangoon = mrtMap.createStation("CC13/NE12", "Serangoon");
        // TODO CG
        // TODO DT
        MrtStation staPasirRis = mrtMap.createStation("EW1", "Pasir Ris");
        MrtStation staTampines = mrtMap.createStation("EW2", "Tampines");
        MrtStation staSimei = mrtMap.createStation("EW3", "Simei");
        MrtStation staTanahMerah = mrtMap.createStation("EW4", "Tanah Merah");
        MrtStation staBedok = mrtMap.createStation("EW5", "Bedok");
        MrtStation staKembangan = mrtMap.createStation("EW6", "Kembangan");
        MrtStation staEunos = mrtMap.createStation("EW7", "Eunos");
        MrtStation staAljunied = mrtMap.createStation("EW9", "Aljunied");
        MrtStation staKallang = mrtMap.createStation("EW10", "Kallang");
        MrtStation staLavender = mrtMap.createStation("EW11", "Lavender");
        MrtStation staBugis = mrtMap.createStation("DT14/EW12", "Bugis");
        MrtStation staCityHall = mrtMap.createStation("EW13/NS25", "City Hall");
        MrtStation staRafflesPlace = mrtMap.createStation("EW14/NS26", "Raffles Place");
        MrtStation staTanjongPagar = mrtMap.createStation("EW15", "Tanjong Pagar");
        MrtStation staOutramPark = mrtMap.createStation("EW16/NE3", "Outram Park");
        MrtStation staTiongBahru = mrtMap.createStation("EW17", "Tiong Bahru");
        MrtStation staRedHill = mrtMap.createStation("EW18", "RedHill");
        MrtStation staQueenstown = mrtMap.createStation("EW19", "Queenstown");
        MrtStation staCommonwealth = mrtMap.createStation("EW20", "Commonwealth");
        MrtStation staBuonaVista = mrtMap.createStation("CC22/EW21", "Buona Vista");
        MrtStation staDover = mrtMap.createStation("EW22", "Dover");
        MrtStation staClementi = mrtMap.createStation("EW23", "Clementi");
        MrtStation staJurongEast = mrtMap.createStation("EW24/NS1", "Jurong East");
        MrtStation staChineseGarden = mrtMap.createStation("EW25", "Chinese Garden");
        MrtStation staLakeSide = mrtMap.createStation("EW26", "Lake Side");
        MrtStation staBoonLay = mrtMap.createStation("EW27", "Boon Lay");
        MrtStation staPioneer = mrtMap.createStation("EW28", "Pioneer");
        MrtStation staJooKoon = mrtMap.createStation("EW29", "Joo Koon");
        MrtStation staHarbourFront = mrtMap.createStation("CC29/NE1", "HarbourFront");
        MrtStation staChinatown = mrtMap.createStation("NE4", "Chinatown");
        MrtStation staClarkeQuay = mrtMap.createStation("NE5", "Clarke Quay");
        MrtStation staDhobyGhaut = mrtMap.createStation("CC1/NS24/NE6", "Dhoby Ghaut");
        MrtStation staLittleIndia = mrtMap.createStation("NE7", "Little India");
        MrtStation staFarrerPark = mrtMap.createStation("NE8", "Farrer Park");
        MrtStation staBoonKeng = mrtMap.createStation("NE9", "Boon Keng");
        MrtStation staPotongPasir = mrtMap.createStation("NE10", "Potong Pasir");
        MrtStation staWoodleigh = mrtMap.createStation("NE11", "Woodleigh");
        MrtStation staKovan = mrtMap.createStation("NE13", "Kovan");
        MrtStation staHougang = mrtMap.createStation("NE14", "Hougang");
        MrtStation staBuangkok = mrtMap.createStation("NE15", "Buangkok");
        MrtStation staSengkang = mrtMap.createStation("NE16", "Sengkang");
        MrtStation staPunggol = mrtMap.createStation("NE17", "Punggol");
        // TODO NS
        
        // Circle Line
        mrtMap.createRailway(staPayaLebar, staMacPherson, 2 /*minutes*/);
        mrtMap.createRailway(staMacPherson, staTaiseng, 2 /*minutes*/);
        mrtMap.createRailway(staTaiseng, staBartley, 2 /*minutes*/);
        mrtMap.createRailway(staBartley, staSerangoon, 3 /*minutes*/);
        // TODO ...
        
        // Downtown Line
        // TODO ...
        
        // East West Line
        mrtMap.createRailway(staPasirRis, staTampines, 2 /*minutes*/);
        mrtMap.createRailway(staTampines, staSimei, 3 /*minutes*/);
        mrtMap.createRailway(staSimei, staTanahMerah, 3 /*minutes*/);
        mrtMap.createRailway(staTanahMerah, staBedok, 3 /*minutes*/);
        mrtMap.createRailway(staBedok, staKembangan, 2 /*minutes*/);
        mrtMap.createRailway(staKembangan, staEunos, 2 /*minutes*/);
        mrtMap.createRailway(staEunos, staPayaLebar, 2 /*minutes*/);
        mrtMap.createRailway(staPayaLebar, staAljunied, 2 /*minutes*/);
        mrtMap.createRailway(staAljunied, staKallang, 2 /*minutes*/);
        mrtMap.createRailway(staKallang, staLavender, 2 /*minutes*/);
        mrtMap.createRailway(staLavender, staBugis, 2 /*minutes*/);
        mrtMap.createRailway(staBugis, staCityHall, 2 /*minutes*/);
        mrtMap.createRailway(staCityHall, staRafflesPlace, 2 /*minutes*/);
        mrtMap.createRailway(staRafflesPlace, staTanjongPagar, 2 /*minutes*/);
        mrtMap.createRailway(staTanjongPagar, staOutramPark, 2 /*minutes*/);
        mrtMap.createRailway(staOutramPark, staTiongBahru, 2 /*minutes*/);
        mrtMap.createRailway(staTiongBahru, staRedHill, 2 /*minutes*/);
        mrtMap.createRailway(staRedHill, staQueenstown, 2 /*minutes*/);
        mrtMap.createRailway(staQueenstown, staCommonwealth, 2 /*minutes*/);
        mrtMap.createRailway(staCommonwealth, staBuonaVista, 2 /*minutes*/);
        mrtMap.createRailway(staBuonaVista, staDover, 2 /*minutes*/);
        mrtMap.createRailway(staDover, staClementi, 3 /*minutes*/);
        mrtMap.createRailway(staClementi, staJurongEast, 4 /*minutes*/);
        mrtMap.createRailway(staJurongEast, staChineseGarden, 2 /*minutes*/);
        mrtMap.createRailway(staChineseGarden, staLakeSide, 2 /*minutes*/);
        mrtMap.createRailway(staLakeSide, staBoonLay, 3 /*minutes*/);
        mrtMap.createRailway(staBoonLay, staPioneer, 2 /*minutes*/);
        mrtMap.createRailway(staPioneer, staJooKoon, 2 /*minutes*/);
        // TODO CG
        
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
        
        // North South Line
        // TODO ...
        
        Node fromStation = staWoodleigh;
        Node toStation = staTanahMerah;
        
        System.out.println("From Station: " + fromStation);
        System.out.println("To Station: " + toStation);
        System.out.println("");
        
        System.out.println("Running Djikstra ...");
        
        ArrayList<Node> shortestPath = Djikstra.run(mrtMap, fromStation, 
                toStation);
        
        System.out.println();
        
        System.out.println("Shortest Path:");

        for (Node node : shortestPath) {
            System.out.println(node);
        }
        
        System.out.println();
        
        System.out.println("Shortest Distance: " + 
                shortestPath.get(shortestPath.size() - 1).getDistance() + 
                " minute(s)");
    }
    
    public void testCase() throws Exception {
        System.out.println("Test Case");
        System.out.println("");
        
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
        
        Node fromNode = nodeI;
        Node toNode = nodeA;
        
        System.out.println("From Node: " + fromNode);
        System.out.println("To Node: " + toNode);
        System.out.println();
        
        System.out.println("Running Djikstra ...");
        
        ArrayList<Node> shortestPath = Djikstra.run(graph, fromNode, toNode);
        
        System.out.println();
        
        System.out.println("Shortest Path:");
        
        for (Node node : shortestPath) {
            System.out.println(node);
        }
        
        System.out.println();
        
        System.out.println("Shortest Distance: " + 
                shortestPath.get(shortestPath.size() - 1).getDistance());
    }
}
