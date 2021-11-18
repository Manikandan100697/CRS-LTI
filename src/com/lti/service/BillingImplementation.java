/**
 * 
 */
package com.lti.service;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

import com.lti.bean.Card;
import com.lti.bean.Cheque;
import com.lti.bean.NetBanking;
import com.lti.bean.Payment;
import com.lti.bean.Student;
import com.lti.constant.GenderConstant;
import com.lti.constant.RoleConstant;

/**
 * @author user242
 *
 */

public class BillingImplementation implements BillingInterface {
	
	Card c = new Card();
	NetBanking b = new NetBanking();
	Cheque q = new Cheque();
	Student s = new Student("R101", "Rahul", RoleConstant.STUDENT, "absxd", GenderConstant.MALE, "carsx", "CS", 343, 3, true);
	Payment p = new Payment();
	
	/* (non-Javadoc)
	 * @see com.lti.service.BillingInterface#onlinePayment()
	 */
	public boolean onlinePayment() {
		// TODO Auto-generated method stub
		Scanner onlPay = new Scanner(System.in);
		System.out.println("Enter the mode number by which you will pay:" +  
		"1. Card   2. Net Banking");
		int onlOption = onlPay.nextInt();
		if (onlOption == 1) {
			Scanner getCardNo = new Scanner(System.in);
			System.out.println("Enter the card number: ");
			int cardNo = getCardNo.nextInt();
//			c.setCardNumber(cardNo);
			
			Scanner getCardType = new Scanner(System.in);
			System.out.println("Enter the card type: ");
			String cardType = getCardType.next();
			c.setCardType(cardType);
			return true;
		}
		else if (onlOption == 2) {
			
			Scanner getModeOfTransfer = new Scanner(System.in);
			System.out.println("Enter mode of transfer: ");
			String modeOfTransfer = getModeOfTransfer.next();
//			b.setModeOfTranser(modeOfTransfer);
			
			Scanner getAccountNo = new Scanner(System.in);
			System.out.println("Enter the account number: ");
			int accountNo = getAccountNo.nextInt();
//			b.setAccountNumber(accountNo);
			
			Scanner getIfscCode = new Scanner(System.in);
			System.out.println("Enter the IFSC code: ");
			String ifscCode = getIfscCode.next();
//			b.setIfscCode(ifscCode);
			return true;
		}
		else System.out.println("Enter the valid input");
		return false;
	}

	/* (non-Javadoc)
	 * @see com.lti.service.BillingInterface#offlinePayment()
	 */
	public boolean offlinePayment() {
		// TODO Auto-generated method stub
		Scanner offPay = new Scanner(System.in);
		System.out.println("Enter the mode number by which you will pay:" +  
		"1. Cash   2. Cheque");
		int payOption = offPay.nextInt();
		if (payOption == 1) {
			System.out.println("Kindly pay at the college and perform operations manually");
			return true;
		}
		else if (payOption == 2) {
			Scanner getBankName = new Scanner(System.in);
			System.out.println("Enter bank Name: ");
			String bankName = getBankName.next();
			q.setBankName(bankName);
			
			Scanner getChequeNo = new Scanner(System.in);
			System.out.println("Enter the account number: ");
			int chequeNo = getChequeNo.nextInt();
			q.setChequeNumber(chequeNo);
			
			return true;
		}
		else System.out.println("Enter the valid input");
		return false;
	}
	
	public String randomStringGenerator() {
		int n = 5;
		byte[] array = new byte[256];
        new Random().nextBytes(array);
  
        String randomString
            = new String(array, Charset.forName("UTF-8"));
  
        // Create a StringBuffer to store the result
        StringBuffer r = new StringBuffer();
  
        // Append first 20 alphanumeric characters
        // from the generated random String into the result
        for (int k = 0; k < randomString.length(); k++) {
  
            char ch = randomString.charAt(k);
  
            if (((ch >= 'a' && ch <= 'z')
                 || (ch >= 'A' && ch <= 'Z')
                 || (ch >= '0' && ch <= '9'))
                && (n > 0)) {
  
                r.append(ch);
                n--;
            }
        }
  
        // return the resultant string
        return r.toString();
	}

	
	public String payment() {
		// TODO Auto-generated method stub
		System.out.println("This payment is being made for the user: " + s.getStudentId());
		String referenceId = randomStringGenerator();
		System.out.println("Kindly note your reference id: " + referenceId);
		p.setStudentId(s.getStudentId());
		p.setReferenceId(referenceId);
		float pay = 50000;
		System.out.println("The amount to be paid is: " + pay);
		p.setAmount(pay);
		p.setStatus(false);
		Scanner payMode = new Scanner(System.in);
		System.out.println("Enter the mode number by which you will pay:" +  
		"1. Offline   2. Online");
		int modeOfPay = payMode.nextInt();
		if (modeOfPay == 1) {
			offlinePayment();
			if (offlinePayment() == true) {
				p.setStatus(true);
				return "Amount paid successfully";
				//sendNotification(); To be implemented in admin interface
			}
		}
		else if (modeOfPay == 2) {
			onlinePayment();
			if (onlinePayment() == true) {
				p.setStatus(true);
				return "Amount paid successfully";
				//sendNotification(); To be implemented in admin interface
			}
		}
		else System.out.println("Pay again.");
		return "Payment Failed";
	}

	

}
