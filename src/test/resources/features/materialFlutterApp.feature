# language: es
Característica: App
  Como un usuario de de Material Flutter App, quiero interactuar con las diferentes funcionalidades de la App

#  @Button
#  Escenario: Aprobar con el boton
#    Dado el usuario Mafe ingresa a la opcion Buttons Demo
#    Cuando el usuario da click en el boton Approve
#    Entonces el usuario deberia seguir viendo el boton habilitado
#
#  @ChipsDemo
#  Escenario: Activar la notificacion
#    Dado el usuario Mafe ingresa a la opcion Chips Widget
#    Cuando el usuario da click en el boton ActionChip
#    Entonces el usuario debe ver la notificacion "ActionChip Message Acttion!"
#
#  @DataPickerScreen
#  Escenario: Escoger la fecha y hora de nacimiento
#    Dado el usuario Mafe ingresa a la opcion DatePickerscreen
#    Cuando el usuario selecciona la fecha 26 nov 2017
#    Entonces el usuario ve la pantalla de material desing "Show Case Material 2 vs 3 "

#  @TextFieldWidgetFirstPartFull
#  Escenario: Llenar los campos de la primera parte de formulario y validar
#    Dado el usuario Mafe ingresa a la opcion TextFieldWidget
#    Cuando el usuario llena los dos campos
#    Entonces el usuario valida la informacion y es correcta mostrando un chulo verde "Input is valid"
#
#  @TextFieldWidgetFullSecondPart
#  Escenario: Llenar los campos de texto de la segunda parte y validar
#    Dado el usuario Mafe ingresa a la opcion TextFieldWidget
#    Cuando el usuario llena todos los campos con nombre "Fernanda" celular "3197079603" y contrasena "Mafe98"
#    Entonces el usuario valida la informacion y es correcta con la alerta "Form is valid"

#
#  @TextFieldWidgetWrongNumber
#  Escenario: Llena el numero de celular mal
#    Dado el usuario Mafe ingresa a la opcion TextFieldWidget
#    Cuando el usuario llena el campo celular "3"
#    Entonces el usuario valida la informacion y sale el mensaje "Numero incompleto"
#
#
#
  @TextFieldWidgetEmptyName
  Escenario: El usuario deja el campo Nombre vacio
    Dado el usuario Mafe ingresa a la opcion TextFieldWidget
    Cuando el usuario deja vacio el campo Nombre
    Entonces el usuario valida la informacion del nombre y sale el mensaje "El campo es necesario"

















