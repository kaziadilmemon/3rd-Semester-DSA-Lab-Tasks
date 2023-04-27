//Q 1 :
//Write a program to find the factorial of a number using recursion. Take input from user. 

Code :
public class Lab_Tasks_10 {
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        else if(n<0){
            return -1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
