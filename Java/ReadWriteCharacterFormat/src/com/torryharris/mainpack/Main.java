package com.torryharris.mainpack;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File f=new File("C:\\Users\\shreenidhi_bhadra\\Documents\\file1.txt");
        File f1=new File("C:\\Users\\shreenidhi_bhadra\\Music\\file2.txt");

        try(FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr);
            FileWriter fw=new FileWriter(f1);
            BufferedWriter bw=new BufferedWriter(fw)) {

            String ss;
            while((ss=br.readLine())!=null){
                System.out.println(ss);
                bw.write(ss);
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
