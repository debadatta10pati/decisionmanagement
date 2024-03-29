package com.brms.drools;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CustomerData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer income;
	private java.lang.Integer loan;
	private java.lang.String loanApproval;
	private java.lang.Integer creditScore;

	private java.lang.String typeOfLoan;

	public CustomerData() {
	}

	public java.lang.Integer getIncome() {
		return this.income;
	}

	public void setIncome(java.lang.Integer income) {
		this.income = income;
	}

	public java.lang.Integer getLoan() {
		return this.loan;
	}

	public void setLoan(java.lang.Integer loan) {
		this.loan = loan;
	}

	public java.lang.String getLoanApproval() {
		return this.loanApproval;
	}

	public void setLoanApproval(java.lang.String loanApproval) {
		this.loanApproval = loanApproval;
	}

	public java.lang.Integer getCreditScore() {
		return this.creditScore;
	}

	public void setCreditScore(java.lang.Integer creditScore) {
		this.creditScore = creditScore;
	}

	public java.lang.String getTypeOfLoan() {
		return this.typeOfLoan;
	}

	public void setTypeOfLoan(java.lang.String typeOfLoan) {
		this.typeOfLoan = typeOfLoan;
	}

	public CustomerData(java.lang.Integer income, java.lang.Integer loan,
			java.lang.String loanApproval, java.lang.Integer creditScore,
			java.lang.String typeOfLoan) {
		this.income = income;
		this.loan = loan;
		this.loanApproval = loanApproval;
		this.creditScore = creditScore;
		this.typeOfLoan = typeOfLoan;
	}

}