package log4j2; // NOSONAR

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AnotherClass {
	
	private static final Logger logger = LogManager.getLogger(App.class.getName());

	void doSomething() {
		
		logger.traceEntry();
		
		logger.info("Printing something");
		LoggerObject.getInstance().print("Here I am in AnotherClass, in doSomething()");
		
		logger.traceExit();
		
	}
}
