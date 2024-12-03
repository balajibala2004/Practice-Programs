class Solution {
    public String removeOuterParentheses(String s) {
        

       char[] ch = s.toCharArray();

       StringBuilder str = new StringBuilder();

       int br = 0;

       for(char c : ch)
       {
        if(c=='(')
        {
            if(br>0)
            {
                str.append(c);
            }
            br++;

        }
        else if(c==')')
        {
            br--;
            if(br>0)
            {
                str.append(c);
            }
        }
       }

        return str.toString();
    }
}
