// EJERCICIO PROPUESTO 1

public class Usuario {
    private String username;
    private String password;


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password){
        if(password.length() > 6){
            this.password = password;
        } else {
            System.out.println("La contraseña es incorrecta");
        }
    }

    public String getUsername(){
        return username;
    }


}
