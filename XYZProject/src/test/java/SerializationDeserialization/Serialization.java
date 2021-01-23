package SerializationDeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Manisha m = new Manisha("Manisha Sehgal", 23);
		
        FileOutputStream fo = new FileOutputStream("mySerializedFile.txt");
		ObjectOutputStream objOutputStrm = new ObjectOutputStream(fo);
		objOutputStrm.writeObject(m);
		objOutputStrm.flush();
		objOutputStrm.close();
		System.out.println("It is done");
		
		
	}

}
