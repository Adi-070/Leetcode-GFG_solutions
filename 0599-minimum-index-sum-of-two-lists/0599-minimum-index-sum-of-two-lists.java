class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        HashMap<String,Integer> map = new HashMap<>();
        int min=Integer.MAX_VALUE;
        String keyWithMinValue = null;

        for(int i=0; i<list1.length; i++)
        {
            for(int j=0; j<list2.length; j++)
            {
                if(list1[i].equals(list2[j]))
                map.put(list1[i],i+j);
            }
        }
    for (int value : map.values()) {
            if (value < min) {
                min = value;
            }
        }

        // Collect all keys with the minimum index sum
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == min) {
                result.add(entry.getKey());
            }
        }

        // Convert the result list to a String array
        return result.toArray(new String[0]);
    }
}