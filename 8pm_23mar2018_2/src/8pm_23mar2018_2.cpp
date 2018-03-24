//============================================================================
// Name        : 8pm_23mar2018_2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void suma(int a, int b) {
	cout<<"la suma es: "<<a+b<<endl;
}
void resta(int a, int b) {
	cout<<"la resta es: "<<a-b<<endl;
}


int main() {
	void (*pf[])(int,int) = {suma,resta};

	pf[1](100,20);

	return 0;
}
