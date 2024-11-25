package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Landscape extends GraphicalObject {

    private int w, h, r, g, b;

    // Referenzen
    private Sun mySun;

    public Landscape(int x, int y, int w, int h, int r, int g, int b){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void draw(DrawTool drawTool) {
        //drawTool.setCurrentColor(173,216,230,240);
        //drawTool.drawFilledRectangle(0,0,1000,350);

        //drawTool.setCurrentColor(144,238,144,200);
        //drawTool.drawFilledRectangle(0,350,1000,250);

        drawTool.setCurrentColor(r,g,b,255);
        drawTool.drawFilledRectangle(x,y,w,h);
    }

    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }

    public void setColour(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void setMySun(Sun sun) {
        mySun = sun;
    }
}
