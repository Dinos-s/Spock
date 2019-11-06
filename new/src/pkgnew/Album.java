package pkgnew;
import java.util.Scanner;
public class Album {
    Scanner s = new Scanner(System.in);
    String n, g, a;
    public String Name;//TÍTULO DA MÚSICA\\
    private String Genero;
    private String Artista;
    //-----------METODOS PRINCIPAIS------------\\
    public void status() {
        System.out.println("Ecreva o nome da Música: "+ this.Name);
        n = s.nextLine();
        System.out.println("Ecreva o tipo de Genêro Musical: "+ this.Genero);
        g = s.nextLine();
        System.out.println("Ecreva o(s) nome(s) dos Artista/Grupo: "+ this.Artista);
        a = s.nextLine();   
}
 //-----------METODOS ESPECAIS---------------\\
    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }
   
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
}
