package FinallyBlock;

import java.util.Scanner;

public class FinallyExample {
    public static void main(String[] args) {
        System.out.println("Start of main()");
        int x=0; int y=0; int res=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x : ");
        System.out.println("Enter y : ");
        try {
            System.out.println("Start of try block");
            x = sc.nextInt();
            y = sc.nextInt();
            res = x / y;
            System.out.println("End of try block");
        }catch (Exception e){
            System.out.println("Start of catch block");
            System.out.println("Something went wrong..");
            System.out.println("End of catch block");
        }finally {
            System.out.println("Finally block will always be run");
        }
        System.out.println(res);
        System.out.println("End of main()");
    }
}
