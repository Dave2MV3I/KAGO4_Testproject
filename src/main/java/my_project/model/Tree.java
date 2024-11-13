package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Tree extends GraphicalObject {

    private double tX, tY, tW, tH, ttW, ttH;
    public Tree(double tX, double tY, double tW, double tH, double ttW, double ttH){ // Trees X and Y position, width and height, treetops width and height
        this.tX = tX;
        this.tY = tY;
        this.tW = tW;
        this.tH = tH;
        this.ttW = ttW;
        this.ttH = ttH;
    }

    @Override
    public void draw(DrawTool drawTool) {

    }

    @Override
    public void update(double dt){

    }
}
