import java.io.*;
import java.util.*;
 
public class Stack { 
  static final int Max = 1000;
  int top = -1;
  int[] a = new int[Max];
  
  Stack() {
    top = -1;
  }
  
  boolean isEmpty() {
    return (top < 0);
  }
  
  boolean push(int x) {
    if (top >= (Max - 1)) {
      System.out.println("Stack Overflow");
      return false;
    }
    else {
      a[++top] = x;
      System.out.println(String.valueOf(x) + " Pushed into stack");
      return true;
    }
  }
  int pop() {
    if (top < 0) {
      System.out.println("Stack Underflow");
      return 0;
    }
    else {
      int x = a[top];
      System.out.println(String.valueOf(x) + " item pop");
      return x;
    }
  }
  void print() {
    for(int i = top; i > -1; i--) {
      System.out.println(" " + String.valueOf(a[i]));
    }
  }

public static void main(String[] args) {
  Stack push1 = new Stack();
  push1.push(6);
  
  push1.pop();
}
  }



