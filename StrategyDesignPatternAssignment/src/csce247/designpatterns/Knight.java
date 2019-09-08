package csce247.designpatterns;

/**
 * A character called Knight that has a bow
 * @author Cameron Brandenburg
 */
public class Knight extends Character{
	/**
	 * Constructor to create a new Knight given a name
	 * Calls the constructor of the superclass to set the name
	 * Sets the weapon behavior to type bow
	 * @param name The knight's name
	 */
	Knight(String name) {
		super(name);
		weaponBehavior = new WeaponBow();
	}
	
	/**
	 * Displays the name and description of the Knight
	 */
	public void display() {
		System.out.println(name+" is a valiant knight");
	}

}
