/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package udinus.algorithmandcomplexity.singaporemrt;

import udinus.algorithmandcomplexity.singaporemrt.graph.Graph;

/**
 *
 * @author dhanar10
 */
public class MrtMap extends Graph {
    public MrtStation createStation(String code, String name, 
            String coordinates) {
        MrtStation station = new MrtStation(code, name);
       
        this.addNode(station);
        
        return station;
    }
    
    public void createRailway(MrtStation fromMrtStation, 
            MrtStation toMrtDistance) {
        this.createEdge(fromMrtStation, toMrtDistance, 1); // TODO Calculate distance from station coordinates
    }
}
