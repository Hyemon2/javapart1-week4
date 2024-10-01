package Tutorial_week14;

public class Student {
    private int id;
    private String name;
    private int score;
    
    public Student(int i, String n, int sc) {
        id = i;
        name = n;
        score = sc;        
    }
    
    public int getid() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getScore() {
        return score;
    }
    
    public void changeScore(int sc) {
        score = sc;
    }
    
    public void println() {
        System.out.println("Id: " + id + ", Name: " + name + ", Score: " + score);
    }
    
    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Score: " + score;
    }
}