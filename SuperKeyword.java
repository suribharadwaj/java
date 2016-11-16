package com.bharadwaj.SLT.Programs;

class Parentclass
{
   int num=100;
}
//Child class or subclass
class SuperKeyword extends Parentclass
{
   int num=110;
   void printNumber()
   {
      //Super.variable_name
      System.out.println(super.num);
   }
   public static void main(String args[])
   { 
      SuperKeyword obj= new SuperKeyword();
      obj.printNumber();	
   }
}
