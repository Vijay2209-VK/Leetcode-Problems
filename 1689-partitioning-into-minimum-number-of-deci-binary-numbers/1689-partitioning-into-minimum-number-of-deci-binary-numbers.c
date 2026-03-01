int minPartitions(char* n) {
    int temp = 0;
    int maxInteger = INT_MIN;
    while(*n != '\0')
    {
        int temp = (*n-'0');
        if(temp>maxInteger)
        {
            maxInteger=temp;
        }
        n++;
    }
    return maxInteger;
}