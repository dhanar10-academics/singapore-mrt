/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package udinus.algorithmandcomplexity.singaporemrt.graph;

/**
 *
 * @author dhanar10
 */
public class Edge {
    private Node neighbouringNode;
    private int distance;
    
    public Edge(Node neighbouringNode, int distance) {
        this.neighbouringNode = neighbouringNode;
        this.distance = distance;
    }

    public Node getNeighbouringNode() {
        return neighbouringNode;
    }

    public void setNeigbouringNode(Node node) {
        this.neighbouringNode = node;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
