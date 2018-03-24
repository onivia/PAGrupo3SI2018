//============================================================================
// Name        : 8pm_23mar2018_2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void f1(int k) {
	cout<<"paso x f1: "<<k<<endl;
}
void f2(int i) {
	cout<<"paso x f2: "<<i<<endl;
}

void wrapper(void (*pf1) (int), int i) {
	pf1(i);
}

int main() {

	wrapper(f1,20);

	return 0;
}
