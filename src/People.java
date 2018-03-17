
public class People {

	//--------------------------------------------------------------
	// Constructor
	//--------------------------------------------------------------
	public People(String name, double health, int strength, int attack){
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.attack = attack;
	}
	
	//--------------------------------------------------------------
	// Copy Constructor
	//--------------------------------------------------------------
	public People(People people){
		name =  people.name;
		health = people.health;
		strength = people.strength;
		attack = people.attack;
	}

	//--------------------------------------------------------------
	// Get the name of the individual 
	//--------------------------------------------------------------
	public String getName(){
		return name;
	}
	
	//--------------------------------------------------------------
	// Get the health of the person
	//--------------------------------------------------------------
	public double getHealth(){
		return health;
	}
	
	//--------------------------------------------------------------
	// Get the Strength of the person after fighting 
	//--------------------------------------------------------------
	public int getStrength(){
		return strength;
	}
	
	//--------------------------------------------------------------
	// Get the Attack of the infected and non-infected
	//--------------------------------------------------------------
	public int getAttack(){
		return attack;
	}
	
	//--------------------------------------------------------------
	// Set the name of the individual
	//--------------------------------------------------------------
	public void setName(String n){
		name = n;
	}
	
	//--------------------------------------------------------------
	// Set health of the individual
	//--------------------------------------------------------------
	public void setHealth(double newHealth){
		health = newHealth;
	}
	
	//--------------------------------------------------------------
	// Set the strength of people
	//--------------------------------------------------------------
	public void setStrength(int strengthAmount){
		strength = strengthAmount;
	}
	
	//--------------------------------------------------------------
	// Set Attack of infected and non-infected
	//--------------------------------------------------------------
	public void setAttack(int attackAmount){
		attack = attackAmount;
	}
	
	//--------------------------------------------------------------
	// Test if the non-infected and infected are alive or not
	//--------------------------------------------------------------
	public boolean deadOrAlive(){
		return health > 0;
	}
	
	private String name;
	private double health;
	private int strength;
	private int attack;
}
