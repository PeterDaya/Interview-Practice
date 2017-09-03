class Solution {
    public boolean judgeCircle(String moves) {
        int[] position = new int[2];
        
        for (int i = 0; i < moves.length(); i++) {
            char command = moves.charAt(i);
            
            if (command == 'L')
                position[0]--;
            
            else if (command == 'R')
                position[0]++;
            
            else if (command == 'U')
                position[1]++;
            
            else if (command == 'D')
                position[1]--;
        }
        
        if (position[0] == 0 && position[1] == 0)
            return true;
        
        else
            return false;
    }
}