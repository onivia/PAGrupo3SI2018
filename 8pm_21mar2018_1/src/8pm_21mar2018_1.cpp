//============================================================================
// Name        : 8pm_21mar2018_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void f1(int *p1) {
	cout<<*(p1 + 2)<<endl;
	cout<<p1[2]<<endl;
}

int main() {
	int nums[] = {10,20,30};
	int *p = NULL;

	p = nums;

	f1(p);

	return 0;
}
