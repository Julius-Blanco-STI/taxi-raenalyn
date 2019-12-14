/**
 * @(#)Taxi.java
 *
 *
 * @author 
 * @version 1.00 2019/12/13
 */


public class Taxi {
	private int x = 0;
 	private int y = 0; 
 	private int xdestination = 0;
 	private int ydestination = 0;
	private String platenumber = null;
	
	public Taxi (String platenumber){
		this.platenumber = platenumber;
	}
	
	public void run (String s){
		//Attributes
	    for (int i = 0; i < s.length (); i++){
	    	char c = s.charAt (i); 
	    		
	    		if (c == 'l'){
	    			x--;
	    		} 
	    		else if (c == 'r'){
	    			x++;
	    			
	    		} 
	    		else if (c == 'd'){
	    			y--;
	    			
	    		} 
	    		else if (c == 'u'){
	    			y++;
	    			
	    		}
	     		else {
	     							
	    		}
   		 }
	}
	
	public void book (int x, int y) {
		xdestination = x;
		ydestination = y;
	}
	
	public void reachedDestination(){
			if (x == xdestination && y == ydestination){
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
	}
	
	public void printCurrentLocation (){
		System.out.println(x + " " +  y);
	}
	
}
	
	