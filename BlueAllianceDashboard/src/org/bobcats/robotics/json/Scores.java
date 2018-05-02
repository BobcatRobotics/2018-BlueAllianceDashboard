package org.bobcats.robotics.json;

public class Scores {
	private String adjustPoints;
	private int autoOwnershipPoints; // (2)
	private int autoPoints; // (3)
	private String autoQuestRankingPoint; // (4)
	private String autoRobot1;
	private String autoRobot2;
	private String autoRobot3;
	private int autoRunPoints; // (5)
	private int autoScaleOwnershipSec; // (6)
	private String autoSwitchAtZero; // (7) "true" "false"
	private int autoSwitchOwnershipSec; // (8)
	private int endgamePoints; // (9)
	private String endgameRobot1;
	private String endgameRobot2;
	private String endgameRobot3;
	private String faceTheBossRankingPoint; // (10)
	private int foulCount; // (11)
	private int foulPoints;
	private int rp; // (12)
	private String tba_gameData;
	private int techFoulCount; // (13)
	private int teleopOwnershipPoints; // (14)
	private int teleopPoints; // (15)
	private String teleopScaleBoostSec;
	private String teleopScaleForceSec;
	private int teleopScaleOwnershipSec; // (16)
	private String teleopSwitchBoostSec;
	private String teleopSwitchForceSec;
	private int teleopSwitchOwnershipSec; // (17)
	private int totalPoints; // (18)
	private String vaultBoostPlayed;
	private String vaultBoostTotal;
	private String vaultForcePlayed;
	private String vaultForceTotal;
	private String vaultLevitatePlayed;
	private String vaultLevitateTotal;
	private int vaultPoints; // (19)

	public String getAutoQuestRankingPoint() {
		String val = "?";
		if ("true".equals(autoQuestRankingPoint))
			val = "X";
		else if ("false".equals(autoQuestRankingPoint))
			val = " ";
		return val;
	}

	public String getAutoSwitchAtZero() {
		String val = "?";
		if ("true".equals(autoSwitchAtZero))
			val = "X";
		else if ("false".equals(autoSwitchAtZero))
			val = " ";
		return val;
	}

	public int getAutoScaleOwnershipSec() {
		return autoScaleOwnershipSec;
	}

	public int getAutoSwitchOwnershipSec() {
		return autoSwitchOwnershipSec;
	}

	public int getAutoOwnershipPoints() {
		return autoOwnershipPoints;
	}

	public String getFaceTheBossRankingPoint() {
		String val = "?";
		if ("true".equals(faceTheBossRankingPoint))
			val = "X";
		else if ("false".equals(faceTheBossRankingPoint))
			val = " ";
		return val;
	}

	public int getTeleopScaleOwnershipSec() {
		return teleopScaleOwnershipSec;
	}

	public void setTeleopScaleOwnershipSec(int teleopScaleOwnershipSec) {
		this.teleopScaleOwnershipSec = teleopScaleOwnershipSec;
	}

	public int getTeleopSwitchOwnershipSec() {
		return teleopSwitchOwnershipSec;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public int getVaultPoints() {
		return vaultPoints;
	}

	
	public int getAutoPoints() {
		return autoPoints;
	}

	public int getAutoRunPoints() {
		return autoRunPoints;
	}

	public int getEndgamePoints() {
		return endgamePoints;
	}

	public int getFoulCount() {
		return foulCount;
	}

	public int getRp() {
		return rp;
	}

	public int getTechFoulCount() {
		return techFoulCount;
	}

	public int getTeleopPoints() {
		return teleopPoints;
	}

	public String endGameStatus(int teamNbr) {
		String end = "";
		if (teamNbr == 1)
			end = endgameRobot1;
		else if (teamNbr == 2)
			end = endgameRobot2;
		else if (teamNbr == 3)
			end = endgameRobot3;
		return end;
	}

	@Override
	public String toString() {
		return "Scores [adjustPoints=" + adjustPoints + ", autoOwnershipPoints=" + autoOwnershipPoints + ", autoPoints="
				+ autoPoints + ", autoQuestRankingPoint=" + autoQuestRankingPoint + ", autoRobot1=" + autoRobot1
				+ ", autoRobot2=" + autoRobot2 + ", autoRobot3=" + autoRobot3 + ", autoRunPoints=" + autoRunPoints
				+ ", autoScaleOwnershipSec=" + autoScaleOwnershipSec + ", autoSwitchAtZero=" + autoSwitchAtZero
				+ ", autoSwitchOwnershipSec=" + autoSwitchOwnershipSec + ", endgamePoints=" + endgamePoints
				+ ", endgameRobot1=" + endgameRobot1 + ", endgameRobot2=" + endgameRobot2 + ", endgameRobot3="
				+ endgameRobot3 + ", faceTheBossRankingPoint=" + faceTheBossRankingPoint + ", foulCount=" + foulCount
				+ ", foulPoints=" + foulPoints + ", rp=" + rp + ", tba_gameData=" + tba_gameData + ", techFoulCount="
				+ techFoulCount + ", teleopOwnershipPoints=" + teleopOwnershipPoints + ", teleopPoints=" + teleopPoints
				+ ", teleopScaleBoostSec=" + teleopScaleBoostSec + ", teleopScaleForceSec=" + teleopScaleForceSec
				+ ", teleopScaleOwnershipSec=" + teleopScaleOwnershipSec + ", teleopSwitchBoostSec="
				+ teleopSwitchBoostSec + ", teleopSwitchForceSec=" + teleopSwitchForceSec
				+ ", teleopSwitchOwnershipSec=" + teleopSwitchOwnershipSec + ", totalPoints=" + totalPoints
				+ ", vaultBoostPlayed=" + vaultBoostPlayed + ", vaultBoostTotal=" + vaultBoostTotal
				+ ", vaultForcePlayed=" + vaultForcePlayed + ", vaultForceTotal=" + vaultForceTotal
				+ ", vaultLevitatePlayed=" + vaultLevitatePlayed + ", vaultLevitateTotal=" + vaultLevitateTotal
				+ ", vaultPoints=" + vaultPoints + "]";
	}
}
