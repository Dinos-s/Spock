package pkgnew;



public class User {
    private int IP;//ENDEREÇO DE IP\\
    private String Email;//ENDEREÇO DE EMAIL \\
    private String password;//CRIA A SENHA\\
    private String name;//NOME DO USUÁRIO\\
    //-----------METODOS PRINCIPAIS------------\\
       
        //System.out.println("Insira seu endereço de IP: "+ this.IP);
         
    
    //-----------METODOS ESPECAIS---------------\\

    public int getIP() {
        return IP;
    }

    public void setIP(int IP) {
        this.IP = IP;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
}
