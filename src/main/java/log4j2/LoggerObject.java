package log4j2; // NOSONAR

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerObject {
	private static final Logger logger = LogManager.getLogger(LoggerObject.class.getName());
	
	public void print(String output) {
		logger.info(output);
	}
	
}
