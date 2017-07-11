bool isPowerOfFour(int num) {
    if (num <= 0)
        return false;
        
    else if (num == 1)
        return true;
        
    else if (num % 4 == 0) {
        return isPowerOfFour(num/4);
    }
    
    else
        return false;
}