package service;
import entity.Team;
import repository.TeamRepository;
public class TeamService {
 
	   public void printTeamDetails() {
		   Team team=TeamRepository.getMITeamDetails();
		   Team team1=TeamRepository.getRcbTeamDetails();
		   Team team2=TeamRepository.getCskTeamDetails();
		   Team team3=TeamRepository.getSrhTeamDetails();
		   Team team4=TeamRepository.getKKRTeamDetails();
		   Team team5=TeamRepository.getPbksTeamDetails();
		   Team team6=TeamRepository.getGtTeamDetails();
		   Team team7=TeamRepository.getLsgTeamDetails();
		   Team team8=TeamRepository.getDCTeamDetails();
		   Team team9=TeamRepository.getRrTeamDetails();
		   
		   System.out.println(team.getId()+"\n"+team.getTeamName()+"\n"+team.getCaptainName()+"\n"+team.getCoachName()+"\n"+team.getnRR()+"\n"+team.isQualified()+"\n");
		   System.out.println(team1.getId()+"\n"+team1.getTeamName()+"\n"+team1.getCaptainName()+"\n"+team1.getCoachName()+"\n"+team1.getnRR()+"\n"+team1.isQualified()+"\n");
		   System.out.println(team2.getId()+"\n"+team2.getTeamName()+"\n"+team2.getCaptainName()+"\n"+team2.getCoachName()+"\n"+team2.getnRR()+"\n"+team2.isQualified()+"\n");
		   System.out.println(team3.getId()+"\n"+team3.getTeamName()+"\n"+team3.getCaptainName()+"\n"+team3.getCoachName()+"\n"+team3.getnRR()+"\n"+team3.isQualified()+"\n");
		   System.out.println(team4.getId()+"\n"+team4.getTeamName()+"\n"+team4.getCaptainName()+"\n"+team4.getCoachName()+"\n"+team4.getnRR()+"\n"+team4.isQualified()+"\n");
		   System.out.println(team5.getId()+"\n"+team5.getTeamName()+"\n"+team5.getCaptainName()+"\n"+team5.getCoachName()+"\n"+team5.getnRR()+"\n"+team5.isQualified()+"\n");
		   System.out.println(team6.getId()+"\n"+team6.getTeamName()+"\n"+team6.getCaptainName()+"\n"+team6.getCoachName()+"\n"+team6.getnRR()+"\n"+team6.isQualified()+"\n");
		   System.out.println(team7.getId()+"\n"+team7.getTeamName()+"\n"+team7.getCaptainName()+"\n"+team7.getCoachName()+"\n"+team7.getnRR()+"\n"+team7.isQualified()+"\n");
		   System.out.println(team8.getId()+"\n"+team8.getTeamName()+"\n"+team8.getCaptainName()+"\n"+team8.getCoachName()+"\n"+team8.getnRR()+"\n"+team8.isQualified()+"\n");
		   System.out.println(team9.getId()+"\n"+team9.getTeamName()+"\n"+team9.getCaptainName()+"\n"+team9.getCoachName()+"\n"+team9.getnRR()+"\n"+team9.isQualified()+"\n");


		 
	   }
}
