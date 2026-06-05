import processing.core.PApplet;
import processing.core.PImage;

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

    PImage sunFish;
    PImage sunFishSuprised;

    @Override
    public void setup() {

        tankBase();
        trasureChestBase();
        
        sunFish = loadImage("images/sunfish-fat.png");
        sunFishSuprised = loadImage("images/sunfish-fat-ah.png");

    }

    @Override
    public void draw() {

        image(sunFish, 300, 200, 30, 30);

        
        if (keyPressed){
            if (keyCode == UP){
                fill(93, 64, 55);           // Treasure Chest Lid
                stroke(0,0,0);
                rect(400, 179, 100, 60);
                
                fill(141, 110, 99);
                stroke(0,0,0);
                rect(405, 184, 90, 50);

                fill(3, 155, 229);
                stroke(0,0,0);
                ellipse(450, 235, 15, 15);
            }

            if (keyCode == DOWN){
                fill(154, 205, 248);
                noStroke();
                rect(390, 169, 120, 60);
                
                fill(93, 64, 55);           // Treasure Chest Lid
                stroke(0,0,0);
                rect(400, 219, 100, 20);
            }
        }

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
    
    private void trasureChestBase(){
        fill(93, 64, 55);           // Treasure Chest
        stroke(0,0,0);
        rect(400, 250, 100, 50);
        fill(255, 235, 59);
        stroke(0,0,0);
        rect(390, 240, 120, 10);
        fill(255, 235, 59);
        stroke(0,0,0);
        rect(440, 230, 20, 20);
        fill(93, 64, 55);           // Treasure Chest Lid
        stroke(0,0,0);
        rect(400, 219, 100, 20);
    }

    /** Additional helper methods below */

}
