import java.util.Scanner;  // Import the Scanner class

class Main {

  public static void main(String[] args) {

    // Do not edit the following lines. They just run the tests
    System.out.println("\n\nWelcome to the Unit 2 Test!");
    System.out.println("You have 4 coding problems to answer.\n");
    System.out.println("***************************");
    System.out.println("*** Starting problem 1! ***");
    System.out.println("***************************");
    problem1(); // 25 points
    System.out.println("\n");
    System.out.println("***************************");
    System.out.println("*** Starting problem 2! ***");
    System.out.println("***************************");
    problem2(); // 25 points
    System.out.println("\n");
    System.out.println("***************************");
    System.out.println("*** Starting problem 3! ***");
    System.out.println("***************************");
    problem3(); // 25 points
    System.out.println("\n");
    System.out.println("***************************");
    System.out.println("*** Starting problem 4! ***");
    System.out.println("***************************");
    problem4(); // 25 points    

  }

  static public void problem1() {
    /* 
    * Ask the user for their first and last name with a space in between
    * Print out "Hello, [firstname]. Your last name is [lastname]. Welcome to APCSA!"
    */

    Scanner s = new Scanner(System.in);
    System.out.println("Please enter your first name and last name separated by a space:");
    String fullName = s.nextLine();  // Read the user input into the variable "fullName"

    // put your code here




    s.close();
    // End of problem 1
  }

  static public void problem2() {
    /*
     * In the menu to your left, there should be a list of files
     * If not, click the little icon that looks like a piece of paper.
     *
     * Click on the file "Student.java" and inspect the class structure
     *
     * Part 1:
     * In the space below, create a Student object using the default
     * constructor and assign it to a variable
     * Print out the default student's name, age, and gpa
     * 
     * Part 2:
     * In the space below, create a Student object using the OVERLOADED
     * constructor that takes three parameters and assign it to a variable
     * Print out the default student's name, age, and gpa
     */

    // create a Student object using default constructor and print out info


    // create second student object with overloaded constructor and print out info


    // End of problem 2
  }


  static public void problem3() {
    /*
     * In the menu to your left, there should be a list of files
     * If not, click the little icon that looks like a piece of paper.
     *
     * Click on the file "MyMath.java" and inspect the methods
     * You'll notice that the "square" method doesn't do anything.
     * Your job is to fill in the square function so that it works properly
     * 
     * In the space below, create a variable and set it 
     * to a random number between 100 and 200
     * 
     * Create a new variable and use the "MyMath.square" method to set the new
     * variable to the square of the original random number.
     *
     * Print out both the original random number between 100-200 and the square of it.
    */

    // create a new variable

    // set the variable to a random number between 100 and 200

    // create another new variable and set it to the square of the original
    // using MyMath.square()

    // print out both the original number and the square of int



    // *** OPTIONAL *** Figure out how to implement square root
    // *** not extra credit, just fun and challening        ***
    // *** only do this part if you are done all the others ***
    // *** Step 1: use a built-in method from the Math class***
    // *** Step 2: Try to build your own                    ***

    // End of problem 3
  }


  static public void problem4() {

    /*
     * In the menu to your left, there should be a list of files
     * If not, click the little icon that looks like a piece of paper.
     *
     * Click on the file "Car.java" and inspect the class
     * You'll notice that there is a "horn" method that doesn't do anything.
     * Fill in the "horn" method so that it prints out the sound parameter
     *
     * So, for example if I have a Car object called myCar, I could call 
     * myCar.horn("beep beep");
     * and it would print out "beep beep".
     *
     * Create a new Car object and call your new horn method with "beep beep" or any other String
     *
     * The second part is to call your object's getType method and see if it returns "Truck"
     */

    // create your car object here

    // call your object's "horn" method here

    // call your object's getType() method here and store the result in a variable

    // print out whether the result equals "Truck"


    // End of problem 4

  }


}
