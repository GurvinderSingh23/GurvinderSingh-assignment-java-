package com.yash.studentresult;

public class Result {

	private int rollNo;
	private double mathsMarks;
	private double hindiMarks;
	private double englishMarks;
	private double scienceMarks;
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public double getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(double mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public double getHindiMarks() {
		return hindiMarks;
	}
	public void setHindiMarks(double hindiMarks) {
		this.hindiMarks = hindiMarks;
	}
	public double getEnglishMarks() {
		return englishMarks;
	}
	public void setEnglishMarks(double englishMarks) {
		this.englishMarks = englishMarks;
	}
	public double getScienceMarks() {
		return scienceMarks;
	}
	public void setScienceMarks(double scienceMarks) {
		this.scienceMarks = scienceMarks;
	}
	@Override
	public String toString() {
		return "Result [mathsMarks=" + mathsMarks + ", hindiMarks=" + hindiMarks + ", englishMarks=" + englishMarks
				+ ", scienceMarks=" + scienceMarks + "]";
	}
	
	
}
