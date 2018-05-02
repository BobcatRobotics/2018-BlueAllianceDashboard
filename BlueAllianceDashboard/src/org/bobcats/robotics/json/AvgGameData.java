package org.bobcats.robotics.json;

public class AvgGameData {
	private int nbrGames = 0;
	private String teamnbr;
	
	private double autoowner;
	private double autopoints;
	private double autoQuestCnt;
	private double autorunpts;
	private double autoscale;
	private double autoatzeroCnt;
	private double autoswitch;
	private double endgame;
	private double facethebossCnt;
	private double fouls;
	private double rp;
	private double techfoul;
	private double teleopownpts;
	private double teleoppts;
	private double teleopsc;
	private double teleopsw;
	private double totalPts;
	private double vault;
//	private double opptsw;
//	private double opptsc;

	private AvgGameData() {
		super();
		nbrGames = 0;
		autoowner= 0.0;
		autopoints= 0.0;
		autoQuestCnt= 0.0;
		autorunpts= 0.0;
		autoscale= 0.0;
		autoatzeroCnt= 0.0;
		autoswitch= 0.0;
		endgame= 0.0;
		facethebossCnt= 0.0;
		fouls= 0.0;
		rp= 0.0;
		techfoul= 0.0;
		teleopownpts= 0.0;
		teleoppts= 0.0;
		teleopsc= 0.0;
		teleopsw= 0.0;
		totalPts= 0.0;
		vault= 0.0;	
	}

	public AvgGameData(String team) {
		this();
		teamnbr = team;
	}
	
	public void addScores(Scores us/*,Scores them */) {
		autoowner += us.getAutoOwnershipPoints();
		autopoints += us.getAutoPoints();
		autoQuestCnt += ("X".equals(us.getAutoQuestRankingPoint()) ? 1.0 : 0.0);
		autorunpts += us.getAutoRunPoints();
		autoscale += us.getAutoScaleOwnershipSec();
		autoatzeroCnt += ("X".equals(us.getAutoSwitchAtZero()) ? 1.0 : 0.0 );
		autoswitch += us.getAutoSwitchOwnershipSec();
		endgame += us.getEndgamePoints();
		facethebossCnt += ("X".equals(us.getFaceTheBossRankingPoint())? 1.0 : 0.0);
		fouls += us.getFoulCount();
		rp += us.getRp();
		techfoul += us.getTechFoulCount();
		teleopownpts += us.getAutoOwnershipPoints();
		teleoppts += us.getTeleopPoints();
		teleopsc += us.getTeleopScaleOwnershipSec();
		teleopsw += us.getTeleopSwitchOwnershipSec();
		totalPts += us.getTotalPoints();
		vault += us.getVaultPoints();
		nbrGames++;
	}

	public int getNbrGames() {
		return nbrGames;
	}

	public String getTeamnbr() {
		return teamnbr;
	}

	public double getAutoowner() {
		return autoowner / nbrGames;
	}

	public double getAutopoints() {
		return autopoints / nbrGames;
	}

	public double getAutoQuestCnt() {
		return autoQuestCnt / nbrGames;
	}

	public double getAutorunpts() {
		return autorunpts / nbrGames;
	}

	public double getAutoscale() {
		return autoscale / nbrGames;
	}

	public double getAutoatzeroCnt() {
		return autoatzeroCnt / nbrGames;
	}

	public double getAutoswitch() {
		return autoswitch / nbrGames;
	}

	public double getEndgame() {
		return endgame / nbrGames;
	}

	public double getFacethebossCnt() {
		return facethebossCnt / nbrGames;
	}

	public double getFouls() {
		return fouls / nbrGames;
	}

	public double getRp() {
		return rp / nbrGames;
	}

	public double getTechfoul() {
		return techfoul / nbrGames;
	}

	public double getTeleopownpts() {
		return teleopownpts / nbrGames;
	}

	public double getTeleoppts() {
		return teleoppts / nbrGames;
	}

	public double getTeleopsc() {
		return teleopsc / nbrGames;
	}

	public double getTeleopsw() {
		return teleopsw / nbrGames;
	}

	public double getTotalPts() {
		return totalPts / nbrGames;
	}

	public double getVault() {
		return vault / nbrGames;
	}

	public String averageString() {
		String fmt = "        %4.1f %4.1f    %5.1f %5.1f      %4.1f";
		return String.format(fmt, autoscale / nbrGames, autoswitch / nbrGames, teleopsc / nbrGames, teleopsw / nbrGames,
				 vault / nbrGames);
	}

	@Override
	public String toString() {
		return "AvgGameData [nbrGames=" + nbrGames + ", autoowner=" + autoowner + ", autopoints=" + autopoints
				+ ", autoQuestCnt=" + autoQuestCnt + ", autorunpts=" + autorunpts + ", autoscale=" + autoscale
				+ ", autoatzeroCnt=" + autoatzeroCnt + ", autoswitch=" + autoswitch + ", endgame=" + endgame
				+ ", facethebossCnt=" + facethebossCnt + ", fouls=" + fouls + ", rp=" + rp + ", techfoul=" + techfoul
				+ ", teleopownpts=" + teleopownpts + ", teleoppts=" + teleoppts + ", teleopsc=" + teleopsc
				+ ", teleopsw=" + teleopsw + ", totalPts=" + totalPts + ", vault=" + vault + "]";
	}


}
