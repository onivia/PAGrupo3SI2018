//============================================================================
// Name        : 8pm_02abril2018_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

struct Asignatura {
	int id;
	char nombreasignatura[16];
};

struct Estudiante {
	int codigo;
	char nombre[16];
	Asignatura *asignaturas;
};

int main() {
	int cantestudiantes = 0;
	int cantasignaturas = 0;
	Estudiante *estudiantes = NULL;

	cout<<"Entre cantidad estudiantes: "<<endl;
	cin>>cantestudiantes;

	estudiantes = (Estudiante *) malloc(cantestudiantes * sizeof(Estudiante));
	for(int i=0; i<cantestudiantes; i++) {
		cout<<"Entre el codigo para el estudiante ("<<i+1<<"): "<<endl;
		cin>>estudiantes[i].codigo;
		cin.ignore();
		cout<<"Entre el nombre para el estudiante ("<<i+1<<"): "<<endl;
		cin.getline(estudiantes[i].nombre,16);

		cout<<"Entre cantidad de sus asignaturas: "<<endl;
		cin>>cantasignaturas;

		estudiantes[i].asignaturas = (Asignatura *) malloc(cantasignaturas * sizeof(Asignatura));
		for(int j=0;j<cantasignaturas;j++) {
			cout<<"Entre id de la asignatura ("<<j+1<<"): "<<endl;
			cin>>estudiantes[i].asignaturas[j].id;
			cin.ignore();
			cout<<"Entre el Nombre de la asignatura ("<<j+1<<"): "<<endl;
			cin.getline(estudiantes[i].asignaturas[j].nombreasignatura,16);
		}
	}

	for(int i=0; i<cantestudiantes; i++) {
		free(estudiantes[i].asignaturas);
		estudiantes[i].asignaturas = NULL;
	}
	free(estudiantes);
	estudiantes = NULL;

	return 0;
}
