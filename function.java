//function to print the name

import java.util.*;
class function{
    public static void printname(String name){
        System.out.print(name);
        return;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printname(name);
    }
}


import java.util.*;
class function{
    public static void printname(String name){
        System.out.print(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printname(name);
    }
}

//java program to add two number by function

import java.util.*;
class function{
    public static int sum(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st number");
        int a=sc.nextInt();
        System.out.print("enter 2nd number");
        int b=sc.nextInt();
        int sum=sum(a, b);
        System.out.println(sum);
    }
}

import java.util.*;
class function{
    public static int sum(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st number:");
        int a=sc.nextInt();
        System.out.print("enter 2nd number:");
        int b=sc.nextInt();
        int sum=sum(a, b);
        System.out.println("sum of 2 number is:" + sum);
    }
}


//java program to multiply two number by function

import java.util.*;
class function{
    public static int multiply(int a,int b){
        int multiply=a*b;
        return multiply;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st number:");
        int a=sc.nextInt();
        System.out.print("enter 2nd number:");
        int b=sc.nextInt();
        int result=multiply(a, b);
        System.out.println("Multiplication of two number is" + result);
        }
}

import java.util.*;
class function{
    public static int multiply(int a, int b){
        int multiply=a*b;
        return multiply;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st number:");
        int a=sc.nextInt();
        System.out.print("enter 2nd number:");
        int b=sc.nextInt();
        int result=multiply(a,b);
        System.out.print("multiplication of two number is" + result);
    }
}


//java program to divide two number by function

import java.util.*;
class function{
    public static int divide(int a,int b){
        int divide=a/b;
        return divide;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st number:");
        int a=sc.nextInt();
        System.out.print("enter 2nd number:");
        int b=sc.nextInt();
        int result=divide(a,b);
        System.out.println("division of two number is" + result);
    }
}

import java.util.*;
class function{
    public static int divide(int a,int b){
        return a/b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st number:");
        int a=sc.nextInt();
        System.out.print("enter 2nd number:");
        int b=sc.nextInt();
        
        System.out.print("division of the number is" + divide(a, b));
    }
}


//java program to find factorial of a number by function

import java.util.*;
class function{
    public static void fact(int n){
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial * i;
        }
        System.out.print(factorial);
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value:");
        int n=sc.nextInt();
        fact(n);
    }
}


import java.util.*;
class function{
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of a:");
        int a=sc.nextInt();
        System.out.print("enter the value of b:");
        int b=sc.nextInt();
        System.out.print("Sum of two number is "+ sum(a,b));
  }
}

//java practice question
//Question no.1

import java.util.*;
class function{
    public static int average(int a,int b,int c){
        int average=(a+b+c)/3;
        return average;
    }
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        System.out.print("Enter the value of c:");
        int c=sc.nextInt();
        System.out.print("Sum of three number is "+ average(a,b,c));
    }
}

//java practice question
//Question no.2

import java.util.*;
class function{
    public static void main(String args[]){
        int i,p=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the last number:");
        int n=sc.nextInt();
        for(i=1;i<=n;i++){
            if(i % 2 !=0){
                System.out.println(i);
                p=p+i;
            }
            
        }
        System.out.println(p);

    }
}














