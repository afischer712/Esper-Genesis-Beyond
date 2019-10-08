
public interface ClassInterface {

	public void levelUp();
	// this will be interesting to include since it's going to do different things per class.
	// lots of ifs and class-specific things to mess with. Typically, updates hit points
	
	public String toCharacterSheet();
	// another fun one that's going to be interesting. Must print all relevant details of the character
	// sheet to the console, which, again, will be different for class (or even race)
	
	//BASICALLY, it'll have attributes, modifiers, proficencies, proficency bonus, AC, and initiative
	
	public void getRace();
	// this should give all of the bonuses and skills for races to the PC along with the string for the
	// name of the race. Should be pretty easy to homebrew?
	
	public void longRest();
	// spell slots back to normal, hit points to full, etc
	
	public void shortRest();
	// maybe not void in the end? like with hit dice and stuff
	
	public int weaponAttack();
	// if no weapon, just unarmed
	// won't apply to every class or character
	
}// end classInterface
