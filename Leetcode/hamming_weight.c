int hammingWeight(uint32_t n) {
    int weight = 0;
    int i;
    
    for (i = 31; i >= 0; i--) {
        int temp =  n>>i;
        if ((temp & 1) == 1)
            weight++;
    }
    return weight;
}