class Solution {
    public int solution(int slice, int n) {
        if (n < 1 && n > 100 && slice < 2 && slice > 10) {
            System.out.print("error");
        }
        
        return n <= slice ? 1 : n % slice == 0 ? n / slice : n / slice + 1;
    }
}