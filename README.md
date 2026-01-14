# Login System

Simula un proceso de inicio de sesión validando la entrada del usuario contra una base de datos predefinida de nombres de usuario y contraseñas.

## Descripción

Este programa solicita credenciales al usuario y las verifica utilizando una base de datos basada en arreglos (arrays) codificados en el sistema.

## Flujo de Trabajo (Workflow)

Basado en la documentación del flujo de trabajo proporcionada:

1.  **Inicio del Programa**: El sistema se inicializa y muestra un header "LOG-IN".
2.  **Ingresar Usuario**: Se pide al usuario que introduzca un nombre de usuario a través de la terminal.
3.  **Validar Usuario**:
    * El sistema llama al método `confirmUser` para recorrer el arreglo de usuarios almacenados.
    * **Si se encuentra**: Retorna el index del array user.
    * **Si no se encuentra**: Imprime "Username not found!" y el programa termina.
4.  **Ingresar Contraseña**: Si el usuario es válido, se solicita ingresar la contraseña.
5.  **Validar Contraseña**:
    * El sistema llama al método `confirmPassword` usando el índice encontrado en el paso anterior.
    * Compara la entrada contra la contraseña almacenada en ese índice específico.
6.  **Resultado**:
    * **Éxito**: Imprime "Logged in successfully!".
    * **Fallo**: Imprime "Incorrect!".

## 🧪 Credenciales de Prueba

Puedes usar las siguientes credenciales predefinidas para probar el sistema:

| Usuario | Contraseña |
| :--- | :--- |
| `ndreaszn` | `password123` |
| `gromero929` | `andee929` |
| `andreyuh` | `random321` |
