package Blocks;


import java.util.Scanner;

/*
p is program and in particular program we have so many statements :
call : s1 s2 s3 s4 s5 s6 s7 :
    : Code without exception handling
    P
    {
        s1
        s2
        s3
        s4
        s5
        s6
        s7

    }

    Run-1(Execution Cycle)
    s1
    s2
    s3
    s4
    s5
    s6
    s7
    (Normal Termination)

    Run-2(Execution Cycle)
    s1
    s2
    s3 (exception)
    (Abnormal Termination)


    ---------------------------------------------------
    : exception handling says that :
    : Put your risky statements into a try block :
    : And that try will be immediately followed by a catch block :
    : catch block contains those statements those you want to execute. when it
    : occurs the exception : catch block is also knows as exception handler :

    : Code with exception handling :

    P
    {
        s1
        s2
        try{
            s3
            s4
        }
        catch{
            s101
            s102
        }
        s5
        s6
        s7

    }

    Run-1(Execution Cycle if there is no exception occurs)
    s1
    s2
    s3
    s4
    s5
    s6
    s7
    (Normal Termination)

    Run-2(Execution Cycle if there is an Exception Occurs)
    s1
    s2
    s3(exception occurs)
    s101 (Handling exception using catch block)
    s102 (Handling exception using catch block)
    s5
    s6
    s7
    (Normal Termination)

 */
public class LearnTryCatchBlock {
    /*
    Example One : User will pass two numbers from the command line args and our
    program will divide the 1st no by 2nd one and will display the result :

     */
    public static void main(String[] args) {
        System.out.println("Start of Main() ");
        int x;
        int y; int res;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x : ");
        x=sc.nextInt();
        System.out.println("Enter the y : ");
        y=sc.nextInt();
        try {
            res = x / y;
        }catch (Exception e){
            System.out.println("Illegal expression : ");
            res = y / x ;
        }
        System.out.println("Result is : "+res);
        System.out.println("End of Main() ");
    }
}
/*
when we pass the input as x : 50 and y : abc then it's an exception :

 */