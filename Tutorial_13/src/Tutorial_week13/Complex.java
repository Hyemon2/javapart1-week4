package Tutorial_week13;

public class Complex {
   private double real;
   private double imaginary;

   public Complex(double real, double imaginary) {
      this.real = real;
      this.imaginary = imaginary;
   }

   public Complex add(Complex other) {
      double realSum = this.real + other.real;
      double imaginarySum = this.imaginary + other.imaginary;
      return new Complex(realSum, imaginarySum);
   }

   public Complex multiply(Complex other) {
	   double realProduct = this.real * other.real - this.imaginary * other.imaginary;
	   double imaginaryProduct = this.real * other.imaginary + this.imaginary * other.real;
	   return new Complex(realProduct, imaginaryProduct);
	}
   
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null || getClass() != obj.getClass()) {
         return false;
      }
      Complex other = (Complex) obj;
      return Double.compare(other.real, real) == 0 && Double.compare(other.imaginary, imaginary) == 0;
   }

   public String toString() {
      return real + (imaginary >= 0 ? " + " : " - ") + Math.abs(imaginary) + "i";
   }
}
