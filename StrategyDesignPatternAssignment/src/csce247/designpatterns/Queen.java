package csce247.designpatterns;

/**
 * A character called Queen that has a knife
 * @author Cameron Brandenburg
 */
public class Queen extends Character{
	/**
	 * Constructor to create a new Queen given a name
	 * Calls the constructor of the superclass to set the name
	 * Sets the weapon behavior to type knife
	 * @param name The queen's name
	 */
	Queen(String name) {
		super(name);
		weaponBehavior = new WeaponKnife();
	}
	
	/**
	 * Displays the name and description of the Queen
	 */
	public void display() {
		System.out.println(name+" is a beautiful queen");
	}

}
