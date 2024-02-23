package com.stackroute;

import com.stackroute.model.LoanApplication;
import com.stackroute.service.LoanApprovalService;
import com.stackroute.model.Customer;


public class App 
{
    public static void main( String[] args )
    {
         //creating object of LoanApplication

        LoanApplication loanApplication = new LoanApplication.LoanApplicationBuilder ().setApplicationId(1
        ).setLoadAmount(10000).setTenure(5).setCreditScore(5.0f).build();
        System.out.println(loanApplication);

        //create object of Customer

        Customer customer = new Customer.CustomerBuilder().setCustomerId(1).setCustomerName("John").setCustomerAge(25).setLoanApplication(loanApplication).build();

        System.out.println(customer);
        //create object of LoanApprovalService
        //approve the loan application
        
        LoanApprovalService loanApprovalService = LoanApprovalService.getLoanApprovalService();
        System.out.println(loanApprovalService.approveLoanApplication(customer));
  System.out.println("*********************************");
        // create the  LoanApplication object, Customer object  to reject the  LoanApplication
        LoanApplication loanApplication1 = new LoanApplication.LoanApplicationBuilder ().setApplicationId(2).setLoadAmount(1000000).setTenure(5).setCreditScore(3.0f).build();
        System.out.println(loanApplication1);

        Customer customer1 = new Customer.CustomerBuilder().setCustomerId(2).setCustomerName("John").setCustomerAge(25).setLoanApplication(loanApplication1).build();

        System.out.println(customer1);
        System.out.println(loanApprovalService.approveLoanApplication(customer1));

    }
}
