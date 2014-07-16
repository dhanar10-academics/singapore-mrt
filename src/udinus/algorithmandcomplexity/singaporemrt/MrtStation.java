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
    
    public MrtStation(String code, String name) {
        super(code);
        this.name = name;
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
}
