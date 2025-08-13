class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        List<Integer>list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        Collections.sort(list,new Comparator<Integer>()
        {
            public int compare(Integer a, Integer b){
                int freqa=mp.get(a);
                int freqb=mp.get(b);
                if(freqa!=freqb){
                    return freqa-freqb;
                                    }
                                    else{
                                        return b-a;
                                    }
            }
        });
        int [] result =new int[nums.length];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}