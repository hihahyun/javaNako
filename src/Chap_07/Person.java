package Chap_07;
/* 위 클래스는 Person이라는 객체를 나타내는 클래스입니다. name과 age 라는 인스턴스 변수를 가지며,
    sayHello() 라는 인스턴스 메소드와 sayHelloToAll() 이라는 static 메소드를 갖습니다.
    sayHello() 메소드는 Person 객체가 가지고 있는 name 변수를 이용하여 "안녕하세요, 제 이름은 [name]입니다." 라는 문자열을 출력하는 역할을 합니다.
    이 메소드는 Person 클래스의 인스턴스가 생성된 후 호출할 수 있습니다.
*/
public class Person {
    private String name;
    private int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 인스턴스 메소드
    public void sayHello() {
        System.out.println("안녕하세요, 제 이름은 " + name + "입니다.");
    }

    // static 메소드
    public static void sayHelloToAll() {
        System.out.println("안녕하세요, 모두!");
    }

    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.sayHello(); // "안녕하세요, 제 이름은 John입니다." 출력

        Person.sayHelloToAll(); // "안녕하세요, 모두!" 출력

    }
}


