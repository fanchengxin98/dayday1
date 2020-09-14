package ch02_2;

public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person("小红", 22, false, null);
        Person p2 = new Person("小米",25,true,null);
        p1.marry(p2);
    }
}


