package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Cloud extends GraphicalObject {

    private double cX, cY, cPA, speed; // x, y, parts amount
    private boolean directionR;
    public Cloud(double cX, double cY, double cPA, double speed){
        //this.cX = cX;
        //this.cY = cY;
        //this.cPA = cPA;
        this.cX = ThreadLocalRandom.current().nextDouble(0, 1000);
        this.cY = ThreadLocalRandom.current().nextDouble(0, 300);
        this.cPA = ThreadLocalRandom.current().nextDouble(1, 4);
        this.speed = speed;

        double d = Math.random();
        if (d < 0.5){directionR = true;} else {directionR = false;}
    }

    @Override
    public void draw(DrawTool drawTool) {
        //drawTool.setCurrentColor(216,207,196,255);
        drawTool.setCurrentColor(Color.LIGHT_GRAY);
        for (double i = 0; i < cPA; i++){
            drawTool.drawFilledCircle(cX+40*i,cY,40);
            if (i < cPA-1){
                drawTool.drawFilledCircle(cX+70*i,cY+30,40);
            }
        }
    }

    @Override
    public void update(double dt){
        if (directionR) {
            cX += speed*dt;
            if (cX > 1100) {cX = 0-110*cPA;}
        } else {cX -= speed*dt;
            if (cX < 0-110*cPA) {cX = 1100;}
        }
    }
}
