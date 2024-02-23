package com.stackroute.model;

 /* customer class with fields customerId,customerName,customerAge,LoanApplication
  * create a Builder class CustomerBuilder for this class as a static inner class.
*/
public class Customer {
    private int customerId;
    private String customerName;
    private int customerAge;
    private LoanApplication loanApplication;
    
    //constructor with one argument
    private Customer(CustomerBuilder customerBuilder) {
        this.customerId = customerBuilder.customerId;
        this.customerName = customerBuilder.customerName;
        this.customerAge = customerBuilder.customerAge;
        this.loanApplication = customerBuilder.loanApplication;
    }
    //getters and setters
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public int getCustomerAge() {
        return customerAge;
    }
    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }
    public LoanApplication getLoanApplication() {
        return loanApplication;
    }
    public void setLoanApplication(LoanApplication loanApplication) {
        this.loanApplication = loanApplication;
    }
    //toString method
    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAge=" + customerAge
                + ", loanApplication=" + loanApplication + "]";
    }
    
    //Builder class
    public static class CustomerBuilder{
        //fields
        private int customerId;
        private String customerName;
        private int customerAge;
        private LoanApplication loanApplication;
        //setters
        public CustomerBuilder setCustomerId(int customerId) {
            this.customerId = customerId;
            return this;
        }
        public CustomerBuilder setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public CustomerBuilder setCustomerAge(int customerAge) {
            this.customerAge = customerAge;
            return this;
        }
        public CustomerBuilder setLoanApplication(LoanApplication loanApplication) {
            this.loanApplication = loanApplication;
            return this;
        }
        //build method
        public Customer build() {
            return new Customer(this);
        }
    }
}
