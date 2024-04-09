class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        Queue<Integer> stud = new LinkedList<>();

        int c=0;

        for(int i: students)
        stud.add(i);

        int top=0;
        while(!stud.isEmpty() && c<stud.size())
        {
            if(stud.peek()==sandwiches[top])
            {
                stud.poll();
                top++;
                c=0;
            }
            else
            {
                stud.add(stud.poll());
                c++;
            }
        }
        return stud.size();
    }
}
