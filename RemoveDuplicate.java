public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int n=arr.length;

        for(int i=0;i<n;i++){
            boolean isDuplicate=false;
            int j;
            for(j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
        }
        if(!isDuplicate){
            System.out.print(arr[i]+" ");
        }
    }
}
}
