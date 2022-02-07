class MyHashSet {

    ArrayList<Integer> li = new ArrayList<>();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(!li.contains(key))
            li.add(key);
    }
    
    public void remove(int key) {
        if(li.contains(key))
        li.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        if(li.contains(key)){
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */