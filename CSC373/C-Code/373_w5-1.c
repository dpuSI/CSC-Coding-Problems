#include <stdio.h>

void inCmConvert () {
	float inAmount;
	char inUnit[32]; //can only be ran once

	printf ("\n");
	printf ("Type in a length: ");
	scanf ("%f", &inAmount);
	printf ("Type in a unit (in/cm): ");
	scanf ("%s", inUnit);

	if (inUnit[0] == 'c' && inUnit[1] == 'm' && inUnit[2] == '\0'){
		printf ("%.2f in\n", (inAmount/2.54));
	}
	else if (inUnit[0] == 'i' && inUnit[1] == 'n' && inUnit[2] == '\0'){
		printf ("%.2f cm\n", (inAmount*2.54));
	}
	else printf("ERROR: Type in \"cm\" or \"in\"\n");
}

void removeSubString (char* s1, char* s2) {

	char ret[128]; //hoping s1 - s2 < 128
	
	int i;
	int j; //for use in an inner loop
	int k;
	for (i,k = 0; s1[i] != '\0'; i++, k++){

		if (s1[i] == s2[0]){
			for (j = 0; s2[j] != '\0'; j++, i++){
				if (s1[i] != s2[j]) break;
			}
			if (s2[j] != '\0') i = i-j;
		}
		ret[k] = s1[i];
	}
	ret[k] = '\0';
	printf("%s\n", ret);
}

int main(){

	//inCmConvert();
	//inCmConvert();
	
	char s1[] = "abcdabfage";
	char s2[] = "ab";
	removeSubString(s1, s2);
}
