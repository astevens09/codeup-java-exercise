import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIOTest {

    public static void main(String[] args) {
        String strDirectory = "Data";
        Path dataDirectory = Paths.get(strDirectory);

        try {
            if(Files.exists(dataDirectory)){
                System.out.println("Path Exist!");
            }else{
               Path newDirectory = Files.createDirectory(dataDirectory);
                System.out.println("New Directory created at: "+newDirectory.toString());
            }

//            if(Files.exists(upperDataDirectory))
//                System.out.println("Upper Data Path Exist!");
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }




//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(13);
//        numbers.add(new Integer(8)); // Line 7
//        numbers.add(3.6); // Line 8
//        for (Integer number: numbers) System.out.println(number);

    }
}