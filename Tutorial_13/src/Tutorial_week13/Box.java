package Tutorial_week13;

class Box {
	   private int length;
	   private int width;
	   private int height;
	   
	   public Box(int length, int width, int height) {
	      this.length = length;
	      this.width = width;
	      this.height = height;
	   }
	   
	   public int getVolume() {
	      return length * width * height;
	   }
	   
	   public boolean larger(Box otherBox) {
	      return getVolume() > otherBox.getVolume();
	   }
	   
	   public boolean sameSize(Box otherBox) {
	      return getVolume() == otherBox.getVolume();
	   }
	   

	   public String toString() {
	      return "Box(" + length + ", " + width + ", " + height + ")";
	   }
	}