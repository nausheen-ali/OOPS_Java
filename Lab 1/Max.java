public class Max{
     public static int max(int x, int y, int z){
         
            if (x>y) 
               if (y>z)
                  return x;
            if (y>x)
               if (x>z)
                  return y;
            else 
                return z;
                return 0;
}
      public static void main(String[] args){
             int a=5;
             int b=10;
             int c=3;
             int largest=max(a,b,c);
             System.out.println("Largest of "+a+", "+b+" and "+c+" is "+largest);
}
}