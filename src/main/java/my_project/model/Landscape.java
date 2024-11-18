package my_project.model;

import KAGO_framework.control.Drawable;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Landscape extends GraphicalObject {
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(144,238,144,200);
        drawTool.drawFilledRectangle(0,300,1000,300);
        drawTool.setCurrentColor(173,216,230,200);
        drawTool.drawFilledRectangle(0,0,1000,300);
    }

    public void update(double dt){
        // Hier passiert momentan nichts - da muss auch anfangs nichts dran geändert werden.
    }
}
