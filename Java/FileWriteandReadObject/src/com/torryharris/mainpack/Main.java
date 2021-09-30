package com.torryharris.mainpack;

import com.torryharris.spack.Student;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File f=new File("C:\\Users\\shreenidhi_bhadra\\Documents\\file3.txt");

        try(FileOutputStream op=new FileOutputStream(f);
            ObjectOutputStream out=new ObjectOutputStream(op);

            FileInputStream inp=new FileInputStream(f);
            ObjectInputStream in=new ObjectInputStream(inp)){

            Student s1=new Student(101,"Surabhi",93);
            out.writeObject(s1);

            Student s2=new Student(102,"Sumanth",85);
            out.writeObject(s2);


            while(inp.available()>0){
                Student ss=(Student) in.readObject();
                System.out.println(ss);
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
