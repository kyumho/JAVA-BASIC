package class1;

// int, String과 같이 사용자 정의 타입을 만든다고 생각하면 됨.
// 이 설계도가 클래스
// 설계도인 클래스를 사용하여 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 함.

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);
    }
}
