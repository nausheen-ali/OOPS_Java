public class reverse{
       public static int rev(int x){
            int n=0;
            int p=0;
            while (x>0){
            p=x%10;
            n=n*10+p;
            x=x/10;}
           return n;
}
        public static void main(String[] args){
           int a=123;
           int r=rev(a);
           System.out.println("The reverse of "+a+" is" +r);
           if (a==r)
              System.out.println("The number is palindrome");
           else
              System.out.println("The number is not palindrome");
}
}