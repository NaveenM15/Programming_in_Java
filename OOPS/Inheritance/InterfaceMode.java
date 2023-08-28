
//INTERFACE IS DEFAULT OF
//   * PUBLIC AND ABSTRACT WHILE CREATING A METHOD
//   * FINAL STATIC WHILE DECLARING A VARIABLE
//   * WE ARE NOT ALLOWED TO USE BODY IN ABSTRACT METHOD
//   * INORDER TO USE BODY WE CAN USE STATIC KEYWORD.

interface Variable{
    int a=10;
    public abstract void fun1();
    public abstract  void fun2();
    public static void fun3(){
         System.out.println("I am fun3");
    }

}

public class InterfaceMode {
    public static void main(String[] args){
       System.out.println("A : "+Variable.a);
//       System.out.println("Function 3 : "+Variable.fun3());
        Variable.fun3();
    }
}
