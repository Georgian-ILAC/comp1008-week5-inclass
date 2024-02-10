
// Fig. 15.6: ReadTextFile.java
// This program reads a text file and displays each record.
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadingTextFile {
      public static void main(String[] args) {
         // open clients.txt, read its contents and close the file
         try(Scanner input = new Scanner(Paths.get("clients.txt"))) {
            System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
               "First Name", "Last Name", "Balance");


           //%s  %-10s
           //1000 1000______Taran

            // read record from file
            while (input.hasNext()) { // while there is more to read
               // display record contents 
               System.out.printf("%-10s%-12s%-12s%10s%n", input.next(),
                  input.next(), input.next(), input.next());
            }
         }
         catch (IOException | NoSuchElementException |
            IllegalStateException e) {
            e.printStackTrace();
         }
      }
   }