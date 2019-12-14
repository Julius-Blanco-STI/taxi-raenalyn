/**
 * @(#)Main.java
 *
 * Main application
 *
 * @author 
 * @version 1.00 2019/12/13
 */
 
public class Main {
    
    public static void main(String[] args) {
    	
    	Taxi x = new Taxi("LUV 143");
    	x.book(10,-1);
    	
    	x.run ("drrrrrrrrrr");
    	
    	//x.run("I am leaving on a helicopter");
    	
    	x.printCurrentLocation();
    		//x:_, y:_
    	//x.book(10,5);
        x.reachedDestination();
    		//false
    
    }
}
