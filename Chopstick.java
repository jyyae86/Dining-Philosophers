public class Chopstick {
	private int ID;
	private boolean free;

	

	Chopstick(int ID) {
		  this.ID = ID;
		  free = true; 
	
	}
	
	synchronized boolean take() {
		
		if (free == true){
			free = false;
			return true;
			} else
				return false;
	}
	
	synchronized boolean release() {
		if (free == false){
			free = true;
			return free;
			} else
				return false;
	}
	    
	public int getID() {
	    return(ID);
	}
}
