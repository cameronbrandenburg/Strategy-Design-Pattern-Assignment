package csce247.designpatterns;

/**
 * A Character called King that has a sword
 * @author Cameron Brandenburg
 */
public class King extends Character{
	/**
	 * Constructor to create a new King given a name
	 * Calls the constructor of the superclass to set the name
	 * Sets the weapon behavior to type sword
	 * @param name The king's name
	 */
	King(String name) {
		super(name);
		weaponBehavior = new WeaponSword();
	}
	
	/**
	 * Displays the name and description of the King
	 */
	public void display() {
		System.out.println(name+" is a Noble King");
	}

}
