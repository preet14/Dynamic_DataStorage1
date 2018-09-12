import java.util.Scanner;
import java.io.*;
public class Q1 {

    public static void main(String[] args) {
        File f = new File("C:/Users/user/Desktop/Assignment/File_Handling/data.txt");
        try
        {
           FileOutputStream fout = new FileOutputStream(f);
            String s = "C:/Users/user/Desktop/Assignment/File_Handling/data.txt";
            
            char ch[] = s.toCharArray();
           for(int i=0;i<s.length();i++)
           {
                fout.write(ch[i]);
           }
            
           fout.write(' ');
            FileInputStream fin = new FileInputStream(f);
            //s = "C:/Users/user/Desktop/Assignment/File_Handling/data1.txt";
            int i;
            
            i=fin.read();
            
            while(i!=-1)
            {
                System.out.print((char)i);
                i=fin.read();
            }
             
            fin.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
}
