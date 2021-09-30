package com.torryharris.mainpack;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File f=new File("C:\\Users\\shreenidhi_bhadra\\Documents\\file1.txt");
        try(FileReader fr=new FileReader(f);
            BufferedReader br=new BufferedReader(fr)) {
            String s=br.readLine();
            while(!s.equals("End")){
                System.out.println(s);
                s=br.readLine();
            }

            System.out.println();
            String ss;

            while((ss=br.readLine())!=null)
                System.out.println(ss);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
