package model;

import java.io.*;

/**
 *
 * @author abdel
 */
public class FileInteract {

    public static void writeToFile(String id, String name, String salary) {
        try {
            FileWriter fw = new FileWriter("F:\\Courses\\Java\\Course Java EE\\file.txt");
            BufferedWriter bfw = new BufferedWriter(fw);
            bfw.write(id);
            bfw.newLine();
            bfw.write(name);
            bfw.newLine();
            bfw.write(salary);

            System.out.println("Don't Worry file Working ...");
            bfw.close();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}
