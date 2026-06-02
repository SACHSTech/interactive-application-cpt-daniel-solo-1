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
        
        tankBase();
        trasureChestBase();
    }

    private void trasureChestBase(){
        fill(93, 64, 55);           // Treasure Chest
        stroke(0,0,0);
        rect(400, 250, 100, 50);
        fill(255, 235, 59);
        stroke(0,0,0);
        rect(390, 240, 120, 10);
        fill(255, 235, 59);
        stroke(0,0,0);
        rect(440, 240, 20, 20);
    }

    private void tankBase(){
        fill(154, 205, 248);        // Water Background
        noStroke();
        rect(0, 0, 600, 400);

        fill(114, 97, 55);          // Gravel Ground
        stroke(0, 0, 0);
        rect(0, 250, 600, 200);

        fill(0,0,0);                // Tank Lid
        noStroke();
        rect(0, 0, 600, 10);
    }

    @Override
    public void draw() {

        fill(93, 64, 55);           // Treasure Chest Lid
        stroke(0,0,0);
        rect(400, 219, 100, 20);

        if (keyPressed){
            if (keyCode == UP){
                fill(93, 64, 55);           // Treasure Chest Lid
                stroke(0,0,0);
                rect(400, 179, 100, 60);
                
                fill(141, 110, 99);
                stroke(0,0,0);
                rect(405, 184, 90, 50);
            }
        }

        //if (keyReleased){
            //if (keyCode == UP){
                //fill(93, 64, 55);
                //stroke(0,0,0);
                //rect(400, 209, 100, 30);
            //}
        //}

    }

    /** Additional helper methods below */

}
