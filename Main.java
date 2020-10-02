import java.util.Scanner;  // Import the Scanner class

class Main {

  public static void main(String[] args) {

    // Do not edit the following lines. They just run the tests
    System.out.println("\n\nWelcome to the Unit 2 Test!");
    System.out.println("You have 4 coding problems to answer.\n");
    System.out.println("***************************\n");
    System.out.println("*** Starting problem 1! ***\n");
    System.out.println("***************************\n");
    problem1(); // 25 points
    System.out.println("\n");
    System.out.println("***************************\n");
    System.out.println("*** Starting problem 2! ***\n");
    System.out.println("***************************\n");
    problem2(); // 25 points
    System.out.println("\n");
    System.out.println("***************************\n");
    System.out.println("*** Starting problem 3! ***\n");
    System.out.println("***************************\n");
    problem3(); // 25 points
    System.out.println("\n");
    System.out.println("***************************\n");
    System.out.println("*** Starting problem 4! ***\n");
    System.out.println("***************************\n");
    problem4(); // 25 points    

  }

  static public void problem1() {
    /*
     * In the menu to your left, there should be a list of files
     * If not, click the little icon that looks like a piece of paper.
     *
     * Click on the file "Student.java" and inspect the class structure
     * In the space below, create a Student object and assign it to a variable
     * Print out the default student's name, age, and gpa
     * 
     * In the Student.java file, create a NEW constructor (don't change the existing one)
     * that takes name, age, and gpa as parameters and sets them properly
     * In the space below, create a second Student object using your new constructor
     * Print out the second student's name, age, and gpa
     */

    // create default student object and print out info


    // create second student object with your constructor and print out info


    // End of problem 1
  }

  static public void problem2() {
    /*
     * In the menu to your left, there should be a list of files
     * If not, click the little icon that looks like a piece of paper.
     *
     * Click on the file "Car.java" and inspect the class
     * You'll notice that there aren't many methods or properties.
     *
     * Create 3 additional properties for the car class: 
     * one should be an int, one should be a double and one should be a boolean
     *
     * Create a new method for the car class: one should be called 
     * public void horn 
     * and it should take a String parameter and just print it out. So, for example
     * if I have a Car object called myCar, I could call myCar.horn("beep beep")
     * and it would print out "beep beep".
     *
     * Create a new Car object and call your new horn method 
     *
     * The second part is to call your object's getType method and see if it returns "Truck"
     */

    // create your car object here

    // call your object's "horn" method here

    // call your object's getType() method here and store the result in a variable

    // print out whether the result equals "Truck"



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
     * In the space below, initialize a variable to 0.0
     * Then set the variable to a random number between 100 and 200
     * 
     * Create a new variable and use the "square" method to set the new
     * variable to the square of the original random number.
     *
     * Print out both the original random number between 100-200 and the square of it.
    */

    // initialize a variable to 0.0

    // set the variable to a random number between 100 and 200

    // create a new variable and set it to the square of the original using your method

    // print out both the original number and the square of int



    // *** OPTIONAL *** Figure out how to implement square root
    // *** not extra credit, just fun and challening        ***
    // *** only do this part if you are done all the others ***

    // End of problem 3
  }


  static public void problem4() {
    /* 
    * Ask the user for their first and last name with a space in between
    * Print out "Hello, [firstname]. Your last name is [lastname]. Welcome to APCSA!"
    */

    Scanner s = new Scanner(System.in);
    System.out.println("Please enter your first name and last name separated by a space:");
    String fullName = s.nextLine();  // Read the user input into the variable "fullName"

    // put your code here




    s.close();
    // End of problem 4

  }


}