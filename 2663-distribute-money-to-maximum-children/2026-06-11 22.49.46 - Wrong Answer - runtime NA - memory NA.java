class Solution {
    public int distMoney(int money, int children) {
        if(money<children)return -1;
        int ans=0;
        while(money>=8){
            ans++;
            money-=8;
            children--;
            if(children==0){
                break;
            }
        }

        return (money==4&&children!=0)?ans-1:ans;
    }
}