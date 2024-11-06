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
    public House(){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }


    /**
     * Diese Methode zeichnet den die optische Repräsentation eines House-Objekts. Wird vom Framework unaufhörlich automatisch mit jedem Frame aufgerufen.
     */
    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(Color.DARK_GRAY);
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
