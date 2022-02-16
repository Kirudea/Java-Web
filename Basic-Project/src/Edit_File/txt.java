package Edit_File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class txt {
    public static void main(String[] args) throws IOException {
        
        File f1 = new File("C:\\Users\\kildere.maravilha\\Desktop\\Curso-Java-Web\\Basic-Project\\src\\Edit_File\\arq.txt");

        if(!f1.exists()){
            f1.createNewFile();
        }

        FileWriter writer = new FileWriter(f1);
        writer.write("Hello World1!\n");
        writer.append("Hello Isekai!");
        writer.flush();
        writer.close();

    }
}
