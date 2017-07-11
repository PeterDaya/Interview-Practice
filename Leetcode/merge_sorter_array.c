int compare(const int *a, const int *b) {
    if (*a < *b)
        return -1;
        
    if (*a == *b)
        return 0;
        
    else
        return 1;
}
void merge(int* nums1, int m, int* nums2, int n) {
    int *tmp = nums1 + m;
    int i;
    
    for (i = 0; i < n; i++)
        *tmp++ = *(nums2 + i);
        
    qsort(nums1, m+n, 4, compare);
}