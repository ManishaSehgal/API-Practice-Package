package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {
	
	public static void captureLogs(String className, String logMessage) {
		DOMConfigurator.configure("../XYZFramework/logsLayout.xml");
		Logger l =Logger.getLogger(className);
		l.info(logMessage);
	}

}
