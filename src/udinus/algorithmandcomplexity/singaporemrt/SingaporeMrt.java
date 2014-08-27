/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package udinus.algorithmandcomplexity.singaporemrt;

import udinus.algorithmandcomplexity.singaporemrt.graph.Graph;
import udinus.algorithmandcomplexity.singaporemrt.graph.Node;
import udinus.algorithmandcomplexity.singaporemrt.algorithm.Dijkstra;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author dhanar10
 */
public class SingaporeMrt {
    private MrtMap mrtMap;

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {   
        SingaporeMrt singaporeMrt = new SingaporeMrt();
        
//      singaporeMrt.testCase();
//      System.exit(0);
        
        Object[] allMrtStations = singaporeMrt.mrtMap.getAllNodes().toArray();
        
        Arrays.sort(allMrtStations);
        
        Node fromStation = (Node) JOptionPane.showInputDialog(null, 
                "From Station", "Singapore MRT", JOptionPane.QUESTION_MESSAGE, 
                null, allMrtStations, allMrtStations[0]);
        
        if (fromStation == null) {
            System.exit(0);
        }
        
        Node toStation = (Node) JOptionPane.showInputDialog(null, 
                "To Station", "Singapore MRT", JOptionPane.QUESTION_MESSAGE, 
                null, allMrtStations, allMrtStations[0]);
        
        if (toStation == null) {
            System.exit(0);
        }
        
        System.out.println("Singapore MRT");
        System.out.println("");
        
        System.out.println("From Station: " + fromStation);
        System.out.println("To Station: " + toStation);
        System.out.println("");
        
        System.out.println("Running Djikstra ...");
        
        ArrayList<Node> shortestPath = Dijkstra.run(singaporeMrt.mrtMap, 
                fromStation, toStation);
        
        System.out.println();
        
        System.out.println("Shortest Path:");

        for (Node node : shortestPath) {
            System.out.println(node);
        }
        
        System.out.println();
        
        System.out.println("Shortest Path Distance: " + 
                shortestPath.get(shortestPath.size() - 1).getDistance() + 
                " minute(s)");
    }
    
