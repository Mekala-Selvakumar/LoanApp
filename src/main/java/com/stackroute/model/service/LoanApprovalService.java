package com.stackroute.model.service;

import com.stackroute.model.Customer;
import com.stackroute.model.LoanApplication;

/*create class  with a method  
 * approveLoanApplication(Customer customer) which will take Customer object as input and return a boolean value.
 * class must use singleton design pattern.
 * synchronize object createion
 * Approve the loan application
 *  if the credit score is greater than 4.0 and loan amount is less than 500000
 *  and tenure is less than 10 years
 *  customer age is between 18 to 65 years
 */
public class LoanApprovalService {
        
        //singleton object
        private static LoanApprovalService loanApprovalService;
        
        //private constructor
        private LoanApprovalService() {
            
        }
        
        //synchronized object creation
        public static synchronized LoanApprovalService getLoanApprovalService() {
            if(loanApprovalService == null) {
                loanApprovalService = new LoanApprovalService();
            }
            return loanApprovalService;
        }
        
        //approveLoanApplication method
        public boolean approveLoanApplication(Customer customer) {
            LoanApplication loanApplication = customer.getLoanApplication();
            if(loanApplication.getCreditScore() > 4.0 && loanApplication.getLoadAmount() < 500000 && loanApplication.getTenure() < 10 && customer.getCustomerAge() >= 18 && customer.getCustomerAge() <= 65) {
                return true;
            }
            return false;
        }
    }   