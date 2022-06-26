package cricket;
import java.io.*;

public class Cricket {
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException, InvalidCountException, InvalidTeamName {
        File f;
        f = new File("Ipl.txt");
        BufferedReader in = new BufferedReader(new FileReader(f));
        String name;
        int mp,w,l;
        Ipl[] obj = new Ipl[5];
        String Str;
        String [] str;
        str = new String[4];
        for(int i=0;i<5;i++){
            Str = in.readLine();
            str = Str.split(",");
            name = str[0];
            mp = Integer.parseInt(str[1]);
            w = Integer.parseInt(str[2]);
            l = Integer.parseInt(str[3]);
            obj[i]= new Ipl(name,mp,w,l);
        }
        for(int i=0;i<5;i++){
            obj[i].display();
        }
    }
    
}
