package grammar;
//创建方法
class Person {
    String name;
    int age;
    public void speak () {
        System.out.println("我是一个好人");
    }
}

public class Method {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.speak();
    }
}
