package repository;

import entity.Team;

public class TeamRepository {

	//should return MI team details
	public static Team getMITeamDetails() {
		
		Team team=new Team();
		team.setId(101);
		team.setTeamName("Mumbai Indian");
		team.setCaptainName("hardik pandya");
		team.setCoachName("jaywardhan");
		team.setQualified(false);
		team.setnRR(2.3f);
		return team;
		
	}		
		//should return RCB team details
		public static Team getRcbTeamDetails() {
			
			Team team1=new Team();
			team1.setId(102);
			team1.setTeamName("ROYAL CHALLEGES BANGLURU");
			team1.setCaptainName("Rajat patidar");
			team1.setCoachName("Andy flower");
			team1.setQualified(true);
			team1.setnRR(10.3f);
			return team1;	
		
	}
		//should return CSK team details
	public static Team getCskTeamDetails() {
			
			Team team2=new Team();
			team2.setId(103);
			team2.setTeamName("Chennai super king");
			team2.setCaptainName("Ruturaj gayakwad");
			team2.setCoachName("Stifen Fleming");
			team2.setQualified(true);
			team2.setnRR(7.3f);
			return team2;	
	}
	
	//should return SRH team details
	public static Team getSrhTeamDetails() {
		
		Team team3=new Team();
		team3.setId(104);
		team3.setTeamName("Sunrisers Hydrabad");
		team3.setCaptainName("pat cummins");
		team3.setCoachName("daniel vettori");
		team3.setQualified(true);
		team3.setnRR(20.3f);
		return team3;	
	
	
}
	//should return KKR team details
		public static Team getKKRTeamDetails() {
			
			Team team4=new Team();
			team4.setId(105);
			team4.setTeamName("KOlkata knight riders");
			team4.setCaptainName("Ajinkey rahane");
			team4.setCoachName("chandrakant pandit");
			team4.setQualified(false);
			team4.setnRR(5.3f);
			return team4;	
		
		
	}
		//should return PBKS team details
				public static Team getPbksTeamDetails() {
					
					Team team5=new Team();
					team5.setId(106);
					team5.setTeamName("Panjab Kings");
					team5.setCaptainName("Shreyas iyer");
					team5.setCoachName("ricky ponting");
					team5.setQualified(false);
					team5.setnRR(10.4f);
					return team5;	
				
				
	}
				//should return GT team details
				public static Team getGtTeamDetails() {
					
					Team team6=new Team();
					team6.setId(107);
					team6.setTeamName("Gujrat titans ");
					team6.setCaptainName("Shubanam gill");
					team6.setCoachName("Ashish Nehara");
					team6.setQualified(true);
					team6.setnRR(12.3f);
					return team6;	
				
				
	}
				//should return LSG team details
				public static Team getLsgTeamDetails() {
					
					Team team7=new Team();
					team7.setId(108);
					team7.setTeamName("Lucknow super giants ");
					team7.setCaptainName("Rishab pant");
					team7.setCoachName("justin langer");
					team7.setQualified(false);
					team7.setnRR(4.1f);
					return team7;	
				
				
	}
				//should return DC team details
				public static Team getDCTeamDetails() {
					
					Team team8=new Team();
					team8.setId(109);
					team8.setTeamName("Delhi capitals ");
					team8.setCaptainName("kL rahul");
					team8.setCoachName("hemang badani");
					team8.setQualified(false);
					team8.setnRR(4.3f);
					return team8;	
				
				
	}   
				//should return RR team details
				public static Team getRrTeamDetails() {
					
					Team team9=new Team();
					team9.setId(110);
					team9.setTeamName("Rajasthan royal");
					team9.setCaptainName("Sanju samson");
					team9.setCoachName("Rahun dravid");
					team9.setQualified(true);
					team9.setnRR(12.3f);
					return team9;	
				
				
	}
				
			
			
	
}
