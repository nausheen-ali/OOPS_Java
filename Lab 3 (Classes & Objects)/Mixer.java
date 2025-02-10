import java.util.*;
class Mixer {
    int arr[];
    Mixer(int n){
        arr= new int[n];
    }    
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter "+arr.length+" sorted elements");
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
    }
    Mixer mix (Mixer A){
        int n1= arr.length, n2= A.arr.length;
        int mergedArray[]= new int[n1+n2];
        int i=0, j=0, k=0;
        while (i<n1 && j<n2){
            if (arr[i]<=A.arr[j])
                mergedArray[k++]=arr[i++];
            else 
                mergedArray[k++]= A.arr[j++];
        }
        while(i<n1)
            mergedArray[k++]=arr[i++];
        while(j<n2)
            mergedArray[k++]=A.arr[j++];
        Mixer result = new Mixer(k);
        result.arr=mergedArray;
        return result;
    }
    void display(){
        for (int num:arr){
            System.out.println(num+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of first array");
        Mixer m1= new Mixer(sc.nextInt());
        m1.accept();
        System.out.println("enter size of second array");
        Mixer m2= new Mixer(sc.nextInt());
        m2.accept();
        Mixer result = m1.mix(m2);
        System.out.println("Merged array in ascending order");
        result.display();
    }
}
