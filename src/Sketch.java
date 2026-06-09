import processing.core.PApplet;
import processing.core.PImage;

/**
 * This is a small simulation of a fish in a fish tank, where you use various buttons on the keyboard to interact with the background elements that would make the fish react in different ways
 * @author daniel-solo
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
    PImage sunFishSurprised;
    PImage sunFishLeft;

    @Override
    public void setup() {

        tankBase();
        treasureChestBase();
        clamBase();
        instructions();
        
        sunFish = loadImage("images/sunfish-fat.png");
        sunFishSurprised = loadImage("images/sunfish-fat-ah.png");
        sunFishLeft = loadImage("images/sunfish-fat-left.png");


    }

            // make fish flip at 550 in x axis

        float sunFishX = 250;
        float sunFishSpeedX = 4;

    @Override
    public void draw() {
        System.out.println("x position of sun fish = " + sunFishX);
        image(sunFish, sunFishX, 150, 50, 50);
        fishMovement();

        if (keyPressed){
            if (keyCode == UP){
                image(sunFishSurprised, sunFishX, 150, 50, 50);
                fishMovement();
            }
        }
        
        //if (keyPressed){
            //if (keyCode == LEFT){

            //}
        //}
        
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

    private void clamBase(){
        fill(157, 88, 214);         // clam bottom
        stroke(0,0,0);
        rect(50,270,200,50);
        fill(156, 117, 189);
        stroke(0,0,0);
        rect(40, 250, 220, 20);
        //fill(156, 117, 189);        // clam top
        //stroke(0,0,0);
        //rect(40, 230, 220, 20);
        //fill(157, 88, 214);
        //stroke(0,0,0);
        //rect(50,190,200,40);

        if (keyPressed){
            if (key == W){
                fill(255, 255, 255);        // Pearl inside
                stroke(0,0,0);
                ellipse(150, 110, 40, 40);
            }
        }

    }
    
    private void treasureChestBase(){
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

    private void fishMovement(){
        sunFishX = sunFishX + sunFishSpeedX;
        if (sunFishX >= 550){
            sunFishSpeedX = sunFishSpeedX * -1;
            sunFish = sunFishLeft;
        }
        if (sunFishX <= 0){
            sunFishSpeedX = (sunFishSpeedX * -1) * 1;
            image(sunFish, 0, 150, 50, 50);
        }
    }

    private void instructions(){
        textSize(30);
        fill(13, 71, 161);
        text("UP/DOWN = Chest", 30, 50);
    }

    /** Additional helper methods below */

}
