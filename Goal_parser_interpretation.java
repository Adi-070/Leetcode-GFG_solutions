class Solution {
    public String interpret(String command) {
        
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<command.length()-1; i++)
        {
            char c = command.charAt(i);
            char d = command.charAt(i+1);

            if(c=='G')
            sb.append("G");

            else if(c=='(' && d==')')
            sb.append("o");

            else if(c=='(' && d=='a')
            sb.append("al");
        }
        if(command.charAt(command.length()-1)=='G')
        sb.append("G");

        return sb.toString();
    }
}
