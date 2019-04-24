package org.humanoid.tin.life;

import org.humanoid.tin.analysis.StudyAnalysisIssues;
import org.humanoid.tin.management.StudyManagementIssues;
import org.humanoid.tin.operation.StudyOperationIssues;
import org.humanoid.tin.process.StudyProcessIssues;

public class StudyIssues{
	public void studyDefinition() {

	}
	public void studyImplementation() {

	}
	public void studyCombination() {

	}
	public void studyExtension() {

	}
	public void studyAckquisition() {

	}
	public void philosothon(String read) {
		//a
		new StudyAnalysisIssues().vpcsInitons();
		//o
		new StudyOperationIssues().vpcsInitons();
		//p
		new StudyProcessIssues().vpcsInitons();
		//m
		new StudyManagementIssues().vpcsInitons();
	}
}