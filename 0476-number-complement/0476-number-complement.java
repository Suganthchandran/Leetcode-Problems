class Solution {
    public int findComplement(int num) {
        int rem[] = new int[100];
        int i = 0;
        while(num!=0) {
            rem[i] = num%2;
            num = num/2;
            i++;
        }

        for(int j=i-1;j>=0;j--) {
            if(rem[j]==1)
                rem[j] = 0;
            else
                rem[j] = 1;
        }

        return Bin(rem);
    }

    public int Bin(int a[]) {
        int base = 1;
        int res = 0;
        for(int i : a) {
            res += i*base;
            base = base*2; 
        }
        return res;
    }
}