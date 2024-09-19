# Author: alaraquema@gmail.com
# language: es
# Creación de Feature en Español para ingreso y validación de empleado

@ContratarEmpleado
Característica: Contratar un empleado para la plataforma

  Yo como administrador de la plataforma orange
  Quiero agregar un empleado a la plataforma de nomina
  Para poder gestionar las necesidades del ingreso de empleado a la empresa

  Antecedentes:
    Dado "Administrador" abre el sitio web de pruebas

  Escenario: Agregar candidato en la plataforma de nomina
    Cuando Accede al sitio web usando sus credenciales
    Y se ingresa la informacion personal del candidato
    Y este se le agrega la informacion en la seccion notas
    Entonces el candidato es ingresado en plantilla


