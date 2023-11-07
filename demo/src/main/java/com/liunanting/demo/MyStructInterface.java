package com.liunanting.demo;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Structure;

public interface MyStructInterface extends Library {

    MyStructInterface MY_STRUCT = Native.load("Your-path/dll/Bridge.dll", MyStructInterface.class);

    // Define the structure to map the C/C++ MyStruct
    public static class MyStruct extends Structure {
        public int Type;
        public int Count;
        public int ClearNeeded;
    }

    MyStruct getMyStruct();

    public static void main(String[] args) {
        // Call the C/C++ function to get the MyStruct object
        MyStruct myStruct = MY_STRUCT.getMyStruct();

        // Access the members of the MyStruct
        System.out.println("Type: " + myStruct.Type);
        System.out.println("Count: " + myStruct.Count);
        System.out.println("ClearNeeded: " + myStruct.ClearNeeded);
        System.out.println("ok");
    }
}
