package w3d4assgnmnt;

public  class   Javaconnection implements DatabseConnection{

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
	


