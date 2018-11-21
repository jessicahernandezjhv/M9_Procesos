package Exemples;

import java.util.*;
import java.io.*;
 
class EX02_Notepad {
  public static void main(String[] args) {
	
	String file = "ip5.txt";
    Runtime rs = Runtime.getRuntime();
	
	try {
	  rs.exec("bash bash.sh " + file);
	  rs.exec("gedit " + file);
	}
	catch (IOException e) {
	  System.out.println(e);
	}
  }
}
