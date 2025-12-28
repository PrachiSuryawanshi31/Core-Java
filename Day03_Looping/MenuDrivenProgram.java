/*Write a Java menu-driven program using do-while loop to perform the following operations on a number:
1.Reverse the number
2.Find the sum of digits
3.Exit the program*/

import java.util.Scanner;

class MenuDrivenProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice, num;

        do 
        {
            System.out.println("\n1. Reverse Number");
            System.out.println("2. Sum of Digits");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter number: ");
                num = sc.nextInt();

                int rev = 0;

                while (num > 0) 
                {
                    rev = rev * 10 + num % 10;
                    num = num / 10;
                }
                
                System.out.println("Reverse: " + rev);
            }

            else if (choice == 2) {
                
                System.out.print("Enter number: ");
                
                num = sc.nextInt();

                int sum = 0;
                do 
                {
                    sum += num % 10;
                    num =num/ 10;
                
                } 
				while (num > 0);

                System.out.println("Sum: " + sum);
            }

        } while (choice != 3);
    }
}
