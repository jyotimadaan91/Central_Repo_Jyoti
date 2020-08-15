
import java.io.*;

public class Main
{
   public static void main(String[] args) throws Exception
   {
	   System.out.println("Main 1");
      try
      {
    	  System.out.println("Main 2");
         File file = new File("/users/Jyoti Madaan/Desktop/NameOrientation.txt");
         System.out.println(file);
        // FileReader fileReader = new FileReader(file);
         System.out.println("Main 4");
         BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        // BufferedReader bufferedReader = new BufferedReader(fileReader);
         System.out.println("Main 5");
         String line;
         System.out.println("Main 7");
         while ((line = br.readLine()) != null)
         {
        	 System.out.println("Main 8");
       if (line.length() > 80){
          System.out.println("  Line is more than 80 characters and can not be processed: " + line);
     }
       System.out.println("Main 9");
         }
         System.out.println("Main 10");
       //  FileReader.close();
      }
      catch (IOException e)
      {

      }
   }
}

