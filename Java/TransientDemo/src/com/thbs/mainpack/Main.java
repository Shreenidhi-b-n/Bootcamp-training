package com.thbs.mainpack;

import com.thbs.fpack.ReadObjectClass;
import com.thbs.fpack.WriteObjectClass;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WriteObjectClass wob = new WriteObjectClass();
        wob.writeObject();

        ReadObjectClass rob = new ReadObjectClass();
        rob.ReadObject();
    }
}
