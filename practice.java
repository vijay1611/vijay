class Solution{
    public int maxProfit(int[] prices){
        int buy=Integer.MAX_VALUE
        int profit =0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<=buy){
                buy=profit[i];
            }else{
                profit+=profit+(prices[i]-buy);
                buy=prices[i];
            }
        }
        return profit;
    }
}
//boat poroblem

class Solution{
    public int boat(int[] people,int limit){
        int boatUsed=0;
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        while(left<=right){
            boatUsed+=1;
            if(people[left]+people[right]<=limit){
                left+=1;
            }
            right-=1;
        }
        return boatUsed;
    }
}