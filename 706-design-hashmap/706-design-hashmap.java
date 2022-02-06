class MyHashMap {
    
    LinkedList<HMNode>[] buckets;
        int size; 
    
    class HMNode{
        int key;
        int value;
        
        HMNode(int key,int value){
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        initbuckets(4);
        size = 0;
    }
    
    public void initbuckets(int n){
        buckets = new LinkedList[n];
        for(int bi=0;bi<buckets.length;bi++){
            buckets[bi] = new LinkedList<>();
        }
    }
    
    public void put(int key, int value) {
        int bi = hashfn(key);
        int di = getIndexWithinBucket(key,bi);
        if(di==-1){
        HMNode node = new HMNode(key,value);
        buckets[bi].add(node);
        size++;
        }else{
            HMNode node = buckets[bi].get(di);
            node.value = value;
        }
        double lambda = size*1.0/buckets.length;
        if(lambda>2.0){
            rehash();
        }
    }
    
    public void rehash(){
         LinkedList<HMNode>[] oba = buckets;
        initbuckets(oba.length*2);
        size = 0;
        
        for(int i=0;i<oba.length;i++){
            for(HMNode node:oba[i]){
                put(node.key,node.value);
            }
        }
    }
    
    public int hashfn(int key){
        int hc = Integer.hashCode(key);
        return Math.abs(hc)%buckets.length;
    }
    
     public int getIndexWithinBucket(int key,int bi){
         int di = 0;
        for(HMNode node:buckets[bi]){
            if(node.key==key){
                return di;
            }
            di++;
        }
         return -1;
    }
    
    public int get(int key) {
          int bi = hashfn(key);
        int di = getIndexWithinBucket(key,bi);
        if(di==-1){
       return -1;
        }else{
            HMNode node = buckets[bi].get(di);
            return node.value;
        }
    }
    
    public void remove(int key) {
          int bi = hashfn(key);
        int di = getIndexWithinBucket(key,bi);
        if(di==-1){
        }else{
            HMNode node = buckets[bi].remove(di);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */