package Week1;

public class Max_Min {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,8,9,-1};
        int maxiMun=max(arr);
        int miniMum=min(arr);

        System.out.println("Maximum value is that:"+maxiMun);
        System.out.println("minimum value is that:"+miniMum);
    }
    public static int max(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }

}
