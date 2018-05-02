package org.bobcats.robotics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReportGenerator {
	private static String teamNbr = "";
	private static String path =  File.separator + "FIRST" + File.separator + "txt";
	private static String filename = path + File.separator + teamNbr + ".report.txt";
	
	static {
		File newDir = new File(path);
		if (!newDir.exists()) {
			try {
				newDir.mkdir();
			} catch (SecurityException e) {
				String err = "ReportGenerator Security exception " + e;
				System.out.println(err);
			}
		}
	}

	public static void setTeamNbr(String team) {
		teamNbr = team;
		filename = path + File.separator + teamNbr + ".report.txt";
	}
	
	public static void resetLog() {
		log("",false);
	}
	
	public static void log(String line) {
		log(line,true);
	}
	
	public static void log(String line,boolean append) {
		BufferedWriter outputStream;

		try {
			// Open the file
			outputStream = new BufferedWriter(new FileWriter(filename, append));
			if (line.length() > 0) {
				outputStream.write(line);
				outputStream.newLine();
			}
			
			// Close the file
			outputStream.close();
		} catch (IOException e) {
			String err = "ReportGenerator. Error writing log  " + e;
			System.out.println(err);
		}
	}
}