    public SingaporeMrt() {
        this.mrtMap = new MrtMap();
        
        // MRT Stations
		
        // Circle Line
        MrtStation staBrasBasah = mrtMap.createStation("CC2", "Bras Basah");
        MrtStation staEsplanade = mrtMap.createStation("CC3", "Esplanade");
        MrtStation staNicollHighway = mrtMap.createStation("CC5", "Nicoll Highway");
        MrtStation staStadium = mrtMap.createStation("CC6", "Stadium");
        MrtStation staMountbatten = mrtMap.createStation("CC7", "Mountbatten");
        MrtStation staDakota = mrtMap.createStation("CC8", "Dakota");       
        MrtStation staPayaLebar = mrtMap.createStation("CC9/EW8", "Paya lebar");
        MrtStation staMacPherson = mrtMap.createStation("CC10", "MacPherson");
        MrtStation staTaiseng = mrtMap.createStation("CC11", "Tai Seng");
        MrtStation staBartley = mrtMap.createStation("CC12", "Bartley");
        MrtStation staSerangoon = mrtMap.createStation("CC13/NE12", "Serangoon");
        MrtStation staLorongChuan = mrtMap.createStation("CC14", "Lorong Chuan");
        MrtStation staBishan = mrtMap.createStation("CC15/NS17", "Bishan");
        MrtStation staMarymount = mrtMap.createStation("CC16", "Marymount");
        MrtStation staCaldecott = mrtMap.createStation("CC17", "Caldecott");
        // CC18 N/A
        MrtStation staBotanicGardens = mrtMap.createStation("CC19", "Botanic Gardens");
        MrtStation staFarrerRoad = mrtMap.createStation("CC20", "Farrer Road");
        MrtStation staHollandVillage = mrtMap.createStation("CC21", "Holland Village");
        MrtStation staBuonaVista = mrtMap.createStation("CC22/EW21", "Buona Vista");
        MrtStation staOneNorth = mrtMap.createStation("CC23", "One-north");
        MrtStation staKentRidge = mrtMap.createStation("CC24", "Kent Ridge");
        MrtStation staHawParVilla = mrtMap.createStation("CC25", "Haw Par Villa");
        MrtStation staPasirPanjang = mrtMap.createStation("CC26", "Pasir Panjang");
        MrtStation staLabradorPark = mrtMap.createStation("CC27", "Labrador Park");
        MrtStation staTelokBlangah = mrtMap.createStation("CC28", "Telok Blangah");
        MrtStation staHarbourFront = mrtMap.createStation("CC29/NE1", "HarbourFront"); 
        
        // Changi Airport
        MrtStation staExpo = mrtMap.createStation("CG1", "Expo");
        MrtStation staChangiAirport = mrtMap.createStation("CG2", "Changi Airport");

        // Downtown Line
        MrtStation staBugis = mrtMap.createStation("DT14/EW12", "Bugis");
        MrtStation staPromenade = mrtMap.createStation("DT15/CC4", "Promenade");
        MrtStation staBayfront = mrtMap.createStation("DT16/CE1", "Bayfront");
        MrtStation staDowntown = mrtMap.createStation("DT17", "Downtown");
        MrtStation staTelokAyer = mrtMap.createStation("DT18", "Telok Ayer");

        // East West Line
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
        MrtStation staCityHall = mrtMap.createStation("EW13/NS25", "City Hall");
        MrtStation staRafflesPlace = mrtMap.createStation("EW14/NS26", "Raffles Place");
        MrtStation staTanjongPagar = mrtMap.createStation("EW15", "Tanjong Pagar");
        MrtStation staOutramPark = mrtMap.createStation("EW16/NE3", "Outram Park");
        MrtStation staTiongBahru = mrtMap.createStation("EW17", "Tiong Bahru");
        MrtStation staRedHill = mrtMap.createStation("EW18", "RedHill");
        MrtStation staQueenstown = mrtMap.createStation("EW19", "Queenstown");
        MrtStation staCommonwealth = mrtMap.createStation("EW20", "Commonwealth");
        MrtStation staDover = mrtMap.createStation("EW22", "Dover");
        MrtStation staClementi = mrtMap.createStation("EW23", "Clementi");
        MrtStation staJurongEast = mrtMap.createStation("EW24/NS1", "Jurong East");
        MrtStation staChineseGarden = mrtMap.createStation("EW25", "Chinese Garden");
        MrtStation staLakeSide = mrtMap.createStation("EW26", "Lake Side");
        MrtStation staBoonLay = mrtMap.createStation("EW27", "Boon Lay");
        MrtStation staPioneer = mrtMap.createStation("EW28", "Pioneer");
        MrtStation staJooKoon = mrtMap.createStation("EW29", "Joo Koon");
		
        // North East Line
        MrtStation staChinatown = mrtMap.createStation("DT19/NE4", "Chinatown");
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
		
        // North South Line
        MrtStation staBukitBatok = mrtMap.createStation("NS2", "Bukit Batok");
        MrtStation staBukitGombak = mrtMap.createStation("NS3", "Bukit Gombak");
        MrtStation staChoaChuKang = mrtMap.createStation("NS4", "Choa Chu Kang");
        MrtStation staYewTee = mrtMap.createStation("NS5", "Yew Tee");
        MrtStation staKranji = mrtMap.createStation("NS6", "Kranji");
        MrtStation staMarsiling = mrtMap.createStation("NS8", "Marsiling");
        MrtStation staWoodlands = mrtMap.createStation("NS9", "Woodlands"); 
        MrtStation staAdmiralty = mrtMap.createStation("NS10", "Admiralty");
        MrtStation staSembawang = mrtMap.createStation("NS11", "Sembawang");
        // NS12 N/A
        MrtStation staYishun = mrtMap.createStation("NS13", "Yishun");
        MrtStation staKhatib = mrtMap.createStation("NS14", "Khatib");
        MrtStation staYioChuKang = mrtMap.createStation("NS15", "Yio Chu Kang");
        MrtStation staAngMoKio = mrtMap.createStation("NS16", "Ang Mo Kio");
        MrtStation staBraddell = mrtMap.createStation("NS18", "Braddell");
        MrtStation staToaPayoh = mrtMap.createStation("NS19", "Toa Payoh");
        MrtStation staNovena = mrtMap.createStation("NS20", "Novena");
        MrtStation staNewton = mrtMap.createStation("NS21", "Newton"); 
        MrtStation staOrchard = mrtMap.createStation("NS22", "Orchard");
        MrtStation staSomerset = mrtMap.createStation("NS23", "Somerset");
        MrtStation staMarinaBay = mrtMap.createStation("NS27/CE2", "Marina Bay");
        
        // MRT Railways

        // Circle Line
        mrtMap.createRailway(staDhobyGhaut, staBrasBasah, 2 /*minutes*/);
        mrtMap.createRailway(staBrasBasah, staEsplanade, 2 /*minutes*/);
        mrtMap.createRailway(staEsplanade, staPromenade, 1 /*minutes*/);
        mrtMap.createRailway(staPromenade, staNicollHighway, 2 /*minutes*/);
        mrtMap.createRailway(staNicollHighway, staStadium, 2 /*minutes*/);
        mrtMap.createRailway(staStadium, staMountbatten, 2 /*minutes*/);
        mrtMap.createRailway(staMountbatten, staDakota, 2 /*minutes*/);
        mrtMap.createRailway(staDakota, staPayaLebar, 2 /*minutes*/);
        mrtMap.createRailway(staPayaLebar, staMacPherson, 2 /*minutes*/);
        mrtMap.createRailway(staMacPherson, staTaiseng, 2 /*minutes*/);
        mrtMap.createRailway(staTaiseng, staBartley, 2 /*minutes*/);
        mrtMap.createRailway(staBartley, staSerangoon, 3 /*minutes*/);
        mrtMap.createRailway(staSerangoon, staLorongChuan, 2 /*minutes*/);
        mrtMap.createRailway(staLorongChuan, staBishan, 2 /*minutes*/);
        mrtMap.createRailway(staBishan, staMarymount, 3 /*minutes*/);
        mrtMap.createRailway(staMarymount, staCaldecott, 2 /*minutes*/);
        mrtMap.createRailway(staCaldecott, staBotanicGardens, 5 /*minutes*/);
        mrtMap.createRailway(staBotanicGardens, staFarrerRoad, 2 /*minutes*/);
        mrtMap.createRailway(staFarrerRoad, staHollandVillage, 3 /*minutes*/);
        mrtMap.createRailway(staHollandVillage, staBuonaVista, 2 /*minutes*/);
        mrtMap.createRailway(staBuonaVista, staOneNorth, 2 /*minutes*/);
        mrtMap.createRailway(staOneNorth, staKentRidge, 2 /*minutes*/);
        mrtMap.createRailway(staKentRidge, staHawParVilla, 2 /*minutes*/);
        mrtMap.createRailway(staHawParVilla, staPasirPanjang, 2 /*minutes*/);
        mrtMap.createRailway(staPasirPanjang, staLabradorPark, 3 /*minutes*/);
        mrtMap.createRailway(staLabradorPark, staTelokBlangah, 3 /*minutes*/);
        mrtMap.createRailway(staTelokBlangah, staHarbourFront, 3 /*minutes*/);
        mrtMap.createRailway(staMarinaBay, staBayfront, 2 /*minutes*/);

        // Downtown Line
        mrtMap.createRailway(staBugis, staPromenade, 2 /*minutes*/);
        mrtMap.createRailway(staPromenade, staBayfront, 2 /*minutes*/);
        mrtMap.createRailway(staBayfront, staDowntown, 2 /*minutes*/);
        mrtMap.createRailway(staDowntown, staTelokAyer, 2 /*minutes*/);
        mrtMap.createRailway(staTelokAyer, staChinatown, 2 /*minutes*/);

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
        mrtMap.createRailway(staTanahMerah, staExpo, 3 /*minutes*/);
        mrtMap.createRailway(staExpo, staChangiAirport, 5 /*minutes*/);
        
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
        mrtMap.createRailway(staJurongEast, staBukitBatok, 3 /*minutes*/);
        mrtMap.createRailway(staBukitBatok, staBukitGombak, 2 /*minutes*/);
        mrtMap.createRailway(staBukitGombak, staChoaChuKang, 4 /*minutes*/);
        mrtMap.createRailway(staChoaChuKang, staYewTee, 2 /*minutes*/);
        mrtMap.createRailway(staYewTee, staKranji, 5 /*minutes*/);
        mrtMap.createRailway(staKranji, staMarsiling, 2 /*minutes*/);
        mrtMap.createRailway(staMarsiling, staWoodlands, 3 /*minutes*/);
        mrtMap.createRailway(staWoodlands, staAdmiralty, 2 /*minutes*/);
        mrtMap.createRailway(staAdmiralty, staSembawang, 3 /*minutes*/);
        mrtMap.createRailway(staSembawang, staYishun, 4 /*minutes*/);
        mrtMap.createRailway(staYishun, staKhatib, 2 /*minutes*/);
        mrtMap.createRailway(staKhatib, staYioChuKang, 6 /*minutes*/);
        mrtMap.createRailway(staYioChuKang, staAngMoKio, 2 /*minutes*/);
        mrtMap.createRailway(staAngMoKio, staBishan, 2 /*minutes*/);
        mrtMap.createRailway(staBishan, staBraddell, 2 /*minutes*/);
        mrtMap.createRailway(staBraddell, staToaPayoh, 2 /*minutes*/);
        mrtMap.createRailway(staToaPayoh, staNovena, 2 /*minutes*/);
        mrtMap.createRailway(staNovena, staNewton, 2 /*minutes*/);
        mrtMap.createRailway(staNewton, staOrchard, 2 /*minutes*/);
        mrtMap.createRailway(staOrchard, staSomerset, 2 /*minutes*/);
        mrtMap.createRailway(staSomerset, staDhobyGhaut, 1 /*minutes*/);
        mrtMap.createRailway(staDhobyGhaut, staCityHall, 2 /*minutes*/);
        mrtMap.createRailway(staRafflesPlace, staMarinaBay, 2 /*minutes*/);
        
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
        
        ArrayList<Node> shortestPath = Dijkstra.run(graph, fromNode, toNode);
        
        System.out.println();
        
        System.out.println("Shortest Path:");
        
        for (Node node : shortestPath) {
            System.out.println(node);
        }
        
        System.out.println();
        
        System.out.println("Shortest Path Distance: " + 
                shortestPath.get(shortestPath.size() - 1).getDistance());
    }
}
