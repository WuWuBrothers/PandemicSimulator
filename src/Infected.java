
public class Infected extends People{

	public Infected(String name, double health, int strength, int attack, int parts) {
		super(name, health, strength, attack);
		parts = 0;
	}
	
	//-------------------------------------------------------------------------
	// get infected kills
	//-------------------------------------------------------------------------
	public int getKills(){
		return parts;
	}

	//-------------------------------------------------------------------------
	// set infected kills
	//-------------------------------------------------------------------------
	public void setKills(int zKills){
		 parts = zKills;
	}
	
	//-------------------------------------------------------------------------
	// Giving the Zombies their right for free speech.
	//-------------------------------------------------------------------------
	public void Scream(){
		System.out.println("gruh gruh (walks slowly)");
		System.out.println("gruh graaaaaaaaahhhh (inraged by human pressence)"); 
	}
	
	private int parts;
}
