package w3d4assgnmnt;

public class APIClient {

	public void sendRequest(String endpoint) {
		
		System.out.println("endpoint");
	}
	
		
    public void sendRequest(String endpoint,String  requestBody, boolean requestStatus) {
    
     System.out.println("string endpoint ,+requestBody, +boolean requestStatus ");
    
    }
	
	public static void main(String[] args) {
    
		APIClient send = new APIClient();
		send.sendRequest("completed");
		send.sendRequest(null, null, false);
		
		
		
	}
	
	
}
