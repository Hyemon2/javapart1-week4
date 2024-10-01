package Tutorial_week13;

import java.util.Scanner;

public class EX_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Student[] sts = new Student[number];

        for (int i = 0; i < number; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double score = sc.nextDouble();
            sts[i] = new Student(id, name, score);
        }

        Student highestStudent = findHighestStudent(sts);
        System.out.println("The best student is:");
        System.out.print("id: " + highestStudent.getId());
        System.out.print("name: " + highestStudent.getName());
        System.out.print("score: " + highestStudent.getScore());
    }

    public static Student findHighestStudent(Student[] students) {
        Student highestStudent = null;
        double highestScore = 0;

        for (Student student : students) {
            if (student.getScore() > highestScore) {
                highestStudent = student;
                highestScore = student.getScore();
            }
        }

        return highestStudent;
    }
}