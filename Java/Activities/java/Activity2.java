public class Activity2 {
    public static void main(String[] args){
        int[] ar={10,77,10,54,-11,10};
        int sum=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==10){
                sum=sum+ar[i];
            }
        }
                System.out.println("true");
        
        if(sum!=30){
            System.out.println("false");
        }
    }
    
}
