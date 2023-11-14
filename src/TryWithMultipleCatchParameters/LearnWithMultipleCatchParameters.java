package TryWithMultipleCatchParameters;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnWithMultipleCatchParameters {
    public static void main(String[] args) {
        System.out.println("Start of main()");
        int x=0; int y=0; int res=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x : ");
        System.out.println("Enter y : ");
        try {
            x = sc.nextInt();
            y = sc.nextInt();
            res = x / y;
        }catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println("Handling the ArrayIndexOutOfBoundsException : ");
        }catch (ArithmeticException e){
            System.out.println("Handling the ArithmeticException : ");
            res=x/2;
        }catch (InputMismatchException e){
            System.out.println("Handling the InputMismatchException");
        }catch (Exception e){
            System.out.println("Unknowns problems..");
        }
        System.out.println(res);
        System.out.println("End of main()");
    }
}
