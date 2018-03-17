import java.util.HashMap;
import java.util.Map;

public class Team {

	public Team(){
		person = new HashMap<String, People>();
	}
	
	public String getName(String name){
		return person.get(name).getName();
	}
	
	public double getHealth(String name){
		return person.get(name).getHealth(); 
	}
	
	public int getStrength(String name){
		return person.get(name).getStrength();
	}
	
	public int getAttack(String name){
		return person.get(name).getAttack();
	}
	
	public People getZombie(String name){
		People zombie =  person.get(name);
		return new People(zombie.getName(), zombie.getHealth(), zombie.getStrength(), zombie.getAttack());
	}
	
	public void addPeople(String string, People people){
		person.put(string, people);
	}

	//-------------------------------------------------------------------------------------------
	// This method implements the invasion between infected and non-infected
	//-------------------------------------------------------------------------------------------
	public void invasion(People attacker, People defender){
	    int damage = Math.max(0, attacker.getAttack() - defender.getStrength());
		double health = defender.getHealth() - damage;
		
		System.out.println(attacker.getName() + "'s attack is " + damage + " damage!\n");
		System.out.println(defender.getName() + "'s health is " + health);

		defender.setHealth(health);
	}

	//-------------------------------------------------------------------------------------------
	// This method implements the survival between the infected and non-infected
	//-------------------------------------------------------------------------------------------
	public void survival(People survivor, People cease, int totalAttacks, int totalDamage){
		do{
			invasion(survivor, cease); 
			invasion(cease, survivor);
			totalAttacks++;
			//how to calculate the total damage
			
		}
		while (survivor.deadOrAlive() && cease.deadOrAlive());
		if(survivor.deadOrAlive()){
			System.out.println("survives the onslaught!");
		}
		else if (cease.deadOrAlive()){
			System.out.println("ceases to exist!");
		}
		else{
			System.out.println("What the...its a Tie!?");
		}
		System.out.println("Total Attacks: " + totalAttacks);
		System.out.println("Total Damage: " + totalDamage);
	}
	
	private Map<String, People> person;
}