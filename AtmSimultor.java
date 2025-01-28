import java.util.Scanner;
public class AtmSimultor {
    public static void main(String[] args) {
        //Enquiry eq = new Enquiry();
        int balance = 10000;
        //int pin = 2006;
        //int amount;
        Scanner sc = new Scanner(System.in);
        // enter pin if(pin =123)--valid else invalid..after options '''welcome,,while(true){optioins 1234};;int options,switch(option)
        System.out.println("enter pin");
        int pin = sc.nextInt();
        if(pin == 2006){
            System.out.println("valid pin");
        }else{
            System.out.println("invalid pin. please renter the pin");
        }
        while(true){
            System.out.println(" welcome to canara bank");
            System.out.println("A: balance enquriy ");
            System.out.println("B: cash withdrawal");
            System.out.println("C: change pin");
            System.out.println("D: cash deposit");
            System.out.println("F: bank balance after withdrawal");
            System.out.println("E: exit");
            System.out.println("choose a option");
            String option = sc.nextLine();
            if(option == "E"){
                System.out.println("closing ATM simultor");
                break;
            }
            
            switch(option){

                
                case "A" :
                System.out.println(" Your Account balance is : 10000");
                break;
                case "B" :
                System.out.println("ENTER THE AMOUNT TO BE WITHDRAWAL :");
                int amount = sc.nextInt();
                System.out.println("withdrawed amount:" + amount);
                break;
                case "C" :
                System.out.println("OLD PIN:2006");
                System.out.println("ENTE R NEW PIN :");
                int newpin = sc.nextInt();
                System.out.println("NEW PIN:" + newpin);
                System.out.println("PIN SUCCESFULLY UPDATED");
                break;
                case "D": 
                System.out.println("ENTER AMOUNT TO DEPOSIT :");
                int depositamount = sc.nextInt();
                int newBalance = balance + depositamount;
                System.out.println("NEW BANK BALANCE AFTER DEPOSITING IS :" + newBalance);
                break;
                case "F" :
                System.out.println("BALANCE AFTER WITHDRAWAL:");
                //int totalBalance = sc.nextInt();
                //int newBalance = sc.nextInt();
                //int amount = sc.nextInt();
                //int totalBalance = newBalance - amount;
                //System.out.println(" ENTIRE BALANCE:" + totalBalance );
                //default:
                //System.out.println("SORRY!!!...U DONT HAVE ANY ACCOUNT IN OUR BANK");
                //sc.close();
            }
        }
        sc.close();
       // Account ac = new Account();
        //System.out.printf("account details ", ac);

        
    }
    
}
//class Account{
    //static void Acc(){
        //Scanner sc = new Scanner(System.in);
        //System.out.println("account holdername:");
        //String holdername = sc.next();
        //System.out.println("enter accountnumber:");
        //t accountNumber = sc.nextInt();
        //String details = 
        //sc.close();




     

