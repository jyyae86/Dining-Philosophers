public class Chopstick {
	private int ID;
	private boolean free;

	

	Chopstick(int ID) {
		  this.ID = ID;
		  free = true; 
	
	}
	
	synchronized boolean take() {
		boolean result = true;
		if (free != true){
			try {
				wait(1000);
				if(free == false){
					result = false;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		return result;
	}
	
	synchronized void release() {
		free = true;
		notify();
	}
	    
	public int getID() {
	    return(ID);
	}
}
