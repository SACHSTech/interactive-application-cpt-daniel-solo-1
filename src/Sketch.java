import processing.core.PApplet;

/**
 * Template for programs with Processing graphics output.
 * @author Your Name
 */
public class Sketch extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }

    @Override
    public void settings() {
        size(600, 400); 
    }

    @Override
    public void setup() {
        fill(154, 205, 248);        // Water Background
        noStroke();
        rect(0, 0, 600, 400);

        fill(114, 97, 55); // Gravel Ground
        stroke(0, 0, 0);
        rect(0, 250, 600, 200);

        fill(0,0,0);
        noStroke();
        rect(0, 0, 100, 15);
    }

    @Override
    public void draw() {

    }

    /** Additional helper methods below */

}
