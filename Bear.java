package assignment_2;

public class Bear extends Animal{
	private String color, species;
	public Bear(){
		this("Ted");
	}
	public Bear(String name){
		this(name, "Grizzly");
	}
	public Bear(String name, String spec){
		this(name, spec, "Brown");
	}
	public Bear(String name, String spec, String color){
		super();
		this.name = name;
		this.species = spec;
		this.color = color;
	}
	
	public void display(){ 
		System.out.println("My name is " + this.name + ". I am a " + this.color + " " + this.species +
				". I weigh " + this.weight + "Kgs and am " + this.height + "m tall!");
	}
	
	public static void main(String[] args){
		Bear b1 = new Bear();
		b1.display();
	}
}
