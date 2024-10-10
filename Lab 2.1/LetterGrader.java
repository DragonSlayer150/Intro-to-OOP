public class LetterGrader {
    public static void main(String[] args) {
        int grade = 50;
        char letterGrade = ' ';

        if (grade < 65) {
            letterGrade = 'F';
        } else if (grade < 70) {
            letterGrade = 'D';
        } else if (grade < 80) {
            letterGrade = 'C';
        } else if (grade < 90) {
            letterGrade = 'B';
        } else if (grade <= 100) {
            letterGrade = 'A';
        }

        System.out.printf("The grade %d is equal to letter %c", grade, letterGrade);
    }
}
