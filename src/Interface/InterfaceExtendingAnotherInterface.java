package Interface;

public class InterfaceExtendingAnotherInterface implements Cricket {

	public static void main(String[] args) {
		InterfaceExtendingAnotherInterface a=new InterfaceExtendingAnotherInterface();
		a.createTeam();
		a.teamScore();

	}

	@Override
	public void createTeam() {
		System.out.println("Creating Sunrises Team");
		
	}

	@Override
	public void teamScore() {
		System.out.println("Team score is");
		
	}

}
