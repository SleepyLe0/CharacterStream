package bytestreams1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB5 {

    public static void main(String[] args) {
        Student s1 = new Student("1111111","John Wick");
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(s1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileInputStream file = new FileInputStream("data.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            Student s2 = (Student) input.readObject();
            System.out.println(s2.id);
            System.out.println(s2.name);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
