package Tutorial_week12;

public class EX_1 {
	public static void main(String[] args) {
		Ars oA = new Ars();
		System.out.println(oA.add(1,20));
		System.out.println(oA.add(1,20,30));
		System.out.println(oA.add("안녕하세요","서혜원 입니다."));
		System.out.println(oA.add("안녕하세요",", 자바를 듣는","서혜원입니다."));
	}
}
