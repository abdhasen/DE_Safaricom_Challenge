import java.io.IOException;
import java.util.*;
public class resource {

    try{
        // create FileOutPutstream object
        FileOutputStream fos = new FileOutputStream();
        // message to be written
        String str = "Welcome to Safaricom";

        byte bArray[] = str.getBytes();
        try {
            fos.write(bArray);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("message is written to a file");
        try {
            fos.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
