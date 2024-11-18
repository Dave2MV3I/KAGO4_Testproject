package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

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
        double ttX = tX-(ttW-tW)/2;
        drawTool.setCurrentColor(110, 38, 14,255);
        drawTool.drawFilledRectangle(tX,tY,tW,tH);
        drawTool.setCurrentColor(80, 200, 120,190);
        drawTool.drawFilledRectangle(ttX, tY-ttH, ttW, ttH);

        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawLine((ttX+ttW)-(ttW/5), tY, (ttX+ttW)-(ttW/5), tY+ttH/15);
        drawTool.setCurrentColor(Color.RED);
        drawTool.drawFilledCircle((ttX+ttW)-(ttW/5), tY+ttH/20, ttW/15);
    }

    @Override
    public void update(double dt){

    }
}
