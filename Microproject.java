import java.util.Scanner;
import java.util.Arrays;
class MyPolynomial
{
    double coeffs[];
    
    MyPolynomial(double... coeffs)
    {  
        this.coeffs = coeffs;                 
    } 
    int getDegree()
    {
        int i=0;
        for(i=coeffs.length-1;i>=0;i--)
        {
            if(coeffs[i]!=0)
            {
                break;
                
            }
        }
        return(i);
    }
    
     public String toString()
    {
        String s="";
        for(int i=getDegree();i>=0;i--)
        {
            s+=coeffs[i]+"x^"+i;
            if(i!=0)
            s=s+"+";
        }
        return s;

    }
    
    double evaluate(double x)
    {
        double s=0;
        for(int i=getDegree();i>=0;i--)
        {
            s+=coeffs[i]*Math.pow(x,i);
            
        }
        return s;

    }
    
    /*MyPolynomial add(MyPolynomial right)
    {
        double s=0;
        for(int i=Math.max(this.getDegree(),right.getDegree());i>=0;i--)
        {
            right.coeffs[i]=this.coeffs[i]+right.coeffs[i];
            
        }
        return right;
    }*/
    MyPolynomial add(MyPolynomial right)
    {
        int a=this.coeffs.length;
        int b=right.coeffs.length;
        double arr[]=new double[Math.max(a,b)];
        if(a>b)
        {
            int d=a-b;
            int i;
            for( i=0;i<b;i++)
            {
                arr[i]=this.coeffs[i]+right.coeffs[i];
            }
            for(;i<a;i++)
            {
                arr[i]=this.coeffs[i];
            }

        }
        else if(b>=a)
        {
            int d=b-a;
            int i;
            for( i=0;i<a;i++)
            {
                arr[i]=this.coeffs[i]+right.coeffs[i];
            }
            for(;i<b;i++)
            {
                arr[i]=right.coeffs[i];
            }
        }
        MyPolynomial ob=new MyPolynomial(arr);
        return ob;
    }
    MyPolynomial multiply(MyPolynomial right)
    {
        int m=this.getDegree();
        int n=right.getDegree();
        //System.out.println(m+n);
        double a[]=new double[m+1+n+1-1];
        for(int i=0;i<m+n-1;i++)
            a[i]=0;
        for(int i=0;i<m+1;i++)
        {
            for(int j=0;j<n+1;j++)
            {
                a[i+j] += this.coeffs[i]*right.coeffs[j];
            }
        }
        /*for(int i=0;i<m+n-1;i++)
           System.out.print(a[i]+"\t");*/
        MyPolynomial obj=new MyPolynomial(a);

        return obj;
    }


}
class TestPolynomial
{
    double[] getCoeff()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the coefficients");
        String s[]=sc.nextLine().split(" ");
        double[] arr = new double[s.length];
        for (int i = 0; i < s.length; i++) {
           String n = s[i];
           arr[i] = Double.parseDouble(n);
        }

      return arr;  

    }
	public static void main(String []args)
	{
       double arr[]={1,2,3};
       TestPolynomial o=new TestPolynomial();

        
        //MyPolynomial ob2=new MyPolynomial(arr);
        //MyPolynomial ob3=ob1.multiply(ob2);
       // System.out.println(ob3.toString());
        int f=1;
        Scanner sc=new Scanner(System.in);
        while(f==1)
        {

        
        System.out.println("Enter \n1:ADD\n2.MULTIPLY\n3.DEGREE\n4.EVALUATE\n5.DISPLAY\n6.EXIT");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            
            {
               System.out.println("Enter first polynomial");
               double a[]=o.getCoeff();
               MyPolynomial ob1=new MyPolynomial(a);
               System.out.println("Enter second polynomial");
               double b[]=o.getCoeff();
               MyPolynomial ob2=new MyPolynomial(b);
               MyPolynomial ob3=ob1.add(ob2);
               System.out.println(ob3.toString());
                break;
            }
           
            
            case 2:
            {
               System.out.println("Enter first polynomial");
               double a[]=o.getCoeff();
               MyPolynomial ob1=new MyPolynomial(a);
               System.out.println("Enter second polynomial");
               double b[]=o.getCoeff();
               MyPolynomial ob2=new MyPolynomial(b);
               MyPolynomial ob3=ob1.multiply(ob2);
               System.out.println(ob3.toString());
               break;
            }
            case 3:
            {
               
                System.out.println("Enter polynomial:");
                double a[]=o.getCoeff();
                MyPolynomial ob=new MyPolynomial(a);
                System.out.println(ob.getDegree());
                break;
            }
            case 4:

            {
                System.out.println("Enter polynomial:");
                double a[]=o.getCoeff();
                MyPolynomial ob=new MyPolynomial(a);
                System.out.println("Enter the value of x");
                double x=sc.nextDouble();
                System.out.println(ob.evaluate(x));

                break;
            }
            case 5:
            {
                System.out.println("Enter polynomial:");
                double a[]=o.getCoeff();
                MyPolynomial ob=new MyPolynomial(a);
                System.out.println(ob.toString());
                break;
            }
            case 6:
            {
                f=6;
            }
            
        }
        }

        

	}
}
