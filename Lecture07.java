//Sadman Sakib Hassan

class Lecture07 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 07");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments

        // Put your answer for #8 here:

        //The "call stack" is something used by recursive functions. A function is called by a program, and that function rises to the top of the call stack. This is like a pile of books. One item is added at a time. The top item is always removed when you are ready to remove something.

        // Put your answer for #9 here:

        // Put your answer for #10 here:

        // Put your answer for #11 here:

        //return x * pow(x, y – 1); To split this apart, this sentence calls the infinitely recursive function pow with the values x and y -1.

        public static int pow(int x, int y) {
            if (y != 1)
            return x * pow(x, y - 1);
            else
            return 1;
            }

            //Sample:

            public class HelloWorld{

                public static void main(String []args){
                System.out.println(pow(2,4));
                }
                
                public static int pow(int x, int y) {
                if (y != 1)
                return x * pow(x, y - 1);
                else
                return 1;
                }
                }
                
              //  Output: 8
                
               

//This makes calls up until y equals 1.

        // Put your answer for #17 here:

        //If the value of n is more than 10, it won't attempt an infinite recursion. Because it checks the first condition ("if(n>10) return n;") and returns the same response when the value of n is greater than 10. 

//Solution:

public static int digitSum(int n)

{
if(n==0)

{

return 0;

}

else

{

return n%10 + digitSum(n/10);

}

}

//When we provide a single digit value, it will loop infinitely. Because if we provide a single, the code will instead move to the else condition, which will generate an infinite recursive loop. For instance, if n = 9, it will move to the else section, where it will then call the next recurssion digitSum(0)(9/10 = 0), and in the following recurssi

        // EXERCISES:

        // Put your answer for #1 here:

        import java.io.*;
        import java.util.*;
        class Step
        {
        public static String starString(int n) //method for printing astrics
        {
        if(n<0)
        throw new IllegalArgumentException(); //exception if n is negative
        else if(n==0)
        return "*";
        else
        return starString(n-1)+starString(n-1); //recursive call
        
        }
        public static void main(String args[]) //main method
        {
        Scanner sc=new Scanner(System.in); //object for Scanner class
        int n; //variable decleration
        n=sc.nextInt(); //getting n from user
        System.out.println(starString(n)); //calling starSting()
        }
        }
        
        


        // Put your answer for #2 here:

        //declare class
public class Sequences
{
public static void main(String[] args)
{

//call method with 5
writeSequence(5);
System.out.println();
//call method with 12
writeSequence(12);
System.out.println();
//call method with -9
writeSequence(-9);
System.out.println();
}

public static void writeSequence(int num)
{
try
{
//check number is negative or not
if (num < 0)
throw new IllegalArgumentException();
else if(num == 1)
System.out.print("1");
else
{
//recursive call to display the number sequence
writeSequence(num-1);
System.out.print(", "+ num);
}

}
//catch block to handle exception
catch(IllegalArgumentException e)
{
//display error message
System.out.println("Number should not be negative.");
} 
}
}

        // Put your answer for #3 here:

        public class Sequences
{
public static void main(String[] args)
{
writeSequence(1);
System.out.println();
writeSequence(5);
System.out.println();
writeSequence(6);
System.out.println();
writeSequence(9);
System.out.println();
writeSequence(10);
System.out.println();
writeSequence(-9);
System.out.println();
}

public static void writeSequence(int num)
{
if (num < 0)
throw new IllegalArgumentException("Error: score is negative.");
else
{
if(num%2==0)
{
for(int i=num/2; i>=1; i--)
System.out.print(i + " ");
for(int i=1; i<=(num/2); i++)
System.out.print(i + " ");
}
else
{
for(int i=(num+1)/2; i>0; i--)
System.out.print(i + " ");
for(int i=2; i<=((num+1)/2); i++)
System.out.print(i + " ");
} 
} 
}
}


Output of code:

1
3 2 1 2 3
3 2 1 1 2 3
5 4 3 2 1 2 3 4 5
5 4 3 2 1 1 2 3 4 5

        // Put your answer for #10 here:

        public class Match {

            public static int digitMatch(int n1, int n2) {
                if(n1 == 0 || n2 == 0) {
                    return 0;
                } else {
                    if(n1 % 10 == n2 % 10) {
                        return 1 + digitMatch(n1/10, n2/10);
                    } else {
                        return digitMatch(n1/10, n2/10);
                    }
                }
            }
        
            public static void main(String[] args) {
                System.out.println(digitMatch(1072503891, 62530841));
            }
        
        }

        // Put your answer for #12 here:

        //Since the String class lacks a reverse() method, we must transform the input string to a StringBuilder instead. This is done by utilizing the StringBuilder's append method. Print the characters of the inverted string after that by scanning through the first through the final index.

    }import java.lang.*;
    import java.io.*;
    import java.util.*;
    
    // Class of ReverseString
    class ReverseString {
    public static void main(String[] args)
    {
    String input = "shaf asnja asnca";
    
    StringBuilder input1 = new StringBuilder();
    
    // append a string into StringBuilder input1
    input1.append(input);
    
    // reverse StringBuilder input1
    input1 = input1.reverse();
    
    // print reversed String
    System.out.println(input1);
    }
    }
}
