class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int elem : arr) {
            set.add(elem);
        }

        int longestStreak = 0;

        for (int elem:arr) {
            if (!set.contains(elem-1)) {
                int currentelem = elem;
                int currentStreak = 1;

                while (set.contains(currentelem+1)) {
                    currentelem += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}