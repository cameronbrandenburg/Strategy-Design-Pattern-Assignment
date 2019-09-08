package csce247.designpatterns;

/**
 * Interface for behaviors of all types of weapons
 * @author Cameron Brandenburg
 */
public interface WeaponBehavior {
	/**
	 * Type of attack a weapon will do
	 * Implemented in subclasses
	 */
	public void attack();
}
