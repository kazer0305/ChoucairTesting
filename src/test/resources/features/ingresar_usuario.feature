# Author: alaraquema@gmail.com
# language: es
# Creación de Feature en Español para apertura de sesión

@IngresoUsuarioOrange
Característica: Ingreso usuario exitosa

  Yo como administrador de plataforma de contratación Orange
  Quiero realizar una prueba de autenticación de usuario
  Para garantizar que las credenciales trabajen correctamente

  Antecedentes:
    Dado "Administrador" abre el sitio web de pruebas

@AutenticaciónExitosa
  Escenario: Ingreso de usuario exitoso
  Cuando Accede al sitio web usando sus credenciales
  Entonces Visualizará la página de inicio y esperará una validación
