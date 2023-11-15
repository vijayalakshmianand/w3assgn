package w3d4assgnmnt;

public class Javaconnection1 extends Mysqlconnection{

	public static void main(String[] args) {
		
		Javaconnection1 inter = new Javaconnection1();
		inter.connect();
		inter.disconnect();
		inter.executeUpdate();
		inter.executeQuery();

	}

}
