class Solution {
    public List<Integer> findGoodIntegers(int n) {
        int max=(int)Math.cbrt(n);
        Map<Integer,Integer>m=new HashMap<>();
        for(int a=1;a<=max;a++){
            for(int b=a;b<=max;b++){
                int sum=a*a*a+b*b*b;
                if(sum>n)break;
                m.put(sum,m.getOrDefault(sum,0)+1);
            }
        }
        List<Integer>l=new ArrayList<>();
        for(int key:m.keySet()){
            if(m.get(key)>1){
                l.add(key);
            }
        }
        Collections.sort(l);
        return l;
    }
}