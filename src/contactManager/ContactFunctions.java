package contactManager;

import utils.Input;

import java.nio.file.Files;
import java.nio.file.Path;

public class ContactFunctions {

    public static void fileExist(Path p){
        Input input = new Input();
        try{
            if(Files.exists(p)){
                System.out.println("File Exist");
            }else{
                System.out.println("The file does not exist.\n");
                boolean createFile = input.yesNo("Would you like to create it(y/n):");
                if(createFile){
                    Files.createFile(p);
                }
            }
        }catch(Exception e) {
            System.out.println("Function failed to load file. Check exception.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}