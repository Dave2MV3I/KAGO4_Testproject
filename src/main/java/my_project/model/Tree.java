package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Tree extends GraphicalObject {

    private double tX, tY, tW, tH, ttW, ttH;
    private int r, g, b;

    /**
     * Dies ist meine Methode zum Zeichnen von Bäumen. Die Namen der Parameter sind fies.
     * @param tX Baum X-Koordinate
     * @param tY Marmelade
     * @param tW Kuchen
     * @param tH Sahne
     * @param ttW Dies
     * @param ttH Das
     */
    public Tree(double tX, double tY, double tW, double tH, double ttW, double ttH){ // Trees X and Y position, width and height, treetops width and height
        this.tX = tX;
        this.tY = tY;
        this.tW = tW;
        this.tH = tH;
        this.ttW = ttW;
        this.ttH = ttH;
        this.r = 80;  // Standardfarbe für die Baumkrone
        this.g = 200;
        this.b = 120;
    }

    @Override
    public void draw(DrawTool drawTool) {
        double ttX = tX-(ttW-tW)/2;
        drawTool.setCurrentColor(110, 38, 14,255);
        drawTool.drawFilledRectangle(tX,tY,tW,tH);
        drawTool.setCurrentColor(r,g,b,200);
        drawTool.drawFilledRectangle(ttX, tY-ttH, ttW, ttH);

        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawLine((ttX+ttW)-(ttW/5), tY, (ttX+ttW)-(ttW/5), tY+ttH/15);
        drawTool.setCurrentColor(Color.RED);
        drawTool.drawFilledCircle((ttX+ttW)-(ttW/5), tY+ttH/20, ttW/15);
    }

    @Override
    public void update(double dt){

    }

    public void setTreeColour(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }
}
