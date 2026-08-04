class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n=accounts.size();
        Disjoint ds=new Disjoint(n);
        Map<String,Integer>m=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=1;j<accounts.get(i).size();j++){
                String mail=accounts.get(i).get(j);
                if(m.containsKey(mail)){
                    ds.unionBySize(i,m.get(mail));
                }
                else{
                    m.put(mail,i);
                }
            }
        }
        List<String>mergedMail[]=new ArrayList[n];
        for(int i=0;i<n;i++){
            mergedMail[i]=new ArrayList<>();
        }
        for(Map.Entry<String,Integer>it:m.entrySet()){
            String mail=it.getKey();
            int node=ds.findUlp(it.getValue());
            mergedMail[node].add(mail);
        }
        List<List<String>>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(mergedMail[i].size()==0)continue;
            Collections.sort(mergedMail[i]);
            List<String>t=new ArrayList<>();
            t.add(accounts.get(i).get(0));
            t.addAll(mergedMail[i]);
            l.add(t);
        }
        return l;
    }
}
public class Disjoint{
    List<Integer>rank=new ArrayList<>();
    List<Integer>parent=new ArrayList<>();
    List<Integer>size=new ArrayList<>();
    public Disjoint(int n){
        for(int i=0;i<n;i++){
            parent.add(i);
            rank.add(0);
            size.add(1);
        }
    }
    public int findUlp(int node){
        if(node==parent.get(node)){
            return node;
        }
        int ulp=findUlp(parent.get(node));
        parent.set(node,ulp);
        return parent.get(node);
    }
    public void unionBySize(int u,int v){
        int ulp_u=findUlp(u);
        int ulp_v=findUlp(v);
        if(ulp_u==ulp_v)return;
        if(size.get(u)<size.get(v)){
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v,size.get(ulp_u)+size.get(ulp_v));
        }
         else{
            parent.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(ulp_u)+size.get(ulp_v));
        }
    }
}