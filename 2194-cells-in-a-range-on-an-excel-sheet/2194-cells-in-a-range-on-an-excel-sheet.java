class Solution {
    public List<String> cellsInRange(String str) {
        List<String> li = new ArrayList<>();
        String[] arr = str.split(":");
        for(char i=arr[0].charAt(0);i<=arr[1].charAt(0);i++){
            for(int j=arr[0].charAt(1)-'0';j<=arr[1].charAt(1)-'0';j++){
                li.add(""+i+j);
            }
        }
        return li;
    }
}