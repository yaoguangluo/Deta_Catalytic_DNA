package org.humanoid.tin.life;

import org.humanoid.tin.analysis.WorkAnalysisIssues;
import org.humanoid.tin.management.WorkManagementIssues;
import org.humanoid.tin.operation.WorkOperationIssues;
import org.humanoid.tin.process.WorkProcessIssues;

public class WorkIssues{
	public void workDefinition() {

	}
	public void workImplementation() {

	}
	public void workCombination() {

	}
	public void workExtension() {

	}
	public void workAckquisition() {

	}
	public void philosothon() {
		//a
		new WorkAnalysisIssues().vpcsInitons();
		//o
		new WorkOperationIssues().vpcsInitons();
		//p
		new WorkProcessIssues().vpcsInitons();
		//m
		new WorkManagementIssues().vpcsInitons();
	}
}