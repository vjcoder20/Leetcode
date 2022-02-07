class MyHashSet {
    boolean[] hash;
    public MyHashSet() {
        hash = new boolean[1];
    }
    
    public void add(int key) {
        if(key > hash.length - 1){
            boolean[] newHash = new boolean[key + hash.length * 2];
            System.arraycopy(hash,0,newHash,0,hash.length);
            hash = newHash;
        }
        hash[key] = true;
    }
    
    public void remove(int key) {
        if(key > hash.length - 1)
            return;
        hash[key] = false;
    }
    
    public boolean contains(int key) {
        if(key > hash.length - 1)
            return false;
        return hash[key];
    }
}
/*
public static void arraycopy(Object src, int srcPos, Object dest, 
                             int destPos, int length)
*/