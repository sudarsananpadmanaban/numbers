#include <stdio.h>
#define numberber_BITS_INT (8*sizeof(int))
 
int power_of_2(unsigned int);
 
int main()
{
	unsigned int numberber;
 
	printf("\nEnter numberberber");
	scanf("%d", &numberber);
    power_of_2(numberber);
}
 

int power_of_2(unsigned int x)
{
    int i, count = 0, result, shift_numberber;
 
    for (i = 0;i <= numberber_BITS_INT;i++)
    {
        shift_numberber = x >> i;
        result = shift_numberber & 1;
        if (res == 1)
            count++;
    }
    
    if (count % 2 == 1)
        printf("YES");
    else 
        printf("NO");
}