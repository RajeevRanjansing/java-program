  //java program to print Hello world

class hello
{
	public static void main(String args[])
	{
		System.out.print("Hello World");
	}
}


//java program to add two number(1st method)

class hello
{
	public static void main(String args[])
	{
		System.out.print(1+2);
	}
}

//java program to add two number(2nd method)

class hello
{
	public static void main(String args[])
	{   
		int a=1;
		int b=2;
		int result=a+b;
		System.out.print(result);
	}
}

//java program to add float number
class hello
{
	public static void main(String args[])
	{   
		float a=1.2f;
		int b=2;
		float result=a+b;
		System.out.print(result);
	}
}


// program to add add float no. and integer no.
class hello
{
	public static void main(String args[])
	{   
		float f=1.2f;
		int t=(int) f;
		System.out.print(t);
	}
}

//java program for multiplication
class hello
{
	public static void main(String args[])
	{   
		byte a=10;
		byte b=30;
		int result=a*b;                 //answer is 300 will be out of range,so we have to convert in integer
		System.out.print(result);
	}
}

//java program for division

class hello
{
	public static void main(String args[])
	{   
		int a=8;
		int b=5;
		int result=a/b;                         // it will give quotient only(there is no remainder)      
		System.out.print(result);
	}
}

// java program for increment

class hello
{
	public static void main(String args[])
	{   
		int a=8;
		a++;                              
		System.out.print(a);
	}
}

// java program for decrement

class hello
{
	public static void main(String args[])
	{   
		int a=8;
		a--;                              
		System.out.print(a);
	}
}

//java program to find which is greater between two number

class hello{
	public static void main(String args[])
	{
		int a=10;
		int b=11;

		boolean result=a>b;        //boolean data type return only True or False
		System.out.println(result);
	}
}

//java program to find which is greater among three number
class newjava{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the 1st number:");
        int a=sc.nextInt();
        System.out.print("enter the 2nd number:");
        int b=sc.nextInt();
        System.out.print("enter the 3rd number:");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.print(a +" is greater");
        }
        else if(b>a && b>c){
            System.out.print(b +" is greater");
        }
        else{
            System.out.print(c +" is greater");
        }
    }
}


//java program for addition,subtraction,multiplication,division
class newjava{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st number");
        int a=sc.nextInt();
        System.out.print("enter 2nd number");
        int b=sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}


//switch case statement
class newjava{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a){
            case 1: System.out.print("january");
            break;
            case 2: System.out.print("february");
            break;
            case 3: System.out.print("march");
            break;
            case 4: System.out.print("april");
            break;
            case 5: System.out.print("may");
            break;
            case 6: System.out.print("june");
            break;
            case 7: System.out.print("july");
            break;
            case 8: System.out.print("august");
            break;
            case 9: System.out.print("september");
            break;
            case 10: System.out.print("october");
            break;
            case 11: System.out.print("november");
            break;
            case 12: System.out.print("december");
            break;
            default: System.out.print("invalid number");
	}
    }
}

//print nuumber between 1 to 10 using for-loop
class newjava{
    public static void main(String args[]){
        int i;
        for(i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}


//java program to print number between 1 to 10 using while loop
class newjava{
    public static void main(String args[]){
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
}

//java program to print number between 1 to 10 using do while loop
class newjava{
    public static void main(String args[]){
        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=10);
    }
}


//java program to print sum of n number
class newjava{
    public static void main(String args[]){
        int sum=0,i;
      Scanner sc=new Scanner(System.in);
      System.out.print("enter a number");
      int a=sc.nextInt();
      for(i=0;i<=a;i++){
        sum=sum+i;
      }
      System.out.print(sum);
    }
}

//java program to print table of any numb
class newjava{
    public static void main(String args[]){
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number you want to find table");
        int a=sc.nextInt();
        for(i=1;i<=10;i++){
            n=a*i;
        System.out.println(n);
        }
    }
}

//java program to print pattern(*)
class newjava{
    public static void main(String args[]){
        int i;
        for(i=1;i<=5;i++){
                System.out.print("*");
        }
    }
}

class newjava{
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

class newjava{
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

//java program to print pattern
class newjava{
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=5;j++){
                if(i == 1 || j == 1 || i == 4 || j == 5){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
           System.out.println();
        }
    }
}

class newjava{
    public static void main(String args[]){
        int i,j;                                                          //    *
        for(i=1;i<=4;i++){                                                //   **
            for(j=1;j<=4-i;j++){                                          //  ***
            System.out.print(" ");                                        // ****
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class newjava{
    public static void main(String args[]){
        int i,j;
        for(i=4;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class newjava{
    public static void main(String args[]){
        int number=1,i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}

class newjava{
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

class newjava{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the last even number");
        int a=sc.nextInt();
        int i;
        for(i=1;i<=a;i++){
            if(i%2==0)
            System.out.println(i);
        }
    }
}


java program to print pattern

class newjava{
    public static void main(String args[]){
        int i,j;                                                
         for(i=1;i<=5;i++){                                                       
             for(j=1;j<=5;j++){
                System.out.print("*");}
             System.out.println();   
        }
    }
}

java program to print pattern

class newjava{
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++)
            if(i==1 || j==1 || i==5|| j==5){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class newjava{
    public static void main(String args[]){
        int i,j;
        for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();


        }
    }
}

class newjava{
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


class newjava{
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class newjava{
    public static void main(String args[]){
        int i,j;
        for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class newjava{
    public static void main(String args[]){
        int i,j;
        int number=1;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}


class newjava{
    public static void main(String args[]){
        int i,j;
        int sum=0;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                sum=i+j;
                if(sum % 2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

