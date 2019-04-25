package org.humanoid.tin.life;

import java.util.concurrent.CopyOnWriteArrayList;

import org.humanoid.tin.analysis.LoveAnalysisIssues;
import org.humanoid.tin.management.LoveManagementIssues;
import org.humanoid.tin.operation.LoveOperationIssues;
import org.humanoid.tin.process.LoveProcessIssues;

public class LoveIssues{
	public void loveDefinition() {

	}
	public void loveImplementation() {

	}
	public void loveCombination() {

	}
	public void loveExtension() {

	}
	public void loveAckquisition() {

	}
	public void philosothon(CopyOnWriteArrayList<String> read) {
		//a
		new LoveAnalysisIssues().vpcsInitons();
		//o
		new LoveOperationIssues().vpcsInitons();
		//p
		new LoveProcessIssues().vpcsInitons();
		//m
		new LoveManagementIssues().vpcsInitons();
	}
}