package com.helpshift.jfresh.module1;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/*
Why Object Oriented
 */
public class Module1 {

  public static void main(String[] args) {
     /*  VARIABLES
     ===================================
     Why Statically Typed?
     */

    String str = "Hello World!";
    System.out.println(str);

    // COMMENTS
    //================================

    // a single line comment
    /* another single line comment */
    /*
     * A multiline
     * comment
     */

    /* PRIMITIVE TYPE
    =================================

    8 primitives defined in Java are int, byte, short, long, float, double, boolean, and char –
    those aren't considered objects and represent raw values.

    Type	Size(bits)	Minimum	Maximum
    ===================================
    byte	  8 (1 byte)	 2^7	   2^7– 1 */
    byte b = 100;
//    short	 16
    short s = 30_000;
//    int	   32 (4 bytes)
    int i = 100_000_000;
//    long	 64
    long l = 100_000_000_000_000L;
//    float	 32
    float f = 1.456f;
//    double	64
    double d = 1.456789012345678;
//    char	  16
    char c = 'c';
//    boolean	1
    boolean bool = true;
    bool = false;
    //System.out.println(bool);


     /* COMPLEX TYPES / REFERENCE TYPES
     ===================================
     Reference types are types that hold reference to Objects. An Object is an instance of a Java Class/Java Type
     eg java.util.Date is a Java Class/Type from the Java API/JDK, java.lang.String

   Thread of execution which is part of Java process, the memory that each thread holds, is a Stack memory, Heap is shared memmory space someting which is shared by all threads
     */
//     Date date = new Date();
//    System.out.println(date);
//    System.out.println(date.getTime());
//    System.out.println(date.getClass());
//    System.out.println(str.getClass());

//    Point p1 = new Point(1, 1);
//    Point p2 = p1;
//    p2.x = 2;
//    System.out.println(p1);


     /* AUTOBOXING - UNBOXING
     ================================

     Each primitive data type has a Java class implementation eg. java.lang.Integer
     Autoboxing is a process where a primitive value can be wrapped or boxed into its corresponding "class" "obj"
     "class", "obj" ? we'll see later
     */

//     int anInt = 1;
//    Integer intObj = anInt;
//    anInt = intObj; // unboxing
//
//    System.out.println("Class type of object intObj: " + intObj.getClass());
//    System.out.println("Class type of object str: " + str.getClass());

    // what's happening here, we'll see later
    // This is a Glimpse of Polymorphism in action, we'll see Polymorphism in detail later

//    Object o = c;
//    System.out.println("Class type of object o: " + o.getClass());



    /*  CONSTANTS
     ===================================
     Variables which once defined cannot be redefined.
     eg calculating area of a circle
     */
//    final float pi = 3.14f;
//    int radius = 10;
//    System.out.println("Area of a circile with " + pi*Math.pow(radius, 2));



    /*  CASTING / TYPE CONVERSION
     ===================================
     */
//    float f1 = 3.14f;
//    int i1 = (int)f1;
//    double d1 = i1;
//    System.out.println(i1);
//    String str1 = "Hello";
//    Object objRefToStr1 = str1;
//    List<String> list = new ArrayList<>();
//    list.add((String)objRefToStr1);



    /* JAVA MEMORY MODEL
    ================================
      Primitives are created on "Stack"/"Heap" and Objects on "Heap"
      Heap memory is Garbage-Collectible
     */
//
//    int[] intArray = {1, 2, 3};
//    System.out.println("Class type of object intArray: " + intArray.getClass());
//
//    Integer[] integerArray1 = {1, 2, 3};
//    System.out.println("Class type of object integerArray: " + integerArray1.getClass());



    /* CONDITIONALS
     ================================
     if-else if-else
     Ternary operator */
//
//    int count = 1;
//    if (count > 1) {
//      System.out.println("Count is higher than 1");
//    } else if (count == 1) {
//      System.out.println("Count is equal to 1");
//    } else {
//      System.out.println("Count is less than 1");
//    }
//
//    count = 2;
//    String cond = count > 1 ? "Count is higher than 1"
//        : (count == 1 ? "Count is equal to 1" : "Count is less than 1");
//    System.out.println(cond);



    /* LOOPS
    ================================
     for, while, etc
      */
//    Integer[] integerArray = {1, 2, 3};
//    for(int index = 0; index < integerArray.length; index++){
//      System.out.println(integerArray[index]);
//    }
//
//    // or
//    for(Integer item : integerArray){
//      System.out.println(item);
//    }
//    // or
//    int index = 0;
//    while(index < integerArray.length) {
//      System.out.println(integerArray[index++]);
//    }
//
//    // or functional style (since Java 8+), DECLARATIVE VS IMPERATIVE PROGRAMMING
//    Arrays.stream(integerArray).forEach(System.out::println);



    /* SWITCH STATEMENT
    ================================
    Makes code more readable and even more optimized at run-time than an if-else ladder
      */

//    String animal = "DOG";
//    String result;
//    switch (animal) {
//      case "DOG":
//        result = "domestic animal";
//        break;
//      case "CAT":
//        result = "domestic animal";
//        break;
//      case "TIGER":
//        result = "wild animal";
//        break;
//      default:
//        result = "unknown animal";
//        break;
//    }
//    System.out.println(result);



     /* METHODS
    ================================
    Methods in Java are functions where you define business logic of an application
    eg public static void main(String[] args) is a special method which starts execution of a Java program

    1. public: ACCESS MODIFIER - Defines wherein the code once can access the method eg public, private, package
    2. static: TYPE (static/instance), whether this method is tied to class or an object of the class
    3. void: RETURN TYPE, void means method doesn't return anything
    4. main: METHOD NAME or ID
    5. (String[] args): PARAMETER LISt, parameter type "String[]" and param name "args"
    6. {} : BODY -> your code or business logic goes here
    7. throws RuntimeException : Lists of exceptions thrown by the method
      */

    printFullName("James", "Gosling");
    System.out.println(createFullName("James", "Gosling"));

    // calling a static method
    Module1.printFullName("James", "Gosling");

    // calling an instance or object method
    Module1 module1 =  new Module1();
    module1.printFullName("James", "Gosling");
    System.out.println(module1.createFullNameUsingObject("james", "gosling"));

    // show overloading
  }

  int divide(int num, int denom) throws IllegalArgumentException {
    if(denom == 0) throw new IllegalArgumentException("Divide by zero is not possible");
    return num/denom;
  }

  public static void printFullName(String firstName, String lastName) {
    System.out.println(firstName + " " + lastName);
  }

  public static String createFullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  public String createFullNameUsingObject(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  // METHOD OVERLOADING
  public static String createFullName(String firstName, String lastName, String middleName) {
    return firstName + " " + middleName + " " + lastName;
  }

}
