
public abstract class Simulator {
		/// Run the entire simulation until finished
	void run(){
		reset();
		while(!finished()){
			step();
		}
	}
	
	/// Run the simulation for a specific number of steps
	void run(int steps){
		reset();
		for(int i = 0; i < steps && !finished(); ++i){
			step();
		}
	}
	
	/// Reset the state of the simulation
	abstract void reset();
	
	/// Run a single step of the simulation
	abstract void step();
	
	/// Whether the simulation has ended
	abstract boolean finished();

}
