package _03_Intro_to_Scanners;

import java.util.Scanner;

public class ScannerDemo {

    /*
     * A Scanner is an alternative to taking user input by using the console.
     * Unlike a JOptionPane it is also capable of taking in many data types
     * besides String.
     */
	
    public static void main(String[] args) {
        /*
         * 1. Create an object of the Scanner class.
         * 
         * Note: You will need to pass System.in to the constructor(no quotes).
         * 
         * You might notice this looks similar to System.out which you use for
         * printing to the console and that's because they are related. These
         * are what are known as standard input and output streams.
         * 
         * In both these cases the standard input and output streams are
         * Eclipse's console. This may change depending on the environment where
         * are running your program or the input/output stream you are using.
         */
    		
        	

        	Scanner sn = new Scanner(System.in);

        /*
         * 2. Use a syso to ask the user for their name and then use the Scanner
         * created in step 1 to take in the user's name as a String.
         * 
         * You can use either next() or nextLine(). next() will take in all
         * string input until it reaches a space. nextLine will take in all
         * string input until it reaches a newline.
         * 
         * You should see a blinking cursor in the console that you can type
         * into.
         * 
         * Note: Don't forget to save the results of next() or nextLine() into a
         * String variable.
         */
        	System.out.println("What is your name fellow?");   
        	String name = sn.nextLine();
     
        /*
         * 3. Ask the user for their age in the console. Then use the Scanner to
         * take their age as an int and save it into an int variable.
         * 
         * See if you can find the scanner method that does this without relying
         * on Integer.parseInt().
         */
        System.out.println("How old are you fellow");
        int age = sn.nextInt();

        
        /*
         * 4.) Try asking the user for another piece of information that's not a
         * String or an int.
         * 
         * Note: There are many methods similar to the one you used for int that
         * are capable of taking in primitive data types.
         */
        System.out.println("You are more than 5 foot tall. True or False?");
        boolean height = sn.nextBoolean();
        // 5.) Print the user's data to the console nicely formatted.
        System.out.println("So your name is " +name + "?");
        System.out.println("And your age is " + age + "?");
        System.out.println("And whether you are taller than 5 foot is " + height + ", right?");
        
        
        /*
         * 6.) Close your scanner to avoid memory leaks.
         * 
         * Note: When using a Scanner with the System.in input stream in larger
         * programs only close the scanner when your program is completely done.
         */
        sn.close();
    }

}
