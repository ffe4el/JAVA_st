package abstract_ex;

public class Test {
	public static void main(String arg[]) {
        Shape s1, s2;
        Rectangle r1, r2;
        s1 = new Shape();
        s2 = new Rectangle(); // OK
//        r1 = new Shape(); // 에러! => 부모클래스의 참조변수로 자식 클래스의객체를 참조할 수 잇음
        r2 = new Rectangle();
    }
}
