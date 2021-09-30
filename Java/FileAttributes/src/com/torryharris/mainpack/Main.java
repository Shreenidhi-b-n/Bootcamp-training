package com.torryharris.mainpack;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File f1=new File("C:\\Users\\shreenidhi_bhadra\\Desktop\\file1.txt");
        try {
            f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getName());
        System.out.println(f1.getParent());

        System.out.println("\n---------------------------------------\n");
        File dir=new File("C:\\Users\\shreenidhi_bhadra\\Documents");
        File[] list=dir.listFiles();

        System.out.println("-----------All the directories of Document folder-----------");
        for(File f:list){
            if(f.isDirectory())
                System.out.println(f.getName());
        }

        System.out.println("\n-----------All the files of Document folder-----------");
        for(File f:list){
            if(f.isFile())
                System.out.println(f.getName());
        }



    }
}
