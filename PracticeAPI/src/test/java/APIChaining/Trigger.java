package APIChaining;

import java.io.FileNotFoundException;

public class Trigger {

	public static void main(String[] args) throws FileNotFoundException {
		String id = PostRequest.post_request("../PracticeAPI/src/test/java/APIChaining/PutBodyData.json");
        String uri = "http://localhost:3000/employeesInfo/"+id;
        System.out.println("*************************");
        System.out.println("URI is: "+uri);
        
        GetRequest.getRequest(uri);
        
       
	}

}
