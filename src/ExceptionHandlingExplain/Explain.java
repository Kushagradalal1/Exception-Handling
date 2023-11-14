package ExceptionHandlingExplain;

public class Explain {
    /*

    : Exception Handling is an abnormal condition (exceptional condition) that may
    occurs during the exception of program and if your program is not ready
    to handle it then it will be abnormally terminated.

    : making your program ready to deal with these abnormal
    condition is exception handling.

    : program to read a file from the disk :
    : you are providing the file name and its reading the file into
    a disk : output showing the contents of the file :

    : if suppose you want to open the file called xyz.txt and that
    file is not present int the disk then, that is exception : that is
    : FileNotFoundException : to control this exception that is known as handling of
    an exception.

    : How to handle the exception :
    there are 5 keywords given in java : try, catch, finally, throw & throws.

    : try, catch & finally are the blocks : blocks means groups of statements :

    : way to write this blocks :
    //One try and One Catch :
    1) try{

    }catch{

    }
    ------------------------------
    2) try{

    }catch{

    }catch{

    }
    .
    .
    .
    ------------------------------
    3) try{

    }catch{

    }finally{

    }
    ------------------------------
    4) try{

    }catch{

    }catch{

    }catch{

    }
    .
    .
    .
    finally{

    }
    ------------------------------
    5) try{

    }finally{

    }
    ------------------------------

    it size() that is ArrayIndexOutOfBoundException :
    : when we try to convert a string with some alphabet into number : NumberFormatException :
    : when we try to divide a number by zero : ArithmeticException :


    : Catch block always contains a parameters (like a method parameters)

    : try{

    }catch(Exception e){

    }


    : Parent most class of java is : Object :

                        Object
                           |
                        Throwable
                        |       |
                    Exception  Error

                    Exception : is the parent most class for all the exception class :
                    : ArrayIndexOutOfBoundException : ArithmeticException : NumberFormatException : NullPointerException :
                    : IOException : FileNotFoundException :

       : Catch block can have a parameter of Exception type : or any of it's child type :
       :

     */
}
