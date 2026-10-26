package SistemaBancario;

public class User {
    String name;
    private String password;
    private int id;

    User(String name, String password){
        //el nombre no debe estar vacio
        // no se debe repetir en el sistema
        //Validar que no tiene caracteres especiales
        name = name.toLowerCase();
        if (name.length() < 3) {
            throw new  IllegalArgumentException("para crear una cuenta, debes mandar un nombre al menos 3 caracteres");

        }
    

     for(User u : DataBase.getAllUsers()){
        if (name == u.name) {
            throw new IllegalArgumentException("el nombre  de usuario ya esta en uso");
        }

     }
     String validate = "/[a-z]/";
     if (!name.matches(validate)) throw new IllegalArgumentException("no se permiten otros caracteres mas que letras");
     String regexPwd = "^(?=.[a-z])(?=.[A-Z])(?=.\\\\d)(?=.[@$!%?&])[A-Za-z\\\\d@$!%?&]{8,}$";
     if(!password.matches(regexPwd)) throw new IllegalArgumentException("la contraseña  no cumple con los requeriemientos basicos: \nMinimo 8 caracteres \nUna minuscula \nUna mayuscula \nUn caracter especial de las siguientes opciones: @$!%*?& \nUn numero");

     this.name = name;
     this.password = password;
     this.id = DataBase.getConsecutive();



    }

    public int getId(){
        return this.id;
    }
}