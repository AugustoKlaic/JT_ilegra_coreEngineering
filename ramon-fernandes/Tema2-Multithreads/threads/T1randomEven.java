package threads;
import Util.Operations;

public class T1randomEven {
	  private static Runnable t1 = new Runnable() {
	        public void run() {
	            try{
	            	while(true)
					Operations.randomEven();
	            } catch (Exception e){}
	 
	        }
	    };
	    
	    public Runnable getRunnable() {
	    	return t1;
	    }
}
