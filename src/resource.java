public class Resource {

    try{
        FileOutputStream fos = new FileOutputStream();
        String str = "Welcome to Safaricom";
        byte bArray[] = str.getBytes();
        fos.write(bArray);
        System.out.println("message is written to a file");
    }
    catch(Exception e)

    {
        System.out.println(e);
    }
}
}
