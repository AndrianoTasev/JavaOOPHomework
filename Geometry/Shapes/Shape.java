package Geometry.Shapes;

import Geometry.Interfaces.IVertex;

import java.util.ArrayList;

/**
 * Created by Andriano on 20.9.2015 ã..
 */
public abstract class Shape {
    private ArrayList<IVertex> vertices;

    protected Shape(){
        this.vertices = new ArrayList<>();
    }
}
