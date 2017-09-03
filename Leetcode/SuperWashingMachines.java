class Solution {
    public int findMinMoves(int[] machines) {
        int sum = 0;
        for (int i = 0; i < machines.length; i++)
            sum += machines[i];
        
        if (sum%machines.length != 0)
            return -1;
        
        int result = 0;
        int count  = 0;
        int avg = sum/machines.length;
        
        for (int i: machines) {
            count += i-avg;
            result = Math.max(result, Math.max(Math.abs(count), i-avg));
        }
        return result;
    }
}