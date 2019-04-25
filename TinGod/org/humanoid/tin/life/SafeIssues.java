package org.humanoid.tin.life;

import java.util.concurrent.CopyOnWriteArrayList;

import org.humanoid.tin.analysis.SafeAnalysisIssues;
import org.humanoid.tin.management.SafeManagementIssues;
import org.humanoid.tin.operation.SafeOperationIssues;
import org.humanoid.tin.process.SafeProcessIssues;

public class SafeIssues{
	public void safeDefinition() {

	}
	public void safeImplementation() {

	}
	public void safeCombination() {

	}
	public void safeExtension() {

	}
	public void safeAckquisition() {

	}
	public void philosothon(CopyOnWriteArrayList<String> read) {
		//a
		new SafeAnalysisIssues().vpcsInitons();
		//o
		new SafeOperationIssues().vpcsInitons();
		//p
		new SafeProcessIssues().vpcsInitons();
		//m
		new SafeManagementIssues().vpcsInitons();
	}
}