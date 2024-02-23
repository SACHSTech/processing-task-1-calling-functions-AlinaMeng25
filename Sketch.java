import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 0, 0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // Background circles
    stroke(255, 72, 0);
    fill(255, 72, 0);
    ellipse(10, 30, 34, 34);
    ellipse(300, 350, 50, 50);
    ellipse(40, 345, 20, 20);
    ellipse(355, 150, 70, 70);
    ellipse(100, 0, 90, 90);
    ellipse(20, 245, 40, 40);
    ellipse(390, 30, 70, 70);
    ellipse(200, 380, 30, 30);

    // Stroke reset
    stroke(0);

	  // Rectangle
    fill(71, 209, 117);
    rect(50, 50, 300, 300);

    // Tears
    stroke(0, 140, 255);
    strokeWeight(10);
    line(120, 280, 120, 300);
    line(275, 275, 275, 340);

    // Stroke reset
    stroke(0);
    strokeWeight(1);

    // Rectangle eyes whites
    fill(255);
    ellipse(125, 275, 60, 20);
    ellipse(275, 275, 40, 60);

    // Pupils
    fill(0);
    ellipse(120, 280, 30, 10);
    ellipse(280, 260, 20, 20);

    // Mouth
    stroke(0);
    strokeWeight(10);
    line(125, 320, 260, 320);

    // Reset stroke weight
    strokeWeight(1);

    // largest circle
    fill(73, 201, 143);
    ellipse(175, 175, 175, 175);

    // largest circle eyes
    fill(0);
    ellipse(140, 140, 10, 10);
    ellipse(200, 120, 10, 10);

    // second circle
    fill(64, 184, 138);
    ellipse(200, 200, 100, 100);

    // second circle eyes
    fill(0);
    ellipse(180, 185, 10, 10);
    ellipse(230, 180, 10, 10);

    // smallest circle
    fill(64, 184, 152);
    ellipse(215, 215, 55, 55);

    // smallest circle eyes
    fill(0);
    ellipse(200, 215, 10, 10);
    ellipse(235, 215, 10, 10);

    // mouth
    fill(245, 166, 154);
    ellipse(220, 225, 20, 10);
  }
  
  // define other methods down here.
}