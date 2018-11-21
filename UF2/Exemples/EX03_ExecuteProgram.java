package Exemples;

import java.util.*;
import java.io.*;
 
class EX03_ExecuteProgram {
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();
        String program = args[0];

        try {
            rs.exec(program);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
