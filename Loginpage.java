package w3d4assgnmnt;

public class Loginpage extends Basepage {

	

	public void performCommonTasks() {
	
	System.out.println("perform the tasks");
	}
	
	
		
	
	public static void main(String[] args) {
		
		Loginpage ovr = new Loginpage();
		
		ovr.findElement();
		ovr.clickElemnent();
		ovr.enterText();
		ovr.performCommonTasks();
		

	}

}
