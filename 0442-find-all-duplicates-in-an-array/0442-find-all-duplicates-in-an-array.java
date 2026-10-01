class Solution {
    public List<Integer> findDuplicates(int[] nums) {
  HashMap<Integer,Integer>  map = new HashMap<>();
  ArrayList<Integer>  list = new ArrayList<>(); 
for(int i=0; i<nums.length; i++){

    map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
}

for(int j=0; j<nums.length;j++){
    if(map.get(nums[j])>1){
    list.add(nums[j]);
    map.put(nums[j], 0);
}
    
    }

   
return list;

    }
}