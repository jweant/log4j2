package log4j2; // NOSONAR

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerObject {
	
	private static final Logger logger = LogManager.getLogger(LoggerObject.class.getName());
	private static final LoggerObject loggerObject = new LoggerObject();
	
	private LoggerObject() {}
	
	public void print(String output) {
		logger.info(output);
	}

	public static LoggerObject getInstance() {
		return loggerObject;
	}
}
