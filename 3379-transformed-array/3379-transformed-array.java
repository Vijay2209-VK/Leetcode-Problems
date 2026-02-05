class Solution {
    public int[] constructTransformedArray(int[] A) {
        int n = A.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int idx = (i + A[i]) % n;
            if (idx < 0) idx += n;   
            ans[i] = A[idx];
        }

        return ans;
    }
}
