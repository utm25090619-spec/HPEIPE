package SistemaBancario;
import java.util.ArrayList;

public class DataBase {
    private static ArrayList<User> db = new ArrayList<User>();

    //crud
    public static void  createUser(User u){
        db.add(u);
    }

    public static ArrayList<User> getAllUsers(){
        return  db;
    }

    public static  User getUser(int id){
        return db.get(id - 1);
    }

    public static boolean deleteUser(int id){
        db.remove(id - 1);
        return true;
    }

    public  static int getConsecutive(){
        // db.size() -> 1
        User lastUser = db.getLast();
        return lastUser.getId() + 1;
    }

    public static boolean isValidation(String code){
        return  isValidation(code);
    }

    public static boolean login(String username, String pwd) {
        boolean userExist = false;
        for(User localUser : db){
            if (localUser.nombre == username && localUser.compare(pwd)) {
                userExist = true;
                break;
            }
        }
        return  userExist;
    }
}
