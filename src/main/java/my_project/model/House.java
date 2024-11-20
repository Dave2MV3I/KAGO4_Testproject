package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

/**
 * Repräsentiert ein Haus. Der Teil mit "extends" wird später erklärt und jetzt ignoriert - oder wurde schon erklärt.
 */
public class House extends GraphicalObject {

    /**
     * Erzeugt ein neues Objekt der Klasse House
     */
    private double hX,hY,hW,hH;
    private int r,g,b;
    public House(double hX, double hY, double hW, double hH){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
        this.hX = hX;
        this.hY = hY;
        this.hW = hW;
        this.hH = hH;
        r = (int)(Math.random()*255);
        g = (int)(Math.random()*255);
        b = (int)(Math.random()*255);

    }


    /**
     * Diese Methode zeichnet den die optische Repräsentation eines House-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        /*drawTool.setCurrentColor(Color.DARK_GRAY);
        // Dach
            drawTool.drawFilledCircle(250, 280, 120);
            drawTool.drawFilledPolygon(220,170, 280,170, 250,130);
        // Haus mit Tuer
            drawTool.drawFilledRectangle(150,300,200,240);
            drawTool.setCurrentColor(Color.BLACK);
            drawTool.drawFilledRectangle(250,450,60,90);
        // Fenster
        drawTool.setCurrentColor(Color.LIGHT_GRAY);
        drawTool.drawRectangle(195,450,40,50);
        drawTool.drawRectangle(195,450, 20, 25 );
        drawTool.drawRectangle(215,450, 20, 25 );

        drawTool.drawRectangle(195,350,110,50);
        //drawTool.drawLine(215,450, );
        //drawTool.drawLine();
        */
        drawTool.setCurrentColor(Color.DARK_GRAY);
        drawTool.drawFilledRectangle(hX+0.1*hW,hY-hW/2,hW*0.2,hH*0.2);

        drawTool.setCurrentColor(255,215,0,200); // Maximum und Minimus des Alphawertes??
        drawTool.drawFilledPolygon(hX+hW/2-hW*0.15,hY-hW/2+hW*0.1, hX+hW/2+hW*0.15,hY-hW/2+hW*0.1, hX+hW/2,hY-hW/2-hW*0.1 ); //Dachdeko
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawFilledCircle(hX+hW/2,hY,hW/2); //Rundes Dach Umrandung
        drawTool.setCurrentColor(r,g,b,255);
        drawTool.drawFilledCircle(hX+hW/2,hY,hW/2 -3); //Rundes Dach

        drawTool.setCurrentColor(Color.DARK_GRAY);
        drawTool.drawFilledRectangle(hX,hY,hW,hH); //Haus
        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawFilledRectangle(hX + hW/2,hY + 0.6*hH,0.3*hW,0.4*hH); //Tuer
        drawTool.setCurrentColor(Color.YELLOW);
        drawTool.drawFilledCircle(hX + hW/2 + 0.15*hW,hY + 0.75*hH, hW*0.015); //Tuerknauf
        drawTool.drawCircle(hX + hW/2 + 0.15*hW,hY + 0.75*hH + hW*0.03, hW*0.04); //Tuerknauf

        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawRectangle(hX+hW*0.1,hY + 0.6*hH,hW*0.3,0.2*hH); //Fensterumrandung
        drawTool.setCurrentColor(Color.LIGHT_GRAY);
        drawTool.drawFilledRectangle(hX+hW*0.1 +1,hY + 0.6*hH +1,hW*0.3 -3,0.2*hH -2);
        drawTool.drawRectangle(hX+hW*0.1 +1,hY + 0.6*hH +1,hW*0.3 -2,0.2*hH -2); //Fenster
        drawTool.setCurrentColor(Color.GRAY);
        drawTool.drawRectangle(hX+hW*0.1 +1,hY + 0.6*hH +1,hW*0.3 -2,0.1*hH -2); //Fensterrahmen
        drawTool.drawRectangle(hX+hW*0.1 +1,hY + 0.6*hH +1,hW*0.15 -2,0.2*hH -2);


        drawTool.setCurrentColor(Color.BLACK);
        drawTool.drawRectangle(hX+hW*0.1,hY + 0.2*hH,hW-hW*0.2,0.2*hH); //Fensterumrandung
        drawTool.setCurrentColor(Color.LIGHT_GRAY);
        drawTool.drawFilledRectangle(hX+hW*0.1 +1,hY + 0.2*hH,hW-hW*0.2 -1,0.2*hH);
        drawTool.drawRectangle(hX+hW*0.1 +1,hY + 0.2*hH,hW-hW*0.2,0.2*hH); //Breites Fenster
        drawTool.setCurrentColor(Color.GRAY);
        drawTool.drawRectangle(hX+hW*0.1 +1,hY + 0.2*hH,hW-hW*0.2,0.1*hH); //Fensterrahmen
        drawTool.drawRectangle(hX+hW*0.1 +1,hY + 0.2*hH,(hW-hW*0.2)*0.5,0.2*hH);
        drawTool.drawRectangle(hX+hW*0.1 +1,hY + 0.2*hH,(hW-hW*0.2)*0.25,0.2*hH);
        drawTool.drawRectangle(hX+hW*0.1 +1,hY + 0.2*hH,(hW-hW*0.2)*0.75,0.2*hH);

    }

    /**
     * Wird mit jedem Frame vom Framework aufgerufen und dient zur Manipulation des Objekts im Verlauf
     * der Zeit.
     * @param dt die Sekunden, die seit dem letzten Aufruf von update vergangen sind
     */
    @Override
    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }

}
