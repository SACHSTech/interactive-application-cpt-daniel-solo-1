import processing.core.PApplet;
import processing.core.PImage;

/**
 * This is a small simulation of a fish in a fish tank, where you use various buttons on the keyboard to interact with the background elements that would make the fish react in different ways
 * 
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
    PImage sunFishSurprisedLeft;
    PImage sunFishRight;

    @Override
    public void setup() {
        
        sunFish = loadImage("images/sunfish-fat.png");
        sunFishSurprised = loadImage("images/sunfish-fat-ah.png");
        sunFishLeft = loadImage("images/sunfish-fat-left.png");
        sunFishSurprisedLeft = loadImage("images/sunfish-fat-ah-left");
        sunFishRight = loadImage("images/sunfish-fat-right");

    }
        float sunFishX = 250;
        float sunFishSpeedX = 4;

    @Override
    public void draw() {
        background(154, 205, 248);
        System.out.println("x position of sun fish = " + sunFishX);
        image(sunFish, sunFishX, 150, 50, 50);
        fishMovement();

        tankBase();
        treasureChestBase();
        clamBase();

        instructions();

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
        rect(50,280,200,50);
        fill(156, 117, 189);
        stroke(0,0,0);
        rect(40, 260, 220, 20);
        fill(156, 117, 189);
        stroke(0,0,0);
        rect(40, 240, 220, 20);
        fill(157, 88, 214);
        stroke(0,0,0);
        rect(50,200,200,40);

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

            if (keyPressed){
                if (keyCode == UP){
                    sunFish = sunFishSurprisedLeft;
                }
            }
        }
        if (sunFishX <= 0){
            sunFishSpeedX = (sunFishSpeedX * -1) * 1;
            
            

            if (keyPressed){
                if (keyCode == UP){
                    
                }
            }
        }
    }

    private void instructions(){
        textSize(30);
        fill(13, 71, 161);
        text("UP/DOWN = Open & Close Chest", 30, 50);
    }

}
