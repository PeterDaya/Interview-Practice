int titleToNumber(char* s) {
    int exp = strlen(s)-1;
    char *tmp = s;
    int sum = 0;
    
    for (tmp = s; *tmp != '\0'; tmp++) {
        sum += (*tmp-64) * pow(26, exp);
        exp--;
    }
    
    return sum;
}