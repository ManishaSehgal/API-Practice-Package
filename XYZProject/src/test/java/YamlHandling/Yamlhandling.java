package YamlHandling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class Yamlhandling {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
   //		ClassLoader cl = Thread.currentThread().getContextClassLoader();
	//	File f = new File(cl.getResource("file.yaml").getFile());
		ObjectMapper om = new ObjectMapper(new YAMLFactory());
		//Organisation obj = om.readValue(f, Organisation.class);
		Organisation obj = om.readValue(new File("../XYZProject/file.yaml"), Organisation.class);
		System.out.println(ReflectionToStringBuilder.toString(obj, ToStringStyle.MULTI_LINE_STYLE));
	}

}
