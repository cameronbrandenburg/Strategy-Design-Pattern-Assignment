package csce247.designpatterns;

/**
 * A type of weapon implemented from WeaponBehavior that is a bow
 * @author Cameron Brandenburg
 */
public class WeaponBow implements WeaponBehavior {
	/**
	 * Prints out what attack the weapon does
	 */
	public void attack() {
		System.out.println("Draw and loose an arrow");
		return;
	}
}