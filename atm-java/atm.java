import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math; 

class ATM{
	static int accountNumber;
	static int password;
	static double balance = 10000.50;
	static int count = 3;
	static int storedAccountNumber = 123456;
	static int storedPassword = 8888;
	
	
	
	public static boolean Evaluation(int accountNumber, int password){
		if(accountNumber == storedAccountNumber && password == storedPassword ){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void BalanceEnquiry(){
		System.out.println("Your Account Balance is : " + balance + "Rs. ");
	}
	
	public static void CashWithdraw(double amount){
		if(amount>balance){
			System.out.println("Insufficient Balance");
			System.exit(0);
		}
		else{
			balance = balance - amount;
			System.out.println("Remaining Balance :" + balance + " Rs.");
		}
	}
	
	public static void CashDeposit(double amount){
		balance = balance + amount;
		System.out.println("New Balance :" + balance + " Rs ");
	}
	
    public static void PinGeneration(){
        int pin = 1000 + (int)(Math.random()*100000);
        storedPassword = pin%10000;
        if(storedPassword == 0){
            System.out.println("0000");
        }else{
            System.out.println("Your New Pin is :" + storedPassword);
        }       
    }
	
	
	
	
	public static void main(String args[] ){
		Scanner s = new Scanner(System.in);
		while(count>0){
			System.out.println("Enter Your Account Number :");
			accountNumber = s.nextInt();
			System.out.println("Enter Your Password :");
			password = s.nextInt();
			boolean eval = Evaluation(accountNumber, password);
			if(eval==false)
				count--;
			else
				break;
			if(count!=0) {
				System.out.println("Try Again.");
				System.out.println();
			}
		}
		
	
		if(count==0){
			System.out.println();
			System.out.println("Exit.");
			System.exit(0);
		}
        System.out.println("1. Balance Enquiry");
        System.out.println("2. Cash Withdraw");
        System.out.println("3. Cash Deposit");
        System.out.println("4. Instant Pin Generation");
        
		int n = s.nextInt();
		
	    switch(n){
            case 1:BalanceEnquiry();
            break;
            case 2:{
                System.out.println("Enter the Amount :");
                CashWithdraw(s.nextDouble());
            }
            break;
            case 3:{
                System.out.println("Enter the Amount :");
                CashDeposit(s.nextDouble());
            }
            break;
            case 4: PinGeneration();
            break;
            default:
            System.out.println("You entered the wrong choice");
		}
	}
}