class RideSharingSystem {
    List<Integer>d;
    List<Integer>r;
    public RideSharingSystem() {
        d=new ArrayList<>();
        r=new ArrayList<>();
    }
    public void addRider(int riderId) {
        r.add(riderId);
    }
    
    public void addDriver(int driverId) {
        d.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        if(r.size()==0||d.size()==0){
            return new int[]{-1,-1};
        }
        int r1=d.remove(0);
        int r2=r.remove(0);
        return new int[]{r1,r2};
    }
    public void cancelRider(int riderId) {
        r.remove(Integer.valueOf(riderId));
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */