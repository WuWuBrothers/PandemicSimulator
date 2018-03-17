import java.util.Random;

public class WorldWarZ extends Simulator{

	public static void main(String[] args){
		//------------------------------------------------------------------------
		// These are the two teams in world war Z
		//------------------------------------------------------------------------
		Team Noninfected = new Team();
		Team Infected = new Team();
		
		//------------------------------------------------------------------------
		// Roster of the two teams
		//------------------------------------------------------------------------
		Noninfected.addPeople("Person 1", new People ("Sean", 100, 10, 25));
		Noninfected.addPeople("Person 2", new People ("Sue", 100, 6, 10));
		Noninfected.addPeople("Person 3", new People ("Lius", 100, 0, 18));
		Noninfected.addPeople("Person 4", new People ("Bobby", 100, 3, 15));
		Noninfected.addPeople("Person 5", new People ("Ashley", 100, 5, 20));
		/*Noninfected.addPeople("Person 6", new People ("Beth", 100, 3, 20));
		Noninfected.addPeople("Person 7", new People ("Greg", 100, 4, 15));
		Noninfected.addPeople("Person 8", new People ("Nick", 100, 6, 50));
		Noninfected.addPeople("Person 9", new People ("Rey", 100, 8, 12));
		Noninfected.addPeople("Person 10", new People ("Gagga", 100, 6, 25));*/
		Infected.addPeople("Person 6", new Infected ("Darnell", 100, 10, 20, 2));
		Infected.addPeople("Person 7", new Infected ("Thomas", 100, 4, 15, 1));
		Infected.addPeople("Person 8", new Infected ("Dorathy", 100, 6, 50, 4));
		Infected.addPeople("Person 9", new Infected ("Reyna", 100, 8, 12, 0));
		Infected.addPeople("Person 10", new Infected ("Becki", 100, 6, 25, 3));
		
		//------------------------------------------------------------------------
		// Game begins here
		//------------------------------------------------------------------------
		int totalDamage = 0;		
		
		// Probabilities sum to 1
		double[] probabilities = {
			0.3,	// range of event 0 is [0 - 0.3)
			0.2,	// range of event 1 is [0.3 - 0.5)
			0.125,	// range of event 2 is [0.5 - 0.625)
			0.275,	// range of event 3 is [0.625 - 0.9)
			0.1		// range of event 4 is [0.9 - 1.0)
			};
					
			// Get a random number representing the event
				Random rand = new Random();
				double event = rand.nextDouble();
				
				// Determine event based on probabilities
				for(int i = 0; i < probabilities.length; ++i)
				{
					if(event < probabilities[i])
					{
						System.out.println("Encounter " + i + " is about to commence!");
						
						if(i == 0)
						{
							System.out.println("We have for Survivor's: " + Noninfected.getName("Person 1"));
							System.out.println("And for the Infected: " + Infected.getName("Person 6"));
							System.out.println("Lets Begin!");
							People survivor = Noninfected.getZombie("Person 1");
							People infected = Infected.getZombie("Person 6");
							Noninfected.survival(survivor, infected, 0, totalDamage);
						}
						if(i == 1)
						{
							System.out.println("We have for Survivor's: " + Noninfected.getName("Person 2"));
							System.out.println("And for the Infected: " + Infected.getName("Person 7"));
							System.out.println("Lets Begin!");
							People survivor = Noninfected.getZombie("Person 2");
							People infected = Infected.getZombie("Person 7");
							Noninfected.survival(survivor, infected, 0, totalDamage);
						}
						if(i == 2)
						{
							System.out.println("We have for Survivor's: " + Noninfected.getName("Person 3"));
							System.out.println("And for the Infected: " + Infected.getName("Person 8"));
							System.out.println("Lets Begin!");
							People survivor = Noninfected.getZombie("Person 3");
							People infected = Infected.getZombie("Person 8");
							Noninfected.survival(survivor, infected, 0, totalDamage);
						}
						if(i == 3)
						{
							System.out.println("We have for Survivor's: " + Noninfected.getName("Person 5"));
							System.out.println("And for the Infected: " + Infected.getName("Person 6"));
							System.out.println("Lets Begin!");
							People survivor = Noninfected.getZombie("Person 5");
							People infected = Infected.getZombie("Person 6");
							Noninfected.survival(survivor, infected, 0, totalDamage);
						}
						if(i == 4)
						{
							System.out.println("We have for Survivor's: " + Noninfected.getName("Person 1"));
							System.out.println("And for the Infected: " + Infected.getName("Person 10"));
							System.out.println("Lets Begin!");
							People survivor = Noninfected.getZombie("Person 1");
							People infected = Infected.getZombie("Person 10");
							Noninfected.survival(survivor, infected, 0, totalDamage);
						}
						break;
					}
					event -= probabilities[i];
				}
		
		int totalWins = 0;
		int totalLosses = 0;
		int totalTies = 0;
		// how do i calculate the wins and losses for each team
	}

	void reset() {
		totalWins = 0;
		totalLosses = 0;
		totalTies = 0;
	}

	void step() {
		
	}

	boolean finished() {
		return false;
	}
	
	
	// if(Noninfected.getHealth() > 0 || Infected.getHealth() > 0)
	//		return numWin++;
	// else if(Noninfected.getHealth() < 0 || Infected.getHealth() > 0)
	//		return numLosses++;
	// else
	//		return numTies++;
	
	private int totalWins;
	private int totalLosses;
	private int totalTies;
}
