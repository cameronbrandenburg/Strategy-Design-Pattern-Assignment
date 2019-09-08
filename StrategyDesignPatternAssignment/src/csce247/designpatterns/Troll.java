package csce247.designpatterns;

/**
 * A character called Troll that has an axe
 * @author Cameron Brandenburg
 */
public class Troll extends Character{
	/**
	 * Constructor to create a new Troll given a name
	 * Calls the constructor of the superclass to set the name
	 * Sets the weapon behavior to type axe
	 * @param name The troll's name
	 */
	Troll(String name) {
		super(name);
		weaponBehavior = new WeaponAxe();
	}
	
	/**
	 * Displays the name and description of the Knight
	 */
	public void display() {
		System.out.println(name+" is a funny troll");
	}

}
