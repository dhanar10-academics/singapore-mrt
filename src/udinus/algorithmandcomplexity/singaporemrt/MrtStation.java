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
    private String name;
    private String coordinates;
    
    public MrtStation(String code, String name, String coordinates) {
        super(code);
        this.name = name;
        this.coordinates = coordinates;
    }

    public String getCode() {
        return super.getName();
    }

    public void setCode(String code) {
        super.setName(code);
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }
}
