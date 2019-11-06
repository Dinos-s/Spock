package pkgnew;
import java.util.ArrayList;
public class New { 
   public static void main(String[] args) {
       ArrayList<User>os = new ArrayList<>();
       User v = new User();
      // User x = new User();
       
       Album M =new Album();
       M.setName("");
       M.setGenero("");
       M.setArtista("");
       M.status();
       
       v.setEmail("");
       v.setIP(0);
       v.setName("");
       v.setPassword("");
       
       os.add(v);
       
       for(int y=0; y<os.size(); y++){
           System.out.println(os.get(y).getEmail());
           System.out.println(os.get(y).getIP());
           System.out.println(os.get(y).getName());
           System.out.println(os.get(y).getPassword());
       }
       
    }   
}
