// import java.util.*;
// class array{
//     public static void main(String args[]){
//         int i;
//         int[] marks=new int[5];
//         marks[0]=92;
//         marks[1]=93;
//         marks[2]=93;
//         marks[3]=94;
//         marks[4]=95;

//         //System.out.print(marks[0]);
//         for(i=0;i<5;i++){
//             System.out.println(marks[i]);
//         }
//     }
// }

// import java.util.*;
// class array{
//     public static void main(String args[]){
//         int[] marks={1,2,3,4,5};
//         for(int i=0;i<5;i++){
//             System.out.println(marks[i]);
//         }
//     }
// }

// import java.util.*;
// class array{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int number[]=new int[size];
//         for(int i=0;i<size;i++){
//             number[i]=sc.nextInt();

//             }
//             for(int i=0;i<size;i++){
//                 System.out.print(number[i]);
      
//         }
//     }
// }

// import java.util.*;
// class array{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int number[]=new int[size];

//         for(i=0;i<size;i++){
//             number[i]=sc.nextInt();
//         }
//         for(int i=0;i<size;i++){
//             System.out.println(number[i]);
//         }
//     }
// }

// import java.util.*;
// class array{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int number[]=new int[size];
    
//     for(int i=0;i<size;i++){
//         number[i]=sc.nextInt();
//     }
//     for(int i=0;i<size;i++){
//         System.out.print(number[i]);
//     }
// }
// }

// import java.util.*;
// class array{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int number[]=new int[size];

//         for(int i=0;i<size;i++){
//             number[i]=sc.nextInt();
//         }
//         System.out.print("enter the number you want to find:");
//         int x=sc.nextInt();
//         for(int i=0;i<number.length;i++){
//             if(number[i]==x){
//             System.out.println(i);
//         }
//         }
//     }
// }

// import java.util.*;
// class array{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int number[]=new int[size];

//         for(int i=0;i<size;i++){
//             number[i]=sc.nextInt();
//         }
//             int max=Integer.MIN_VALUE;
//             int min=Integer.MAX_VALUE;

//             for(int i=0;i<number.length;i++){
//                 if(number[i]<min){
//                     min=number[i];
//                 }
//                 if(number[i]>max){
//                     max=number[i];
//                 }
//             }
//             System.out.println("largest number is "+ max);
//             System.out.println("largest number is "+ min);
//     }
// }


// class array{
//     public static void main(String args[]){
//         System.out.print("Hello world");
//     }
// }  
        
// import java.util.*;        
// class array{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter 1st number:");
//         int a=sc.nextInt();
//         System.out.print("Enter 2nd number:");
//         int b=sc.nextInt();
//         System.out.print("Enter 3rd number:");
//         int c=sc.nextInt();
//         if(a>b && a>c){
//             System.out.print(a + "is greater");
//         }
//         else if(b>a && b>c){
//              System.out.print(b + "is greater");
//         }
//         else{
//              System.out.print(c + "is greater");
//         }
//     }
// }        
    
// import java.util.*;
// class array{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the value of a:");
//         float a=sc.nextFloat();
        
//         System.out.print("enter the value of b:");
//         float b=sc.nextFloat();
        
//         System.out.print("enter the value of c:");
//         float c=sc.nextFloat();
        
//         System.out.print("enter the value of d:");
//         float d=sc.nextFloat();

//         System.out.print("enter the value of e:");
//         float e=sc.nextFloat();

//         System.out.print("enter the value of f:");
//         float f=sc.nextFloat();

//         float x=((e*d)-(b*f))/((a*d)-(b*c));
//         float y=((a*f)-(e*c))/((a*d)-(b*c));

//         System.out.println("value of x is " + x);
//         System.out.print("value of y is " + y);    
//     }
// }        
    
// import java.util.*;
// class array{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the value in meter:");
//         float meter=sc.nextFloat();
//         double foot= meter * 3.2808;
//         System.out.print("The value in foot is " + foot);
//     }
// }

import java.util.*;
class array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the weight in pounds:");
        float weight=sc.nextFloat();
        System.out.print("enter the height in inches:");
        float height=sc.nextFloat();
        double kg=weight*0.45359237;
        double meter=height*0.0254;
        double bmi=kg/(meter*meter);
        System.out.print("bmi is " + bmi);
    
    }
}
