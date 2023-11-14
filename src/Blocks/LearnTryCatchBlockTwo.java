package Blocks;

import java.util.Scanner;

public class LearnTryCatchBlockTwo {
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
        }catch (Exception e){
            System.out.println("Something went wrong..");
        }
        System.out.println(res);
        System.out.println("End of main()");
    }
}
