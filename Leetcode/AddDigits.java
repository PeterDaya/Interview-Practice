public class AddDigits {
    public int addDigits(int num) {
        char[] chars = Integer.toString(num).toCharArray();
        int sum = 0;
        
        for (int i = 0; i < chars.length; i++)
            sum += (int) chars[i] - 48;
            
        while (sum > 9) {
            chars = Integer.toString(sum).toCharArray();
            sum = 0;
            
            for (int i = 0; i < chars.length; i++)
                sum += (int) chars[i] - 48;
        }
        
        return sum;
    }
}