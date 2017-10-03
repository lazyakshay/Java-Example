package java_example;

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CricketPlayer cp = new CricketPlayer("Ms Dhoni", "India", 34, 34232);
		TennisPlayer tp = new TennisPlayer(44, "Sania M", "india", 342, 22);
		
		
		System.out.println("Cricket Player Name : " + cp.getName());
		System.out.println("Cricket Player Runs : " + cp.getRuns());
		System.out.println("Tennis Player Name : " + tp.getName());
		System.out.println("Tennis Player Aces : " + tp.getAces());
		

	}

}
