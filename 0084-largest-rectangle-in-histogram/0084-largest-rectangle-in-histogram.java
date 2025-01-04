class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length,ans=0;
        int[] lm = new int[n];
        int[] rm = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++) {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                lm[i] = 0;
            }
            else {
                lm[i] = stack.peek()+1;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            stack.pop();
        }
        for(int i=n-1;i>=0;i--) {
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                rm[i] = n-1;
            }
            else {
                rm[i] = stack.peek()-1;
            }
            stack.push(i);
        }
        for(int i=0;i<n;i++) {
            ans = Math.max(ans,heights[i]*(rm[i]-lm[i]+1));
        }
        return ans;
    }
}