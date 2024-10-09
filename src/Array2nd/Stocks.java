package Array2nd;

public class Stocks {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int profit=checkStock(arr);
        System.out.println(profit);
    }
    static int checkStock(int arr[]){
        int n=arr.length;
        int buyPrice=arr[0];
        int maxProfit=0;
        for(int i=1;i<n;i++){
            if(arr[i]<buyPrice){
                buyPrice=arr[i];
            }
            int profit=arr[i]-buyPrice;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}
