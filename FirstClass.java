// Java is OOPs 
//Every code starts with class
//Standard, File name and class name should be same id class is not public
//if class is public, file name and class name must be same
class SecondClass{
    //class is a keyword
    //it is telling to compiler we are defining a class
/*
 * main is a method
 * void is a keyword, returns nothing
 * static is a keyword. Static things will load during class loading time
 * public is a keyword. public access is outside the package(folder)
 * String args[] is a command line arguement
 * String is a predefined class in java
 * string- collection of characters
 * args- name of arguement, can be anything
 * args can be 'n' number. It is an array
 */
public static void main(String args[]){
    /*
     * print is a method and it is called from out object
     * out object belongs to PrintStream class
     * who creates the object of PrintStream(out)
     * System class create the out object and make it static
     * print method prints the thing in same line
     * println prints in new line
     */
    System.out.println("Hello Java");
  }
}
//javac <file name>.java
//once it is compiled it generates a byte code and byte code is always with class name