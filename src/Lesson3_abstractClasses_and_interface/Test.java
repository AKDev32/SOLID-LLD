package Lesson3_abstractClasses_and_interface;

interface A {
// public void doSomething ();
 default void doSomething () {
  System.out.println("This is default and using default keyword we can write the method");
 }

 }
interface B {
// public void doSomething ();
 default void doSomething () {
  System.out.println("This is also default");
 }
}

class C implements A, B {
 @Override
 public void doSomething() {
//  System.out.println("Aman Kumar");
  B.super.doSomething();
 }

//    Give the compiler issue

}

public class Test {
 public static void main(String[] args) {

 }
}
