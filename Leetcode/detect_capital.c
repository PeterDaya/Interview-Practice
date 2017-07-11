bool detectCapitalUse(char* word) {
    int len = strlen(word);
    int count = 0;
    
    if (*word < 97) {
        count++;
        int i;
        for (i = 1; i < len; i++) {
            if (*(word + i) < 97)
                count++;
        }
        
        if (count == 1 || count == len)
            return true;
            
        else
            return false;
    } 
    
    else {
        int i;
        
        for (i = 1; i < len; i++) {
            if (*(word+i) < 97) {
                return false;
            }
        }
        return true;
    }
}