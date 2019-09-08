package csce247.designpatterns;

/**
 * Abstract base class for which all characters are based on
 * @author Cameron Brandenburg
 */
public abstract class Character {
	/**Name of character to be used in subclasses*/
	protected String name;
	/**Interface from WeaponBehavior to be used in subclasses*/
	protected WeaponBehavior weaponBehavior;
	
	/**
	 * Creates a new Character given a name
	 * @param name The name of the character
	 */
	Character(String name) {
		this.name = name;
	}
	
	/**
	 * Calls the attack method from the WeaponBehavior interface
	 */
	public void attack() {
		weaponBehavior.attack();
	}
	
	/**
	 * Sets the weapon behavior from 
	 * @param wb What sets the type of weapon behavior
	 */
	public void setWeaponBehavior(WeaponBehavior wb) {
		this.weaponBehavior = wb;
	}
	
	/**
	 * Displays the name and description of the character
	 */
	public abstract void display();
}
