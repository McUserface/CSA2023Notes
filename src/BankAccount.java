/**
 * @author Eric Allen
 * @version 1.0
 */

public class BankAccount {

    // instance variables
    private int accNum;
    private double balance;
    private String type;

    /**
     * Standard constructor for BankAccount object
     * @param accNumP int for the account number
     * @param balanceP double for the opening balance
     * @param typeP type of account (Checking, Savings)
     */
    public BankAccount(int accNumP, double balanceP, String typeP){
        accNum = accNumP;
        balance = balanceP;
        type = typeP;
    }

    /**
     * Overloaded constructor
     * @param accNumP int for the account number
     */
    public BankAccount(int accNumP){
        accNum = accNumP;
        balance = 5.00;
        type = "Checking";
    }

    /**
     * toString returns the state of the Bank Accoutn
     * @return String that describes current state
     */
    public String toString(){
        return type + " account " + accNum + " has a blance of " + balance;
    }

    /**
     * Accessor for balance
     * @return doulbe for the current balance
     */
    public double getBalance(){
        return balance;
    }

    /**
     * mutator for the balance; adds interest
     * @param rate double less than 1 for the interest rate as %
     */
    public void addInterest(double rate){
        balance = balance * (1+rate);
    }


}
