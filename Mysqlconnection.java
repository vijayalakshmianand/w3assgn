package w3d4assgnmnt;

public abstract class Mysqlconnection implements DatabseConnection {

	
	public void executeQuery() {
		System.out.println("excute the query");
		
	}
	
	  public void connect() {
			
	    	 System.out.println("connect the data");
	    	 
	    	    	      }
		public void disconnect() {
			
			System.out.println("disconnect the data");
	     
	}
		
		
			    public void executeUpdate() {
			    	
			    	System.out.println("update and execute");
			
		}
	public static void main(String[] args) {
		
		
			Javaconnection inter = new Javaconnection();
			inter.connect();
			inter.disconnect();
			inter.executeUpdate();
			
				

	}

}
