package Tutorial_week13;

public class EX_3 {
	   public static void main(String[] args) {
		      // TODO Auto-generated method stub
		      Fraction f1 = new Fraction(1,2);
		      Fraction f2 = new Fraction(3,4);
		      Fraction r1 = f1.add(f2);
		      Fraction r2 = f1.multiply(f2);
		      
		      System.out.println(f1);
		      System.out.println(f2);
		      System.out.println(r1);
		      System.out.println(r2);
		      r1.simplify();
		      System.out.println(r1);
		      
		      Fraction d1 = new Fraction(2,4);
		      System.out.println(f1.equals(d1));
		      System.out.println(f2.equals(d1));
		      
		   }

		}

