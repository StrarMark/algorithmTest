public class StaticDispatch {  
     static abstract class Human{ }  
     static class Man extends Human{}  
     static class Woman extends Human{}  
   
     public void sayHello(Human guy){  
        System.out.println("hello, guy!");  
     }  
     public void sayHello(Man guy){  
        System.out.println("hello, gentleman!");  
     }  
     public void sayHello(Woman guy){  
        System.out.println("hello, lady!");  
     }
     // 重载的本质是在编译期就会根据参数的静态类型来决定重载方法的版本，而重写的本质在运行期确定接收者的实际类型。
     public static void main(String[] args){  
         Human man = new Man();
         Human woman = new Woman();
         StaticDispatch sr = new StaticDispatch();  
         sr.sayHello(man);
         sr.sayHello(woman);  
     }  
}