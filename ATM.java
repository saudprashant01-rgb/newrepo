import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Balance = 2000;
        System.out.println("Enter your Account Number");
        int Acc = sc.nextInt();
        if (Acc == 112233) 
            {
                System.out.println(" Welcome to your Acoount Mr. Prashant Saud");
                System.out.println("enter pin (4-digits pin)");
                int pin = sc.nextInt();
                if (pin == 0322);
            {
                    System.out.println("Account verified");
                    System.out.println("Transaction option:-");
                    System.out.println("1) CASH WITHDRAWAL   2) BALANCE INQURIY ");
                    System.out.println("3) CASH DEPOSIT      4) FUND TRANSFER ");
                    int opt = sc.nextInt();
                    if (opt == 1) {
                        System.out.println("Withdrawal option:-");
                        System.out.println("1) Card-Based withdrawal   2) Card-Less withdrawal");
                        int withdrawal = sc.nextInt();
                        if (withdrawal == 1);
                        {
                            System.out.println("insert your card");
                            System.out.println("card number(4-digit) ?");
                            int card = sc.nextInt();
                            if (card == 1111)
                            {
                                System.out.println("your total balance is " + Balance);
                                System.out.println("Enter how much money you want to withdraw");
                                int enterednumber = sc.nextInt();
                                if (enterednumber <= 2000)
                                {
                                    int y;
                                    y = 2000-enterednumber;
                                    System.out.println("total remaining balance = " + y);
                                    System.out.println("thank you Mr. prashant");
                                }
                                else{
                                    System.out.println("Insufficient balance");
                                }
                            }
                            else{
                                System.out.println("entered wrong card number");
                                System.out.println("make sure you have enterd correct answer");
                            }
                        }
                         if (withdrawal==2)
                        {
                            System.out.println("SORRY, For now we don't support cardless withdrawal");
                        }
                     }
                     else if (opt == 2 )
                        {
                            System.out.println(" Total balance in your account is " + Balance);
                        } 

                       else if (opt == 3)
                        {
                            System.out.println("how much balance you want to deposit?");
                            int deposit = sc.nextInt();
                            System.out.println(" NOW, Insert the money into the atm ");
                            System.out.println("enter 1 if you have insert money into atm");
                            int confirm = sc.nextInt();
                            if (confirm == 1)
                            {
                            System.out.println("wait a minute, machine is counting money");
                            System.out.println("again enter 1 to see your new balace");
                            int newbalance = sc.nextInt();
                            if ( newbalance ==1)
                            {
                                int z;
                                z = deposit + Balance;
                                System.out.println("your new balance = " + z);
                            }
                            else{
                                System.out.println("you have entered another number(make sure that you have entered 1 number for confirmation)");
                            }
                            
                            }
                            else{
                                System.out.println("you have entered another number(make sure that you have entered 1 number for confirmation)");
                            }

                        }
                       else if (opt == 4)
                        {
                        System.out.println("this feature is not available yet");
                        }
                        else{
                            System.out.println(" enterd wrong");
                        }

                    

                    }
        
                
                }
                              else
             {
            System.out.println("Entered number is not register");
        }



            
       



        

    }
}
