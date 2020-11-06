#include <stdio.h>

char lastChar (char *s)
{
        int i;
	char temp;
        for (i = 0; s[i] != '\0'; i++)
		temp = s[i];
        return temp;
}

int main ()
{
        char s[] = "flapdoodle";
        lastChar (s);
}

