package Tutorial_week14;

public class StudentList {
    private Student[] sts;
    private int number;

    public StudentList() {
        number = 0;
        sts = new Student[100];
    }

    public StudentList(int n) {
        number = 0;
        sts = new Student[n];
    }

    public void append(Student student) {
        if (number < sts.length) {
            sts[number] = student;
            number++;
        } else {
            System.out.println("Student list is full. Cannot append more students.");
        }
    }

    public void print() {
        for (int i = 0; i < number; i++) {
            System.out.println(sts[i]);
        }
    }

    public Student studentAt(int index) {
        if (index >= 0 && index < number) {
            return sts[index];
        } else {
            return null;
        }
    }

    public Student searchById(int id) {
        for (int i = 0; i < number; i++) {
            if (sts[i].getid() == id) {
                return sts[i];
            }
        }
        return null;
    }

    public void sortById() {
        for (int i = 0; i < number - 1; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                if (sts[j].getid() > sts[j + 1].getid()) {
                    Student temp = sts[j];
                    sts[j] = sts[j + 1];
                    sts[j + 1] = temp;
                }
            }
        }
    }

    public void reverse() {
        for (int i = 0; i < number / 2; i++) {
            Student temp = sts[i];
            sts[i] = sts[number - i - 1];
            sts[number - i - 1] = temp;
        }
    }

    public void sortByScore() {
        for (int i = 0; i < number - 1; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                if (sts[j].getScore() > sts[j + 1].getScore()) {
                    Student temp = sts[j];
                    sts[j] = sts[j + 1];
                    sts[j + 1] = temp;
                }
            }
        }
    }

    public double average() {
        if (number == 0) {
            System.out.println("Student list is empty. Cannot calculate average.");
            return 0.0;
        } else {
            int sum = 0;
            for (int i = 0; i < number; i++) {
                sum += sts[i].getScore();
            }
            double average = (double) sum / number;
            System.out.println("Average score: " + average);
            return average;
        }
    }
}