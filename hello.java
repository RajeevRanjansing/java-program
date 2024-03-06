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


