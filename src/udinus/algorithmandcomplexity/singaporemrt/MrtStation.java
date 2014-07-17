/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package udinus.algorithmandcomplexity.singaporemrt;

import udinus.algorithmandcomplexity.singaporemrt.graph.Node;

/**
 *
 * @author dhanar10
 */
public class MrtStation extends Node {
    private final String stationCode;
    private String stationName;
    
    public MrtStation(String stationCode, String stationName) {
        super(stationCode);
        this.stationCode = stationCode;
        this.stationName = stationName;
    }

    public String getStationCode() {
        return stationCode;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
    
    @Override
    public String toString() {
        return this.stationCode + " " + this.stationName;
    }
}
