package Calculator;

import java.util.Scanner;

public class Calculator_java {

    public static void main(String[] args) {

        
                    //Identification of Programmer
//        for (int i =1; i <=3; i++) {
//            for (int j = 1; j <=10; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
            System.out.println("    A D S S M D");
            System.out.println("     B U   A A");

            for (int i = 1; i <= 2; i++) {
                for (int j = 1; j <= 30; j++) {
                    System.out.print("-");
                }
                System.out.println("");
            }

            //End fo Identification of Programmer
        
        
        while (true) {


//         Startin Program
            Scanner input = new Scanner(System.in);
            int Num1, Num2, User_input;

//        Screen Show
            System.out.println("What do you want to do? Select Your Option..");
            System.out.println("1. To Sum, Please Press 1");
            System.out.println("2. To Do Substraction, Please Press 2");
            System.out.println("3. To Do Multiplication, Please Press 3");
            System.out.println("4. To Divide, Please Press 4");
            System.out.println("5. To Make Remainder, Please Press 5");
            System.out.println("6. To Exit, Please Press 0");

            System.out.print("Enter Your Number: ");
            User_input = input.nextInt();

            
            if(User_input==1 || User_input==2 || User_input==3 || User_input==4 ||User_input==5 || User_input==0 ){
                
           
            
//        Exiting Program Start
            if (User_input == 0) {
               System.out.println("Thank Your For Using OUR Program");
                break;
            }

//        Exiting Program End
//        Getting Input
            System.out.print("Enter First Integer Number: ");
            Num1 = input.nextInt();

            System.out.print("Enter Second Integer Number: ");
            Num2 = input.nextInt();

            if (User_input == 1) {
                System.out.println(Num1 + "+" + Num2 + "=" + (Num1 + Num2));
            } else if (User_input == 2) {
                System.out.println(Num1 + "-" + Num2 + "=" + (Num1 - Num2));
            } else if (User_input == 3) {
                System.out.println(Num1 + "*" + Num2 + "=" + (Num1 * Num2));
            } else if (User_input == 4) {
                System.out.println(Num1 + "/" + Num2 + "=" + (Num1 / Num2));
                System.out.println("Your Remainder Is " + (Num1 % Num2));
            } else if (User_input == 5) {
                System.out.println(Num1 + "%" + Num2 + "=" + (Num1 % Num2));
            } else {
                System.out.println("Your Input Is Wrong!");
            }
            
            }else{
                System.out.println("You Entered A Wrong Number!");
            }

            System.out.println("");
            System.out.println("Your Calculation Is Finished!");
            System.out.println("Thank You!");

            System.out.println("------------------------------");
            System.out.println("------------------------------");
            System.out.println("");
            

        }

    }
}
