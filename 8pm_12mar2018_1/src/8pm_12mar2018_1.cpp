//============================================================================
// Name        : 8pm_12mar2018_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void EvaluaConteoTildesCadena();
bool EsTildada(char caracter);

int main() {
	EvaluaConteoTildesCadena();

	return 0;
}

void EvaluaConteoTildesCadena() {
	char cadena[16] = "";
	int cantidadtildes = 0;
	int i = 0;

	cout<<"Entre cadena: ";
	cin.getline(cadena,16);

	while(cadena[i]) {
		if(EsTildada(cadena[i])) {
			cantidadtildes++;
		}
		i++;
	}

	cout<<"Cantidad de Tildes: "<<cantidadtildes<<endl;
}

bool EsTildada(char caracter) {
	char tildes[] = {'á','é','í','ó','ú'};
	bool resultado = false;
	int i = 0;

	while(tildes[i]) {
		if(toupper(caracter) == toupper(tildes[i])) {
			resultado = true;
			break;
		}
		i++;
	}

	return resultado;
}
