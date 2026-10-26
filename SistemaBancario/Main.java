package SistemaBancario;

import java.util.InputMismatchException;
import java.util.Scanner;

// Sistema Bancario
/*
1. Poder crear usuarios y guardarlos en un conjunto de datos.
2. Poder iniciar sesion como un usuario.
Usuario:
ID
nombre
contraseña
3. Poder iniciar sesion como un administrador.
4. Si eres administrador poder eliminar usuarios solo si sus cuentas estan en 0
5. Poder visualizar todos los usuarios si eres administrador (solo nombre y numero de cuenta).
6. Para visualizar un saldo de una cuenta externa debes poder ser administrador y seleccionar la cuenta correacta.
7. Poder hacer transferencias entre usuarios, debes considerar el saldo del usuario, que el usuario existe, que la cuenta existe y vinculada al usuario que tienes sesion como usuario.
8. Realizar consultas de saldo, debes tener sesion como usuario.
9. Realizar retiros, validar saldo y que tienes sesion de usuario. Cobrar una comision de retiro.
10. Realizar depositos a la cuenta
11. Guardar un historial  
*/
public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        int seleccion;
        System.out.println("Bienvenido a banco UTMA");
        System.out.println("Ya tiene una cuenta con nosotros?");
        System.out.println("1- Si");
        System.out.println("2- No");
        seleccion = validSelection();

        UserData credentials = getUserAndPassword();

        // Donde seleccione que si tenia cuenta
        // Login
       final boolean hasAccess = login(credentials);
       if (hasAccess) {
        // Enviar al Flujo del sistema segun su rol

       }
        // Continuar con el registrarse, selecciono que no tenia cuenta
        // Que tipo de usuario es?
        System.out.println("Eres administrador?");
        System.out.println("Ya tiene una cuenta con nosotros?");
        System.out.println("1- Si");
        System.out.println("2- No");
        seleccion = validSelection();
        while (seleccion == 1) {
            System.out.println("Ingresa tu codigo de admin");
            String code = input.next();
            if (!DataBase.isValidCode(code)) {
                System.out.println("Codigo invalido");
                System.out.println("Deseas reintentar?");
                System.out.println("1- Si");
                System.out.println("2- No");
                seleccion = validSelection();
            } else {
                
                while (true) {
                    
                
                try{
                    Administrador newAdmin = new Administrador(credentials.username() credentials.password());
                    DataBase.createUser(newAdmin);
                    System.out.println("Has sido registrado con exito, Bienvenido: " + newAdmin.name);
                    break;
                }catch(Exception e){
                    System.out.println(e.getMessage());
                credentials = getUserAndPassword();
                }
                break;
            }
            }
        }
        // Donde selecciono que no tenia cuenta
        // Registro

    }

    public static int validSelection() {
        int seleccion;
        while (true) {
            try {
                seleccion = input.nextInt();
                if (seleccion > 2 || seleccion < 1) {
                    throw new IllegalArgumentException("Solo se permiten dos opciones. 1 y 2");
                }
                break;
            } catch (Exception e) {
                String msgError = "Ocurrio un error inesperado";
                if (e instanceof IllegalArgumentException) {
                    msgError = e.getMessage();
                }
                if (e instanceof InputMismatchException) {
                    msgError = "Solo se permiten numeros en la entrada";
                }
                System.out.println(msgError);
                input.nextLine();
            }
        }
        return seleccion;
    }

    // Destructuracion
    public static UserData getUserAndPassword() {
        System.out.println("Ingresa tu usuario");
        String user = input.next();
        System.out.println("Ingresa tu contraseña");
        String password = input.next();

        UserData ud = new UserData(user, password);
        return ud;

    }


    public static boolean login(){
        boolean isLogged = false;
        while (true) {
         if (!isLogged) {
             isLogged = DataBase.login(credentials);
            if (!isLogged) {
                System.out.println("No se encontro usuario con los datos ingresados");
                System.out.println("Ingrese 1 para volver a intentarlo o 2 para registrarte.");
                seleccion = validSelection();
                if (seleccion ! = 1) {
                      break;               
                }
                    credentials = getUserAndPassword();
         }
            }
        }
    }

    public static boolean createAdministrator(){
        while (seleccion == 1) {
            System.out.println("Ingresa tu codigo de admin");
            String code = input.next();
            if (!DataBase.isValidCode(code)) {
                System.out.println("Codigo invalido");
                System.out.println("Deseas reintentar?");
                System.out.println("1- Si");
                System.out.println("2- No");
                seleccion = validSelection();
            } else {
                
                while (true) {
                    
                
                try{
                    Administrador newAdmin = new Administrador(credentials.username() credentials.password());
                    DataBase.createUser(newAdmin);
                    System.out.println("Has sido registrado con exito, Bienvenido: " + newAdmin.name);
                    break;
                }catch(Exception e){
                    System.out.println(e.getMessage());
                credentials = getUserAndPassword();
                }
                break;
            }
        }   
    }
   } 

   public static void  IntoSystem(User user){
    System.out.println("Usted tiene una cuenta de administrador, le dejamos las siguientes opciones: ");
    System.out.println("1. Ver usuarios disponibles");
    System.out.println("2. Eliminar usuarios");
    System.out.println("3. Ver el saldo de una cuenta externa");
    int seleccion = validSelection();
    switch (seleccion) {
        case 1:
            
            break;
    
        default:
            break;
    }
   }

}

