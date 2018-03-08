//============================================================================
// Name        : 8pm_07mar2018_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "libs/Operaciones.h"
using namespace std;
using namespace principal;

int main() {
	int resultado = 0;
	int num1 = 0;
	int num2 = 0;
	char cadena[16] = "";

	cout<<"Ingrese num1: ";
	cin>>num1;

	cin.ignore();

	cout<<"Ingrese cadena: ";
	cin.getline(cadena,16);

	cout<<"num1: "<<num1<<"-cadena: "<<cadena<<endl;

//	cout<<"Ingrese num2: ";
//	cin>>num2;
//
//	resultado = sumar(num1,num2);
//
//	cout<<"La suma es: "<<resultado;

	return 0;
}
