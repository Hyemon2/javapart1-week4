package Tutorial_week13;

public class Fraction {
   private int numerator;
   private int denominator;

   public Fraction(int numerator, int denominator) {
      this.numerator = numerator;
      this.denominator = denominator;
   }

   public Fraction add(Fraction other) {
      int resultNumerator = this.numerator * other.denominator + this.denominator * other.numerator;
      int resultDenominator = this.denominator * other.denominator;
      return new Fraction(resultNumerator, resultDenominator);
   }

   public Fraction multiply(Fraction other) {
      int resultNumerator = this.numerator * other.numerator;
      int resultDenominator = this.denominator * other.denominator;
      return new Fraction(resultNumerator, resultDenominator);
   }

   public void simplify() {
      int gcd = gcd(numerator, denominator);
      numerator /= gcd;
      denominator /= gcd;
   }

   private int gcd(int a, int b) {
      if (b == 0) {
         return a;
      }
      return gcd(b, a % b);
   }

   public boolean equals(Object obj) {
	      if (this == obj) {
	         return true;
	      }
	      if (obj == null || getClass() != obj.getClass()) {
	         return false;
	      }
	      Fraction other = (Fraction) obj;
	      other.simplify();
	      simplify();
	      return numerator == other.numerator && denominator == other.denominator;
	   }

	   public String toString() {
	      return numerator + "/" + denominator;
	   }
}
