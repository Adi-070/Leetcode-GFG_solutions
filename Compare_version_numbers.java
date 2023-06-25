class Solution {
    public int compareVersion(String version1, String version2) {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        
        for(String a: version1.split("\\."))
        list1.add(a);

        for(String a: version2.split("\\."))
        list2.add(a);

       

        while(list1.size()!=list2.size())
        {
            if(list1.size()<list2.size())
            list1.add("0");

            else if(list1.size()>list2.size())
            list2.add("0");
        }

        System.out.println(list1);
        System.out.println(list2);
        

        for(int i=0; i<Math.min(list1.size(),list2.size()); i++)
        {
            if(Integer.valueOf(list1.get(i)) > Integer.valueOf(list2.get(i)))
            return 1;

            else if (Integer.valueOf(list1.get(i)) < Integer.valueOf(list2.get(i)))
            return -1;
        }
       

       return 0;

    }
}
