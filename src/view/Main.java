package view;

import controlP5.CheckBox;
import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PFont;

public class Main extends PApplet {
	
	private ControlP5 cp5; 
	private CheckBox checkbox;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");

	}
	
	public void settings() {
		size(500,500); 
	}

	public void setup() {
		
		PFont font = createFont("arial",20);
		cp5 = new ControlP5(this);
		//se crean todos los elementos de cp5
		
		//input de tipo text -> text field
		cp5.addTextfield("name")
		.setPosition(20,100)
		.setSize(200,40)
		.setFont(font)
		.setFocus(true)
		.setColor(color(255,0,0))
		; 
		//button bangs
		cp5.addBang("button")
		.setPosition(240,240)
		.setSize(80,40)
		.getCaptionLabel().align(ControlP5.CENTER, ControlP5.CENTER)
		;
		
		//crear checkBox
		checkbox = cp5.addCheckBox("checkBox")
                .setPosition(100, 200)
                .setColorForeground(color(120))
                .setColorActive(color(255))
                .setColorLabel(color(255))
                .setSize(40, 40)
                .setItemsPerRow(3)
                .setSpacingColumn(30)
                .setSpacingRow(20)
                .addItem("0", 0)
                .addItem("50", 50)
                .addItem("100", 100)
                .addItem("150", 150)
                .addItem("200", 200)
                .addItem("255", 255)
                ;
	}

	public void draw() {
		background(100); 
		text(cp5.get(Textfield.class,"name").getText(), 360,130 );
	}
	
	public void button() {
		System.out.println(cp5.get(Textfield.class,"name").getText());
	}

}
