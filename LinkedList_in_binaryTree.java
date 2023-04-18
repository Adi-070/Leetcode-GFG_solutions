class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
      
        if(head==null)return true;
        if(root==null)return false;
        
        
        else if(isSameList(head,root)){
            return true;
        }
        else{
            return isSubPath(head,root.left) ||isSubPath(head,root.right);
        }
    }
    public boolean isSameList(ListNode head,TreeNode root){
        if(head==null)return true;
        if(root==null)return false;
        else if(root.val==head.val){
            return isSameList(head.next,root.left) || isSameList(head.next,root.right);
        }else{
            return false;
        }
    }
}
