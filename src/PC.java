
import java.util.*;

public abstract class PC implements ClassInterface {

	//instance fields
	
	String name;
	int level = 1;
	int armorClass = 10;
	int hitPoints;
	int hitDice;
	int[] talentSlots;
	int movementSpeed;
	String race;
	int Str;// attributes
	int Dex;
	int Con;
	int Int;
	int Wis;
	int Cha;
	int StrMod;// modifiers
	int DexMod;
	int ConMod;
	int IntMod;
	int WisMod;
	int ChaMod;
	Boolean Inspiration = false;// whether or not you have inspiration
	int maxHP;// maxHP (will be modified)
	int weapon = 1;// type of die you roll for your weapon
	int initiativeBonus;
	
	
	public PC(String name, int S, int D, int Co, int I, int W, int Ch, Boolean inpriation) {
		
		Random r = new Random();
		
		this.name = name;
		setStr(S);
		setDex(D);
		setCon(Co);
		setInt(I);
		setWis(W);
		setCha(Ch);
		StrMod = Math.floorDiv(Str,2)-5;
		DexMod = Math.floorDiv(Dex,2)-5;
		ConMod = Math.floorDiv(Con,2)-5;
		IntMod = Math.floorDiv(Int,2)-5;
		WisMod = Math.floorDiv(Wis,2)-5;
		ChaMod = Math.floorDiv(Cha,2)-5;
		
		armorClass = 10+DexMod;
		initiativeBonus = DexMod;
		maxHP = level*ConMod + r.nextInt(hitDice);
		hitPoints = maxHP;
		
	}// end PC constructor


	public int getStr() {
		return Str;
	}


	public void setStr(int str) {
		if(str <= 18 && str >= 6)
			Str = str;
		else
			Str = 10;
	}


	public int getDex() {
		return Dex;
	}


	public void setDex(int dex) {
		if(dex<=18 && dex>=6)
			Dex = dex;
		else
			Dex=10;
	}


	public int getCon() {
		return Con;
	}


	public void setCon(int con) {
		if(con<=18 && con>=6)
			Con = con;
		else
			Con=10;
	}


	public int getInt() {
		return Int;
	}


	public void setInt(int i) {
		if(i<=18 && i>=6)
			Int = i;
		else
			Int = 10;
	}


	public int getWis() {
		return Wis;
	}


	public void setWis(int wis) {
		if(wis<=18 && wis>= 6)
			Wis = wis;
		else
			Wis=10;
	}


	public int getCha() {
		return Cha;
	}


	public void setCha(int cha) {
		if(cha<=18 && cha>=6)
			Cha = cha;
		else
			Cha = 10;
	}
	
	
	
	public String toCharacterSheet() {
		
		String charSheet = "This is the character sheet of " + name+ "\nStr: "+Str+" "+StrMod+"\n"+
				"Dex: "+Dex+" "+DexMod+"\n"+
				"Con: "+Con+" "+ConMod+"\n"+
				"Int: "+Int+" "+IntMod+"\n"+
				"Wis: "+Wis+" "+WisMod+"\n"+
				"Cha: "+Cha+" "+ChaMod+"\n"+
				"AC : "+armorClass+"\n"+
				"Initiative : " + initiativeBonus;
			
		
		return charSheet;
	}
	
	
}// end class PC
