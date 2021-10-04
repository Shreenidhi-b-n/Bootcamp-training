package com.thbs.fpack;

import com.thbs.spack.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class WriteObjectClass {

    public void writeObject(){
        File f=new File("C:\\Users\\user112\\Documents\\file3.txt");

        try (FileOutputStream output = new FileOutputStream(f);
             ObjectOutputStream out = new ObjectOutputStream(output);)
        {
            ArrayList<Student> slist = new ArrayList<Student>();
            slist.add(new Student(1,80,80,80));
            slist.add(new Student(2,80,80,80));
            slist.add(new Student(3,80,80,80));
            Iterator<Student> it = slist.iterator();
            System.out.println("Writing the objects into the file");
            while(it.hasNext())
            {
                Student s = it.next();
                s.setTotal();
                System.out.println(s);
                out.writeObject(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
