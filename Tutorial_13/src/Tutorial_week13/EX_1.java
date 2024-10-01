package Tutorial_week13;
public class EX_1 {
   public static void main(String[] args) {
         Box b = new Box(20,20,30);
         System.out.println("volume of the box is "+b.getVolume());
      
         Box b1=new Box(10,20,40);
         System.out.println("volume of th box is "+b1.getVolume());
         
         Box b2 = new Box(10,30,40);
         System.out.println("volume of the box is "+b2.getVolume());
         if(b.larger(b1)) {
            System.out.println(b+"is larger than"+b1);
         } else {
            System.out.println(b+"is not larger than"+b1);            
         }
         if(b.larger(b2)) {
            System.out.println(b+"is larger than"+b2);
         } else {
            System.out.println(b+"is not larger than"+b2);            
         }
         if(b.sameSize(b1)) {
            System.out.println(b+"is the same size as "+b1);
         } else {
            System.out.println(b+"is the same size as "+b1);            
         }
         if(b.sameSize(b2)) {
            System.out.println(b+"is the same size as "+b2);
         } else {
            System.out.println(b+"is the same size as "+b2);            
         }
      }
   }



