package exception_handling;

import java.io.FileInputStream;

public class Lab26_Checked {
    public static void main(String[] args){

        // Checked --> JVM
        // JVM knows about it, During Compilation --> JVM is saying that there
        // can be a case when this file is not found

       // FileInputStream fileInputStream = new FileInputStream("C//log.txt");

        // java: unreported exception java.io.FileNotFoundException;
    }
}
