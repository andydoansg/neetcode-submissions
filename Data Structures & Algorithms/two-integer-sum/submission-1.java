class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> indexMap = new HashMap<>();
        int[] result = new int[2];
        for (int i=0; i< nums.length; i++){
            // Find complement item, if existing then return both
            int existing = indexMap.getOrDefault(target - nums[i], -1);
            if (existing != -1){
                // Found , return 
                int min = Math.min(i, existing);
                int max = Math.max(i, existing);
                result[0] = min;
                result[1] = max;
                return result;
            } else {
                // If not found, add current number to Map
                indexMap.put(nums[i], i);
            }
        }
        return result;
    }
}
