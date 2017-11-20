package controldata;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.*;
import java.util.stream.Collectors;


public class controlData {
    public static void main(String[] args) throws IOException{

        try {
            StringBuilder sb = new StringBuilder();
 
            try {
                BufferedReader in = new BufferedReader(new FileReader("data.txt"));
                try {
                    String s;
                    while ((s = in.readLine()) != null) {
                        sb.append(s);
                    }
                } finally {
                    in.close();
                }
            } catch(IOException e) {
                throw new RuntimeException(e);
            }
            String str = sb.toString();            
//            Numbers processing
            String[] arr = str.split(",");
            // Sorted data
            int [] array1 = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(array1);
            System.out.println(Arrays.toString(array1));
            // Sorted data by desc
            List<Integer> arrayList  = Arrays.stream( array1 ).boxed().collect( Collectors.toList() );
            Collections.reverse(arrayList);
            System.out.println(arrayList);
           
        }
        catch (Exception e) {
            System.out.println("Файл не найден");
            System.exit(0);
        }       
    }
    
}
