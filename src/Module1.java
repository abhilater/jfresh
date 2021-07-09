import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public class Module1 {

  public static void main(String[] args) {
    String str = "Hello World!";
    System.out.println(str);

    // 1. COMMENTS
    //================================

    // a single line comment
    /* another single line comment */
    /*
     * A multiline
     * comment
     */

    /* 2. PRIMITIVES
    8 primitives defined in Java are int, byte, short, long, float, double, boolean, and char –
    those aren't considered objects and represent raw values.

    Type	Size(bits)	Minimum	Maximum
    ===================================
    byte	 8 (1 byte)	 2^7	   2^7– 1 */

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

     /* 3. AUTOBOXING
     ================================
     Each primitive data type has a Java class implementation eg. java.lang.Integer
     Autoboxing is a process where a primitive value can be wrapped or boxed into its corresponding "class" "obj"
     "class", "obj" ? we'll see later
     */

//    Integer intObj = 1;
//
//    System.out.println("Class type of object intObj: " + intObj.getClass());
//    System.out.println("Class type of object str: " + str.getClass());

    // what's happening here, we'll see later

//    Object o = c;
//    System.out.println("Class type of object o: " + o.getClass());

    /* 4. JAVA MEMORY MODEL
    ================================
      Primitives are created on "Stack" and Objects on "Heap"
     */

//    int[] intArray = {1, 2, 3};
//    System.out.println("Class type of object intArray: " + intArray.getClass());
//
//    Integer[] integerArray = {1, 2, 3};
//    System.out.println("Class type of object integerArray: " + integerArray.getClass());

     /* 5. CONDITIONALS
     ================================
     if-else if-else
     Ternary operator */

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

    /* 5. LOOPS
    ================================
     for, while, etc
      */
    Integer[] integerArray = {1, 2, 3};
//    for(int index = 0; index < integerArray.length; index++){
//      System.out.println(integerArray[index]);
//    }

    // or
//    for(Integer item : integerArray){
//      System.out.println(item);
//    }
    // or
//    int index = 0;
//    while(index < integerArray.length) {
//      System.out.println(integerArray[index++]);
//    }

    // or functional style (since Java 8+), DECLARATIVE VS IMPERATIVE PROGRAMMING
//    Arrays.stream(integerArray).forEach(System.out::println);

    /* 5. SWITCH STATEMENT
    ================================
    Makes code more readable and even more optimized at run-time than an if-else ladder
      */

//    String animal = "TIGER";
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

     /* 5. METHODS
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

//    printFullName("Abhishek", "Gupta");
//    System.out.println(createFullName("Abhishek", "Gupta"));
//
//    // calling a static method
//    Module1.printFullName("Abhishek", "Gupta");
//    // calling an instance or object method
//    Module1 module1 =  new Module1();
//    System.out.println(module1.createFullNameUsingObject("Abhishek", "Gupta"));
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
    return firstName + " " + middleName +" " + lastName;
  }

  /*
  EXERCISES
  Complete the following Java methods
   */

  // 1. The input to the method includes the current annual salary for the employee and a number indicating
  // the performance rating ("excellent", "good", and "poor"). An employee with a rating of "excellent" will receive a 6% raise, an
  // employee with a rating of "good" will receive a 4% raise, and one with a rating of "poor" will receive a 1.5% raise

  public long computeRaise(long currentAnnualSalary, String rating) {
    // add logic here
    return 0l;
  }

  // 2. The input to the method includes a list of all salaries
  // compute the average of all the input salaries grouped by salary bands
  // "band1" : less than $1000, "band2": $1000 >= and <$5000, "band3": >= $5000

  public Map<String, Long> computeAvgSalaryPerBand(long[] salaries) {
    // add logic here
    return null;
  }

  // 3. Try to practise more problems here https://codingbat.com/java

}
