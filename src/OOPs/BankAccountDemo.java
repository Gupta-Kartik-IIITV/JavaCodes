package OOPs;

//Group Members
/*
Kartik Gupta    202351056
Parmar Jenil    202351096
Priyanshu Kumar 202351113
Manveer Anand   202351080
 */


//Account Class
class Account{

    //accountNumber attribute with protected as the access specifier so only the subclasses
    // of the class Account can access the attribute accountNumber
    protected String accountNumber;

    //Parameterized constructor for the class Account to initialize the value of accountNumber
    Account(String accountNumber){
        this.accountNumber = accountNumber;
    }

    //toString() method which returns the string value of accountNumber
    //The method shows the run-time polymorphism i.e. "Method Overriding"
    //as the toString() method is already available in the Object class in java
    //The Object class is the super class for every other class in java
    @Override
    public String toString(){
        return this.accountNumber;
    }
}

//BankAccount class which inherits the public and protected characteristics of thr superclass Account
class BankAccount extends Account{

    //An Object of class BalanceInfo with default access specifier restricting the property
    // to be accessed by any other class only within the same package
    BalanceInfo balanceInfo;

    //Default Access Specifier
    //Constructor Chaining using the super() method which calls the constructor for the super class
    //The superclass in this case is the Account Class whose constructor is woth default access specifier
    BankAccount(String accountNumber){
        super(accountNumber);
    }
    
    // Default Access Specifier
    // Shallow copy constructor for BankAccount which takes the accountNumber and the BalanceInfo object
    //This then creates a shallow copy for the balanceInfo object inside the BankAccount Class
    BankAccount(String accountNumber,BalanceInfo balanceInfo1){
        super(accountNumber);
        this.balanceInfo = balanceInfo1;
    }
    
    //Public Access Specifier
    //A getter method to get the balanceInfo object from outside the class anywhere possible 
    public BalanceInfo getBalanceInfo() {
        return balanceInfo;
    }
}

//BalanceInfo Class
class BalanceInfo{
    
    //Private attributes for Balance and InterestRates that can only be accessed inside the class only
    private double balance;
    private double interestRate;

    
    //Default Access Specifier
    //A parameterised constructor to initialize balance and interestRate
    BalanceInfo(double balance,double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
    }
    
    
    //Public setter method to set the value of the private "balance" attribute from outside the class
    public void setBalance(int balance){

        this.balance = balance;
    }

    //Public getter method to get the value of the private "balance" attribute from outside the class
    public double getBalance(){

        return this.balance;
    }

    //Public setter method to set the value of the private "interestRate" attribute from outside the class
    public void setInterestRate(int interestRate){

        this.interestRate = interestRate;
    }

    //Public getter method to get the value of the private "interestRate" attribute from outside the class
    public double getInterestRate(){

        return this.interestRate;
    }

    //Public Access Specifier
    //A deposit method with 1 parameter to deposit the amount to the bank account
    public void deposit(double amount){

        this.balance+=amount;
    }

    //Public Access Specifier
    //A deposit method with 2 parameters to deposit the amounts to the bank account
    //The following method shows the compile-time polymorphism "Method Overloading"
    //Here the method signature is almost same exccept the number of parameters
    public void deposit(double amount1,double amount2){

        this.balance+=amount2+amount1;
    }

    //Public Access Specifier
    //A deposit method with 1 parameter to 
    //withdraw a certain amount from the bank account if the account has sufficient balance
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}


//BankAccountDemo class to test the system
public class BankAccountDemo {

    //Test Scenario
    public static void main(String[] args) {
        
        //Creating an object fo the Account class with the account number "A123456" being passed in the constructor
        Account accountObj = new Account("A123456");
        
        //Creating a BalanceInfo object in order to pass in the constructor fo BankAccount
        BalanceInfo balanceInfoObj = new BalanceInfo(1000,2.5);
        
        //Creating a BankAccount object with account number "B987654" and using shallow copy constructor
        //to copy reference to the values form the "balanceInfoObj" i.e. create a shallow copy
        BankAccount bankAccountObj = new BankAccount("B987654",balanceInfoObj);

        //using the public deposit methods to deposit different amounts to the bankAccountObj with accountNumber "B987654"
        bankAccountObj.balanceInfo.deposit(200);
        bankAccountObj.balanceInfo.deposit(50,100);


        //Checking if we can print a protected attribute from a subclass
        System.out.println(bankAccountObj.accountNumber);

        //Checking if we can access a private attribute from an object of the same class
        ///System.out.println(bankAccountObj.balanceInfo.balance);

        //Using the public getter methods to get the balance and the interestRates
        System.out.println(bankAccountObj.balanceInfo.getBalance());
        System.out.println(bankAccountObj.balanceInfo.getInterestRate());


        //Creating another object of BankAccount class using the "shallow copy" technique
        BankAccount bankAccountObj2 = bankAccountObj;

        //Changing the balance of the original bankAccountObj using public setter method
        bankAccountObj.balanceInfo.setBalance(100);

        //Checking if the shallow copy works and the balance in bankAccountObj2 is also changed to 100 or not
        System.out.println(bankAccountObj.balanceInfo.getBalance());
        System.out.println(bankAccountObj2.balanceInfo.getBalance());


    }

    /*
    OUTPUT:

    B987654
    1350.0
    2.5
    100.0
    100.0
     */

    /*
    NOTE:  Did not apply the Deep Copy as in Java Deep Copy cannot be directly implemented
     */
    
}
