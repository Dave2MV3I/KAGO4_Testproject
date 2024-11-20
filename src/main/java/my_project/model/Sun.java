package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Sun extends GraphicalObject {

    private double sX, sY, sR, x1, x2;
    private Landscape sky, ground;
    private Tree tree1, tree2;
    public Sun(double sX, double sY, double sR, Landscape sky, Landscape ground, Tree tree1, Tree tree2){
        this.sX = sX;
        this.sY = sY;
        this.sR = sR;
        this.sky = sky;
        this.ground = ground;
        this.tree1 = tree1;
        this.tree2 = tree2;
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
        if (sX > 0 && sX < 1000){
            sX = sX-dt*30;
            sY = 600+0.002*(sX-x1)*(sX-x2);
        }
        if (sY < 150) {
            sky.setColour(173,216,230);
        } else if (sY < 200){
            sky.setColour(245, 178, 30);
        } else if (sY < 300){
            sky.setColour(244, 128,55);
        } else if (sY < 500) {
            sky.setColour(169, 24,22);
        } else if (sY > 500){
            sky.setColour(0,0,0);
            ground.setColour(17,66,50);
            tree1.setTreeColour(26,36,33);
            tree2.setTreeColour(26,36,33);
        }

    }
}
