package TryWithMutipleCatch;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

/*

Example program for try One and Multiple catch blocks :

 */
public class LearnTryOneCatchMultiple {
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
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Handling the ArrayIndexOutOfBoundsException : ");
        }catch (NumberFormatException e){
            System.out.println("Handling the NumberFormatException : ");
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
/*
 : Parent most type of catch block should be at the last position it should not be at the first position :
 : if we try to write at the first position it will be an error :
 : error : already been caught :
 : first child type and then the parent type catch block :

 */
