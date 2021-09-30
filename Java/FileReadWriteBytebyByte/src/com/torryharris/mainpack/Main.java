package com.torryharris.mainpack;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File f1=new File("C:\\Users\\shreenidhi_bhadra\\Documents\\file1.txt");
        File f2=new File("C:\\Users\\shreenidhi_bhadra\\Music\\file2.txt");

        try(FileInputStream ip=new FileInputStream(f1);
            BufferedInputStream bis=new BufferedInputStream(ip);

            FileOutputStream op=new FileOutputStream(f2);
            BufferedOutputStream bos=new BufferedOutputStream(op)) {

            int c;
            while((c=bis.read())!=-1){
                bos.write(c);
                System.out.print((char)c);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
