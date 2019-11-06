package pkgnew;

import java.util.Scanner;

public class User {
    Scanner r = new Scanner(System.in);
    String e,p,i,u;
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
        System.out.println("Digíte um número de indentificação: ");
        i = r.nextLine();
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
        System.out.println("Insira seu endereço de Email: ");
        e = r.nextLine();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        System.out.println("Insira uma senha: ");
        p = r.nextLine();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Digíte seu nome de usuário: ");
        u = r.nextLine();
    }
 
}
