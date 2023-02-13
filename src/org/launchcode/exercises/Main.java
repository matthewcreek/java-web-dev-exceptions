package org.launchcode.exercises;

import org.launchcode.Temperature.TemperatureException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
//        Divide(50,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        System.out.println(studentFiles);
        System.out.println(studentFiles.entrySet());
        System.out.println(studentFiles.keySet());
        for (String student: studentFiles.keySet()) {
            System.out.println(student + ": " + studentFiles.get(student));
            System.out.println(CheckFileExtension(studentFiles.get(student)));
        }
    }

    public static void Divide(int x, int y) {
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by zero!");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } else System.out.println(x/y);
    }

    public static int CheckFileExtension(String fileName)
    {
        if (fileName.contains(".java")){
            return 1;
        } else if (fileName.isEmpty() || fileName == null) {
            try {
                throw new FileExtensionException("Extension not found!");
            } catch (FileExtensionException e) {
                System.out.println(e.getMessage());
            }
            return -1;
        } else return 0;
    }
}
