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
public class MrtStation extends Node implements Comparable<MrtStation>{
    private String name;
    
    public MrtStation(String code, String name) {
        super(code);
        this.name = name;
    }

    public String getCode() {
        return super.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String stationName) {
        this.name = stationName;
    }
    
    @Override
    public String toString() {
        return this.getCode() + " " + this.getName();
    }

    @Override
    public int compareTo(MrtStation mrtStation) {
        return this.getName().compareTo(mrtStation.getName());
    }
}
