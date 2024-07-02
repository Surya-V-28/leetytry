
class Solution {
    
    static boolean palindrome(char[]ch, int st, int end)
    {
        while(st<end)
        {
            if(ch[st]!=ch[end])
            {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
    
    public boolean compute(Node root) {
        
        StringBuilder sb = new StringBuilder();
        
        Node cur = root;
        
        while(cur!=null)
        {
            sb.append(cur.data);
            cur = cur.next;
        }
        
        char[]ch = sb.toString().toCharArray();
        
        return palindrome(ch, 0, ch.length-1);
    }
}