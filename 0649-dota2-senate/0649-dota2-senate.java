class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> q1 = new ArrayDeque<>(), q2 = new ArrayDeque<>();
        int n = senate.length();
        for(int i = 0; i<n; i++){
            if(senate.charAt(i) == 'R')q1.add(i);
            else q2.add(i);
        }
        while(!q1.isEmpty() && !q2.isEmpty()){
            int ind1 = q1.remove(), ind2 = q2.remove();
            if(ind1 < ind2)q1.add(ind1 + n);
            else q2.add(ind2 + n);
        }
        return (q1.size() > q2.size())? "Radiant" : "Dire";
    }
}