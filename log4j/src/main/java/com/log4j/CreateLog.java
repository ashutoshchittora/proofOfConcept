package com.log4j;

import java.io.File;
import java.util.Properties;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Hello world!
 *
 */
public class CreateLog {

	static Logger logger = Logger.getLogger(CreateLog.class.getName());

	public static void main(String[] args) {
		
		// default file path of log4j.properties is sr\main\resources if its present at location other than this then use below:
		/*String LogfilePath = System.getProperty("user.dir") + File.separator+ "src\\main\\java\\resources"+File.separator+"log4j.properties";
        PropertyConfigurator.configure(LogfilePath);*/
        
		/*String LogfilePath = System.getProperty("user.dir") + File.separator+ "src\\main\\resources\\logDump\\TestDump.log";
		String LogFilePath = "C:\\Users\\ashutosh.chittora\\delete\\Test.Log";
		Properties props = new Properties();
		props.setProperty("log4j.appender.file.File", LogFilePath);
        PropertyConfigurator.configure(props);*/
        logger.debug("this is a debug log message");
        logger.info("this is a information log message");
        logger.warn("this is a warning log message");
        

    	/*Appender console = new ConsoleAppender();
    		Logger root = Logger.getRootLogger();
    		root.addAppender(console);
    		logger.debug("... debug ....");
    		logger.trace("... trace ...");*/
        
        try {
        	int i = 10/0;
    		
		} catch (ArithmeticException  e) {
			logger.error("Sorry, something wrong!", e);
		}
	}
}
