import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static List<Integer> helper(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
	    for (int i : arr) {
		    map.put(i, map.getOrDefault(i, 0) + 1);
	    }

        List<Integer> l = new ArrayList(map.keySet());
        Collections.sort(l,(a,b)->(map.get(b)-map.get(a))  );
  
          List<Integer> ans = new ArrayList<>();
          for(Integer i : l ){
              for(int j =0;j<map.get(i);j++ ){
                  ans.add(i );
              }
          }
        
        return ans;
        
        
    }
    
	public static void main (String[] args) {
	
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		for(int j =0;j<tc;j++){
		    int n = scn.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = scn.nextInt();
		    }
		    List<Integer> ans= helper(arr);
		    for(int i=0;i<ans.size();i++){
                System.out.print(ans.get(i)+" " );
            }
            System.out.println();
		}
		
	}
}



