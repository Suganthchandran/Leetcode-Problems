class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String i : details)
        {
            String a = i.substring(11,13);
            int age = Integer.parseInt(a);
            if(age>60)
                count++;
        }
        return count;
    }
}