class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Boolean> exists = new HashMap<>();
        for (int i: nums){
            boolean exist = exists.getOrDefault(i, false);
            if (exist == false){
                exists.put(i, true);
            } else {
                return true;
            }
        }
        return false;
    }
}