public class Node{
    Node links[]=new Node[2];
    boolean containsKey(int bit){
        return links[bit]!=null;
    }
    Node get(int bit){
        return links[bit];
    }
    void put(int bit,Node node){
        links[bit]=node;
    }
}
class Solution {
    Node root=new Node();
    public void insert(int num){
        Node node=root;
        for(int i=31;i>=0;i--){
            int bit=(num>>i)&1;
            if(!node.containsKey(bit)){
                node.put(bit,new Node());
            }
            node=node.get(bit);
        }
    }
    public int getMaxXor(int num){
        Node node=root;
        int maxXor=0;
        for(int i=31;i>=0;i--){
            int bit=(num>>i)&1;
            if(node.containsKey(1-bit)){
                maxXor|=(1<<i);
                node=node.get(1-bit);
            }
            else{
                node=node.get(bit);
            }
        }
        return maxXor;
    }
    public int findMaximumXOR(int[] nums) {
        for(int num:nums){
            insert(num);
        }
        int max=0;
        for(int num:nums){
            max=Math.max(max,getMaxXor(num));
        }
        return max;
    }
}