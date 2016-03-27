/**
 * Created by Archer on 2016/3/27.
 * 继承抽象类和实现接口
 */
public class InterfaceDemo01 {
    public static void main(String[] args) {
        A a=new A();
        a.tell();
        a.print();
        a.print1();
        //全局常量要使用类名来调用
        System.out.println(Inter.AGE);
        System.out.println(Inter2.NAME);

    }
}

//接口的定义
//接口不能实例化，必须通过子类来实例化
//一个接口不能继承一个抽象类，但是可以通过extends来同时继承多个接口
interface  Inter {

    //定义全局常量
    public static final int AGE=100;

    public abstract void tell();


}


abstract  class Abs1{

    public abstract void print1();
}



interface Inter2{
    public static   final String NAME="aRcher";

    public abstract  void print();

}

class  A extends Abs1 implements Inter,Inter2{

    //必须复写方法
    @Override
    public void tell() {

    }

    @Override
    public void print() {

    }

    @Override
    public void print1() {

    }
}


interface  Inter3 extends Inter,Inter2{

}