import java.util.Scanner;
//import java.time.LocalDate; 

public class bankingFcility {
    
    public void fcility(){

        Scanner scan = new Scanner(System.in);

        int pin,choice,balance,withdrawl,deposit,total;
        float invenstment_amount;
                
            System.out.println("\n");
        System.out.print("Enter your security pin:- ");
        pin=scan.nextInt();
        
        /*  1st member - 4546
         2nd meber - 3456
         3rd one - 4575*/
            
           

        if(pin == 4546){
            
            balance=1000;

                System.out.println("\n");
            System.out.println("Account holder name:-  Soumyadip Adak");
            System.out.println("Account no:- 342352345");
                        System.out.println("");

            System.out.println("\n");
        System.out.println("Welcome to banking facility!");
        System.out.println("1.Balance enquiry.");
        System.out.println("2.Deposit.");
        System.out.println("3.Withdrawl");
        System.out.println("4.Re-invenstment of the balance at 5% rete of interest for 2 years.");
        System.out.println("5.Exit");
            System.out.println("\n");


                System.out.print("If you have any quary pelse seclect any option:- ");
                choice=scan.nextInt();
                    System.out.println("\n");

                switch(choice){
                    case 1:
                        System.out.println("Youre current balance is "+balance+"/-");
                            System.out.println("\n");
                    break;
                    case 2:
                        System.out.print("Enter your deposit amount:- ");
                        deposit = scan.nextInt();
                        total= balance+deposit;
                        System.out.println("Your credited amount is "+deposit+"/- \n now your recent balance is "+total+"/-");
                            System.out.println("\n");
                    break;
                    case 3:
                        System.out.print("Enter your  withdrawl amount:-  ");
                        withdrawl=scan.nextInt();
                        if(withdrawl<=balance){
                                total = withdrawl - balance;

                                System.out.println("Successful your withdrawl.");

                                System.out.println("Your dipost amount is: "+withdrawl+"/- \n now your current balance is: "+total+"/-");
                                    System.out.println("\n");
                            }
                            else{
                                System.out.println("Insufficient balance.\n");
                            }
                    break;
                    case 4:
                          invenstment_amount=((balance*5)/100)*2;
                          total = (int) invenstment_amount+balance;

                          System.out.println("your investment amount is "+invenstment_amount+"/- \n now your current blacne is: "+total);
                            System.out.println("\n");
                    break;
                    case 5:
                            System.out.println("Thank you please visit again.\n");
                             System.out.println("\n");
                    break;

                }

        }
        
        else if(pin == 3456){

             balance=10000;

                System.out.println("\n");
            System.out.println("Account holder name:- Sujan Ghorai.\n");
            System.out.println("Account no:- 34235233434");
                        System.out.println("");

            System.out.println("\n");
        System.out.println("Welcome to banking facility!");
        System.out.println("1.Balance enquiry.");
        System.out.println("2.Deposit.");
        System.out.println("3.Withdrawl");
        System.out.println("4.Re-invenstment of the balance at 5% rete of interest for 2 years.");
        System.out.println("5.Exit");
            System.out.println("\n");

            
                System.out.print("If you have any quary pelse seclect any option:- ");
                choice=scan.nextInt();
                    System.out.println("\n");

                switch(choice){
                    case 1:
                        System.out.println("Youre current balance is "+balance+"/-");
                            System.out.println("\n");
                    break;
                    case 2:
                        System.out.print("Enter your deposit amount:- ");
                        deposit = scan.nextInt();
                        total= balance+deposit;
                        System.out.println("Your credited amount is "+deposit+"/- \n now your recent balance is "+total+"/-");
                            System.out.println("\n");
                    break;
                    case 3:
                        System.out.print("Enter your  withdrawl amount:-  ");
                        withdrawl=scan.nextInt();
                        if(withdrawl<=balance){
                                total = withdrawl - balance;

                                System.out.println("Successful your withdrawl.");

                                System.out.println("Your dipost amount is: "+withdrawl+"/- \n now your current balance is: "+total+"/-");
                                    System.out.println("\n");
                            }
                            else{
                                System.out.println("Insufficient balance.\n");
                            }
                    break;
                    case 4:
                          invenstment_amount=((balance*5)/100)*2;
                          total = (int) invenstment_amount+balance;

                          System.out.println("your investment amount is "+invenstment_amount+"/- \n now your current blacne is: "+total);
                            System.out.println("\n");
                    break;
                    case 5:
                            System.out.println("Thank you please visit again.\n");
                             System.out.println("\n");
                    break;

                }

        }

        else if(pin == 4575){

             balance=4545455;

                System.out.println("\n");
            System.out.println("Account holder name:-  Riyon Maity\n");
            System.out.println("Account no:- 34235233432");
                        System.out.println("");

            System.out.println("\n");
        System.out.println("Welcome to banking facility!");
        System.out.println("1.Balance enquiry.");
        System.out.println("2.Deposit.");
        System.out.println("3.Withdrawl");
        System.out.println("4.Re-invenstment of the balance at 5% rete of interest for 2 years.");
        System.out.println("5.Exit");
            System.out.println("\n");

            
                System.out.print("If you have any quary pelse seclect any option:- ");
                choice=scan.nextInt();
                    System.out.println("\n");

                switch(choice){
                    case 1:
                        System.out.println("Youre current balance is "+balance+"/-");
                            System.out.println("\n");
                    break;
                    case 2:
                        System.out.print("Enter your deposit amount:- ");
                        deposit = scan.nextInt();
                        total= balance+deposit;
                        System.out.println("Your credited amount is "+deposit+"/- \n now your recent balance is "+total+"/-");
                            System.out.println("\n");
                    break;
                    case 3:
                        System.out.print("Enter your  withdrawl amount:-  ");
                        withdrawl=scan.nextInt();
                        if(withdrawl<=balance){
                                total = withdrawl - balance;

                                System.out.println("Successful your withdrawl.");

                                System.out.println("Your dipost amount is: "+withdrawl+"/- \n now your current balance is: "+total+"/-");
                                    System.out.println("\n");
                            }
                            else{
                                System.out.println("Insufficient balance.\n");
                            }
                    break;
                    case 4:
                          invenstment_amount=((balance*5)/100)*2;
                          total = (int) invenstment_amount+balance;

                          System.out.println("your investment amount is "+invenstment_amount+"/- \n now your current blacne is: "+total);
                            System.out.println("\n");
                    break;
                    case 5:
                            System.out.println("Thank you please visit again.\n");
                             System.out.println("\n");
                    break;

                }

        }

        else{
             System.out.println("\n");
            System.out.println("Error!");            
            System.out.println("envalid input!");     
             System.out.println("\n");        
        }
    }

       
    
    public static void main(String[] args){
        bankingFcility n= new bankingFcility();
        n.fcility();
    }
}

  