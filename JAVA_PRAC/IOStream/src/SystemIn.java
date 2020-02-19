import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemIn {
    public static void main(String [] args){



        System.out.println("Stydysdlfj");

        //Read bytes

        try{
            int i;
            InputStreamReader isr= new InputStreamReader(System.in);// sub Stream let reader
            while ((i = isr.read())!='x') {
                System.out.println(i);
                System.out.println((char) i);

            }
        }catch (IOException e){

            e.printStackTrace();
        }


    }

}
