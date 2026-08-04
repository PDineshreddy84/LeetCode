class Solution {
    public int distMoney(int money, int children) {
        if(money<children)return -1;
        int ans=0;
        int f=0;
        while(money>=8){
            ans++;
            f=1;
            money-=8;
            children--;
            if(children==0){
                break;
            }
        }
        if(money==4 && children==1)ans--;
        while(money!=0){
            money--;
            children--;
            if(children==0)break;
        }
        return (children!=0&&f==1)?ans-1:ans;
    }
}