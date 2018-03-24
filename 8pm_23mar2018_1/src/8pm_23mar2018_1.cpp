//============================================================================
// Name        : 8pm_23mar2018_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {
	int *p = NULL;

	p = (int *) malloc(2 * sizeof(int));

	p[0] = 100;
	p[1] = 200;

	cout<<p[0]<<endl;
	cout<<p[1]<<endl;

	p = (int *) realloc(p,3);

	p[2] = 50;

	cout<<p[2]<<endl;

	free(p);
	p = NULL;

	return 0;
}
