package c5_2;

// Person 클래스
class Person {
    private int weight; // private 멤버
    int age;            // default 멤버
    protected int height; // protected 멤버
    public String name;   // public 멤버

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

// Student 클래스 (Person 상속)
class Student extends Person {
    public void set() {
        age = 30;         // default 멤버 접근 가능 (동일 패키지)
        name = "홍길동";    // public 멤버 접근 가능
        height = 175;     // protected 멤버 접근 가능
        // weight = 99;   // 오류! 슈퍼 클래스의 private 멤버 접근 불가
        setWeight(99);    // public 메소드를 통해 private 멤버에 간접 접근
    }
}

public class InheritanceEx {
    public static void main(String[] args) {
        Student s = new Student();
        s.set();
        // s.set() 메소드가 성공적으로 호출되면, 별도의 출력 없이 프로그램이 정상 종료됩니다.
        System.out.println("Student 객체의 정보 설정이 완료되었습니다.");
        System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 키: " + s.height + ", 몸무게: " + s.getWeight());
    }
}

// Student 객체의 정보 설정이 완료되었습니다.
// 이름: 홍길동, 나이: 30, 키: 175, 몸무게: 99