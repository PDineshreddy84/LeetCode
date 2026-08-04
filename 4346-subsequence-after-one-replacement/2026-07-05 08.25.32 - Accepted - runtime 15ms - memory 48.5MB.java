class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int n=s.length(),m=t.length();
        int pref[]=new int[n+1];
        int j=0;
        for(int i=0;i<n;i++){
            while(j<m && t.charAt(j)!=s.charAt(i)){
                j++;
            }
            if(j<m){
                j++;
                pref[i+1]=j;
            }
            else{
                pref[i+1]=m+1;
                for(int k=i+2;k<=n;k++)pref[k]=m+1;
                break;
            }
        }
        if(pref[n]<=m)return true;
        int suff[]=new int[n+1];
        suff[n]=m;
        int k=m;
        for(int i=n-1;i>=0;i--){
            k--;
            while(k>=0 && t.charAt(k)!=s.charAt(i))k--;
            suff[i]=k;
        }
        for(int i=0;i<n;i++){
            int p=pref[i];
            if(p>m)break;
            if(p>=m)continue;
            if(suff[i+1]>=p+1)return true;
        }
        return false;
    }
}