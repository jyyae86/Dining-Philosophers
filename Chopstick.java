public class Chopstick {
	private int ID;
	private boolean free;

	

	Chopstick(int ID) {
		  this.ID = ID;
		  free = true; 
	
	}
	
	synchronized void take() {
		if (free != true){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			free = false;
		}
	}
	
	synchronized void release() {
		free = true;
		notify();
	}
	    
	public int getID() {
	    return(ID);
	}
}
