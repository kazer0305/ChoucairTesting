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
    Cuando se ingresa la información personal del candidato
    Y este se le agrega la información en la sección notas
    Y se valida el ingreso exitoso
    Entonces el candidato es contratado


