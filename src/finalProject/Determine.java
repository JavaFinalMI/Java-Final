/**
 * 
 */
package finalProject;

/**
 * @author mh137428
 *
 */
public class Determine 
{

	public static boolean weapon(int weapon)
	{
		boolean hasWeapon = false;
		if(weapon > 0)
			hasWeapon = true;
		return hasWeapon;
	}

	public static boolean food(int food)
	{
		boolean hasFood = true;
		if(food <= 1)
			hasFood = false;
		return hasFood;
	}

	public static boolean vehicle(int vehicle)
	{
		boolean hasVehicle = false;
		if(vehicle > 0)
			hasVehicle = true;
		return hasVehicle;
	}

	public static boolean survivors(int survivors)
	{
		boolean hasSurvivors = false;
		if(survivors > 0)
			hasSurvivors = true;
		return hasSurvivors;
	}

	public static boolean inCity(int location)
	{
		boolean inCity = false;
		if(location == 0)
			inCity = true;
		return inCity;
	}
	
}
