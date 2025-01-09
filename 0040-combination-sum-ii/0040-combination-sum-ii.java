class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
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

            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            curr.add(candidates[i]);
            backtracking(i+1,res,curr,target-candidates[i],candidates);
            curr.remove(curr.size()-1);
        }
    }
}