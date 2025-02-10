class prime{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        for (int i=0; i<arr.length; i++){
            boolean isPrime= true;
            if (arr[i]<=1)
                isPrime=false;
            else{
                for(int j=2; j<arr[i];j++){
                    if(arr[i]%j==0){
                        isPrime=false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.println(arr[i]);
            }
        }
    }
}