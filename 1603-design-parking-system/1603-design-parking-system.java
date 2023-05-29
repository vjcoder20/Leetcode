class ParkingSystem {

    int[] arr;
    public ParkingSystem(int big, int medium, int small) {
        arr = new int[4];
        arr[1] = big;
        arr[2] = medium;
        arr[3] = small;
    }
    
    public boolean addCar(int carType) {
        int get = arr[carType];
        if(get==0){
            return false;
        }
        arr[carType]--;
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */