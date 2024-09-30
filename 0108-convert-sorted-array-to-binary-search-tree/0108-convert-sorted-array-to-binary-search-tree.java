/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        if(n==0) {
            return null;
        }
        return Recursion(nums,0,n-1);
    }

    public TreeNode Recursion(int[] nums,int s,int e) {
        if(s>e) {
            return null;
        }
        int mid = s+(e-s)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = Recursion(nums,s,mid-1);
        node.right = Recursion(nums,mid+1,e);
        return node;
    } 
}