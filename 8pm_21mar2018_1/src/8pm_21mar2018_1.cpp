//============================================================================
// Name        : 8pm_21mar2018_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void f1(int **p1) {
	int b = 20;

	*p1 = &b;

	cout<<**p1<<endl; //2°: 20
}

void f2(int *p1) {
	int b = 20;

	p1 = &b;

	cout<<*p1<<endl; //2°: 20
}

int main() {
	int a = 10;
	int *p = NULL;

	p = &a;

	cout<<*p<<endl; //1°: 10
	//f1(&p);
	f2(p);
	cout<<*p<<endl; //3°: ?

	return 0;
}
