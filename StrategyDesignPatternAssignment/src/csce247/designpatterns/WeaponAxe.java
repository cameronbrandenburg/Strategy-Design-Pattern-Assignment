package csce247.designpatterns;

/**
 * A type of weapon implemented from WeaponBehavior that is an axe
 * @author Cameron Brandenburg
 */
public class WeaponAxe implements WeaponBehavior {
	/**
	 * Prints out what attack the weapon does
	 */
	public void attack() {
		System.out.println("Swing an axe");
		return;
	}
}
