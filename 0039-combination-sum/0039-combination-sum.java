class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtracking(0,res,curr,target,candidates);
        return res;
    }

    public void backtracking(int start, List<List<Integer>> res, List<Integer> curr, int target, int[] candidates) {
        if(target < 0) {
            return;
        }

        if(target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start;i<candidates.length;i++) {
            curr.add(candidates[i]);
            backtracking(i,res,curr,target-candidates[i],candidates);
            curr.remove(curr.size()-1);
        }
    }
}