package SerializationDeserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File f = new File("../XYZProject/mySerializedFile.txt");
		FileInputStream fi = new FileInputStream(f);
		ObjectInputStream objInputStream = new ObjectInputStream(fi);
		Manisha obj=(Manisha) objInputStream.readObject();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		
	
		
		
		
		

	}

}
