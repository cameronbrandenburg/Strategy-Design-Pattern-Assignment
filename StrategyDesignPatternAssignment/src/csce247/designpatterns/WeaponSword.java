package csce247.designpatterns;

/**
 * A type of weapon implemented from WeaponBehavior that is a sword
 * @author Cameron Brandenburg
 */
public class WeaponSword implements WeaponBehavior {
	/**
	 * Prints out what attack the weapon does
	 */
	public void attack() {
		System.out.println("Lunge and strike with sword");
	}
}