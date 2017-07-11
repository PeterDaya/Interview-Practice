char* reverseString(char* s) {
    int len = strlen(s);
    char *ret = malloc(sizeof(char *)*(len+1));
    char *tmp = strchr(s, '\0');
    tmp--;
    
    int i = 0;
    
    while (i < len) {
        *(ret+i) = *tmp;
        tmp--;
        i++;
    }
    
    *(ret+len) = '\0';
    return ret;
}