package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoad {

	public static Properties loadProperties(String FilePathName) throws IOException {
		File f = new File(FilePathName);
		FileInputStream fi = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fi);
		return p;
	}
}
