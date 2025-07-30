package isp;

public class CulturalStudents  implements  ClubMember,Competitor{

	@Override
	public void ParticipateInCompetition() { 
		System.out.println("Participating in dancing competition");
		
	}

	@Override
	public void Joinclub() {
		System.out.println("Joining dancing Club");
		
	}
}
//Benefits of ISP
//1,Class are not burdened with unnecessary task or method.
//2.Interfaces become role specific.
//3.promote flexibility, modularity and maintainability
