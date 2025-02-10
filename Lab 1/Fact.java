public class Fact{
       public static int fact(int n){
              int x=1;
              for (int i=1;i<=n;i++)
                  x=x*i;
              return x;
}

public static void main(String[] args){
      int a=7;
      int r=3;
      int f=fact(a);
      int c=fact(a)/(fact(r)*fact(a-r));
      System.out.println("The factorial of "+a+" is" +f);
      System.out.println("NcR of "+a+" and "+r+" is" +c);
}
}
