package my_project.control;

import KAGO_framework.control.ViewController;
import my_project.model.*;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern.
 * Hinweise:
 * - Der Konstruktor sollte nicht geändert werden.
 * - Sowohl die startProgram()- als auch die updateProgram(...)-Methoden müssen vorhanden sein und ihre Signatur sollte
 *   nicht geändert werden
 * - Zusätzliche Methoden sind natürlich gar kein Problem
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private final ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.
    private House firstHouse, secondHouse, h3, h4, h5; // deklariert eine Referenz für ein Objekt der Klasse House
    private Sun sun;
    private Fence fence;
    private Tree tree1, tree2;
    private Cloud cloud1, cloud2;
    private Landscape landscape1, landscape2;

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen. Hier sollte also alles geregelt werden,
     * was zu diesem Zeipunkt passieren muss.
     */
    public void startProgram() {
        // Erstelle ein Objekt der Klasse House und initialisiere damit die Referenz house1
        firstHouse = new House(150,300,200,240);
        secondHouse = new House(360,380,150,160);
        h3 = new House(50, 300, 70, 100);
        h4 = new House(-130, 450, 250, 200);
        h5 = new House(940, 300, 60, 80);
        landscape1 = new Landscape(0,0,1000,350,173,216,230);
        landscape2 = new Landscape(0,350,1000,250,144,238,144);
        fence = new Fence(130,550,10,40,45,10);
        tree1 = new Tree(600,400,100,200,200,300);
        tree2 = new Tree(800,450,70,150,150,200);
        cloud1 = new Cloud(500,100,5, 50);
        cloud2 = new Cloud(500,100,5, 100);
        sun = new Sun(820,400,40, landscape1, landscape2, tree1, tree2);
        landscape2.setMySun(sun);
        // Am Ende initialisieren, damit es die Referenzen auch auf Objekte zeigen können

        // Teile dem ViewController-Objekt mit, dass das House-Objekt gezeichnet werden soll
        viewController.draw(landscape1);
        viewController.draw(sun);
        viewController.draw(landscape2);
        viewController.draw(cloud1);
        viewController.draw(cloud2);
        viewController.draw(firstHouse);
        viewController.draw(secondHouse);
        viewController.draw(h3);
        viewController.draw(h4);
        viewController.draw(h5);
        viewController.draw(tree1);
        viewController.draw(tree2);
        viewController.draw(fence);


    }

    /**
     * Diese Methode wird vom ViewController-Objekt automatisch mit jedem Frame aufgerufen (ca. 60mal pro Sekunde)
     * @param dt Zeit seit letztem Frame in Sekunden
     */
    public void updateProgram(double dt){

    }
}
