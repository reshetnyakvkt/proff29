package quizful.testException.multiExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Reshetnyak Viktor on 04.01.2016.
 * Project prof29
 * Package quizful.testException.multiExceptions
 */
public class MainMultiException {
    public static void main(String[] args) {
        String fileName = "file";
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(fileName);
        }catch (FileNotFoundException ex){
            System.out.println("Oops, FileNotFoundException caught");
        }catch (IOException e) {
            System.out.println("IOEXCEOTION");
        }
    }
}
