package com.thbs.fpack;

import com.thbs.spack.Student;

import java.io.*;

public class ReadObjectClass {
    public void ReadObject() {

        File file1 = new File("C:\\Users\\user112\\Documents\\file3.txt"); // destination file
        try (FileInputStream input = new FileInputStream(file1);
             ObjectInputStream in = new ObjectInputStream(input);) {
            System.out.println("Reading the objects from the file");
            while (input.available() > 0) {
                Student sob = (Student) in.readObject();
                sob.setTotal();
                System.out.println(sob);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
