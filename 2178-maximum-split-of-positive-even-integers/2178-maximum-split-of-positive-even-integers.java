class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> li = new ArrayList<>();
        if(finalSum%2!=0){
            return li;
        }
        long i = 2;
        while(i<=finalSum){
            li.add(i);
            finalSum-=i;
            i+=2;
        }
        li.set(li.size()-1,li.get(li.size()-1)+finalSum);
        return li;
    }
}