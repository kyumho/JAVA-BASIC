package class1;

// 제거할 때 인덱스에 맞게 삭제해줘야함 (안전성이 떨어짐)

public class ClassStart2 {

    public static void main(String[] args) {

        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + " 나이 : " + studentAges[i] + " 성적 : " + studentGrades[i]);
        }
    }
}
