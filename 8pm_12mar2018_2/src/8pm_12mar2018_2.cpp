//============================================================================
// Name        : 8pm_12mar2018_2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void f1(int *a) {
	*a = *a + 1;
}

void f2(int b[]) {
	b[0] = b[0] + 1;
}

int main() {
	int x1 = 10;
	int x2[] = { 10 };
	int y[] = { 0 };

	f1(&x1);
	cout<<"Despues de llamar a f1: "<<x1<<endl; //Oscar:11, Daniel:11
	y[0] = x2[0];
	f2(y);
	cout<<"Despues de llamar a f1: "<<x2[0]<<endl; //Daniel V:11, Juan P:10

	return 0;
}
