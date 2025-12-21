package com.programm.test;

import java.util.Scanner;
public class array {
   static void main(){
      String s1 = "I love";
      s1 += " Java";
      s1.intern();
      String s2 = "I love Java";
      s2.intern();
      if (s1 != s2)
         System.out.println(s1 + " = " + s2);
      else
         System.out.println("a");
   }
}
