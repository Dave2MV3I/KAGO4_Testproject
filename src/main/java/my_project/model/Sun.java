package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Sun extends GraphicalObject {

    private double sX, sY, sR;
    public Sun(double sX, double sY, double sR){
        this.sX = sX;
        this.sY = sY;
        this.sR = sR;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(255,253,208,100);
        drawTool.drawFilledCircle(sX,sY,sR*1.6);
        drawTool.setCurrentColor(252,209,42,150);
        drawTool.drawFilledCircle(sX,sY,sR*1.4);
        drawTool.setCurrentColor(252,209,42,100);
        drawTool.drawFilledCircle(sX,sY,sR);
        drawTool.setCurrentColor(249,166,2,100);
        drawTool.drawFilledCircle(sX,sY,sR*0.8);
    }

    @Override
    public void update(double dt){

    }
}
