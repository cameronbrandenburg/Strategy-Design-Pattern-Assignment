package csce247.designpatterns;

/**
 * A type of weapon implemented from WeaponBehavior that is a knife
 * @author Cameron Brandenburg
 */
public class WeaponKnife implements WeaponBehavior {
	/**
	 * Prints out what attack the weapon does
	 */
	public void attack() {
		System.out.println("Slice with knife");
		return;
	}
}