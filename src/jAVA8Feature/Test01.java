package jAVA8Feature;

import java.util.function.Predicate;

@FunctionalInterface
interface Sam//(sam=single abstract method)it is functional interface
{
  void test();// in functional interface only one abstract method but we can take multiple default method and static method
               //because of using @FunctionalInterface

  default void add() // because of backward compatibility
              //if we add static or default method in interface then backward compatibility works
          //there is no change previous features
  {
      System.out.println("it is default method:");
  }
static void sub()
{
    System.out.println("it is static method:");
}
}
public class Test01
{
    public static void main(String[] args) {
        test02 ref=new test02();
        test03 ref1=new test03();
        test04 ref2=new test04();
        test05 ref3=new test05();
        test06 ref4=new test06();
        ref1.test();
        ref.add();
        Sam.sub();
        ref2.test();
        ref3.test();
        ref4.test();
        ref.test();

    }

    }
class test02 implements Sam
{
    @Override
    public void test() {
        System.out.println("it is first implemented class:");
    }
}
class test03 implements Sam
{
    @Override
    public void test() {
        System.out.println("it is second implemented class:");
    }
}
class test04 implements Sam
{


    @Override
    public void test() {
        System.out.println("it is third implemented class:");
    }
}
class test05 implements Sam
{
    @Override
    public void test() {
        System.out.println("it is fourth implemented class:");
    }
}
class test06 implements Sam
{
    @Override
    public void test() {
        System.out.println("it is fifth implemented class:");
    }


    }

