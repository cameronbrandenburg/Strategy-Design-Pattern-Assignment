package csce247.designpatterns;

/**
 * A type of weapon implemented from WeaponBehavior that is no weapon
 * @author Cameron Brandenburg
 */
public class WeaponNone implements WeaponBehavior {
	/**
	 * Prints out what attack the weapon does
	 */
	public void attack() {
		System.out.println("Oh no!  I lost my weapon"); // Strategy Output.txt has two spaces here
		return;
	}
}