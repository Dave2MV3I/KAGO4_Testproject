package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Fence extends GraphicalObject {

    private double fX, fY, pW, pH, pA, pD;
    public Fence(double fX, double fY, double pW, double pH, double pA, double pD){ // Fences X and Y Position, a sigle posts length, width, amount, distance
        this.fX = fX;
        this.fY = fY;
        this.pW = pW;
        this.pH = pH;
        this.pA = pA;
        this.pD = pD;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(48,93,77,255);
        for (double i = 0; i < pA; i++) {
            double xPos = fX + i*(pW+pD);
            drawTool.drawFilledRectangle(xPos, fY, pW, pH);
            drawTool.drawFilledPolygon(xPos, fY, xPos + pW, fY, xPos + (pW / 2), fY - (pH / 5));
            if (i + 1 != pA){ drawTool.drawFilledRectangle(xPos+pW, fY+pH/2, pD, pH/5); }
        }
    }

    @Override
    public void update(double dt){

    }
}
