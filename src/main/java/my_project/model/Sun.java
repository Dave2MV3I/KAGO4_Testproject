package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Sun extends GraphicalObject {

    private double sX, sY, sR, x1, x2;
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
        x1 = 0;
        x2 = 1000;
        //x = x+dt;
        //sY = (x-x1)*(x-x2)*dt;
        if (sX > 0 && sX < 1000){
            sX = sX-dt*50;
            sY = 600+0.002*(sX-x1)*(sX-x2);
        }

        System.out.println(sX);
        System.out.println(sY);

    }
}
