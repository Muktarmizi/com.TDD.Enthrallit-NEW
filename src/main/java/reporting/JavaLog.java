package reporting;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaLog {

static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 

 public static void mylog(String msg) {
	 
	 logger.log(Level.INFO, msg);
	 
	 
	 
 }
	
	
	
	
	
	
	
}
