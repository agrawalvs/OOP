package cricket;
import java.io.*;

public class Cricket {
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f;
        f = new File("C:\\Users\\USER\\Documents\\Ipl.txt");
        BufferedReader in = new BufferedReader(new FileReader(f));
        String name;
        int mp,w,l;
        Ipl[] obj = new Ipl[2];
        for(int i=0;i<2;i++){
            name = in.readLine();
            mp = Integer.parseInt(in.readLine());
            w = Integer.parseInt(in.readLine());
            l = Integer.parseInt(in.readLine());
            obj[i]= new Ipl(name,mp,w,l);
        }
        
    }
    
}
