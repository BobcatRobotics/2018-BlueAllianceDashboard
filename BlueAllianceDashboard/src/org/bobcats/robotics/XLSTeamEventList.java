package org.bobcats.robotics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.bobcats.robotics.json.SimpleEvent;
import org.bobcats.robotics.json.Team;
import org.bobcats.robotics.sort.TeamCompare;

public class XLSTeamEventList extends XLSReportGenerator {
	private String teamNbr = "frc177";
	private String reportName = "events.xlsx";
	
	private XLSTeamEventList() {
		super();
	}
	
	public XLSTeamEventList(String team) {
		this();
		teamNbr = team;
		String teamnbr = team.substring(3);
		reportName = "team"+teamnbr+"_events.xlsx";
	}
	
	
	public String getReportName() {
		return reportName;
	}

	public List<String> getData() throws IOException {
		List<String> eventList = new ArrayList<String>();
		List<SimpleEvent> evtList = http.callListURL(SimpleEvent.class, teamEventListURL, teamNbr,"2018");
		int rowNbr = 0;
		for (SimpleEvent evt : evtList) {
			//System.out.println(evt);
//			if (evt.getDistrict() != null) {
				eventList.add(evt.getKey());
				
				Row row = sheet.createRow(rowNbr);
				Cell cell = row.createCell(0);
				cell.setCellValue((String)evt.getKey());
				Cell cell2 = row.createCell(1);
				cell2.setCellValue((String)evt.getName());
				Cell cell3 = row.createCell(2);
				cell3.setCellValue((String)String.format("Start: %s - End: %s", evt.getStart_date(),evt.getEnd_date()));
				rowNbr++;
//			}
		}
		return eventList;
	}
}
