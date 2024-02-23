package com.stackroute.model;

 /*class  with fields applicationId as int ,loadAmount as double,tenure,creditScore as float
  * create a Builder class LoanApplicationBuilder for this class as a static inner class.
  * In the LoanApplication class, create getter,setter methods , constructor 
  * with one argument ,  LoanApplicationBuilder class object as a argument and toString method.
   *  
  */
public class LoanApplication {
 	private int applicationId;
	private double loadAmount;
	private int tenure;
	private float creditScore;
	
	//constructor with one argument
	private LoanApplication(LoanApplicationBuilder loanApplicationBuilder) {
		this.applicationId = loanApplicationBuilder.applicationId;
		this.loadAmount = loanApplicationBuilder.loadAmount;
		this.tenure = loanApplicationBuilder.tenure;
		this.creditScore = loanApplicationBuilder.creditScore;
	}
	//getters and setters
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public double getLoadAmount() {
		return loadAmount;
	}
	public void setLoadAmount(double loadAmount) {
		this.loadAmount = loadAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public float getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(float creditScore) {
		this.creditScore = creditScore;
	}
	//toString method
	@Override
	public String toString() {
		return "LoanApplication [applicationId=" + applicationId + ", loadAmount=" + loadAmount + ", tenure=" + tenure
				+ ", creditScore=" + creditScore + "]";
	}
	
	//Builder class
	public static class LoanApplicationBuilder{
		//fields
		private int applicationId;
		private double loadAmount;
		private int tenure;
		private float creditScore;
		 
	 
		//getters and setters
        //settter method for applicationId
        public LoanApplicationBuilder setApplicationId(int applicationId) {
            this.applicationId = applicationId;
            return this;
        }

		public LoanApplicationBuilder setLoadAmount(double loadAmount) {
			this.loadAmount = loadAmount;
			return this;
		}
		public LoanApplicationBuilder setTenure(int tenure) {
			this.tenure = tenure;
			return this;
		}
		public LoanApplicationBuilder setCreditScore(float creditScore) {
			this.creditScore = creditScore;
			return this;
		}

		//build method
		public LoanApplication build() {
			return new LoanApplication(this);
		}
	}
}



