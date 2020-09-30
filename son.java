package week13;

public class son implements father,mather,windows{

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println("Mather make tun yam kung");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Father eating");
	}
	public static void main(String[]args) {
		son st = new son();
		st.cook();
		st.eat();
		st.student();
	}

	@Override
	public void student() {
		// TODO Auto-generated method stub
		System.out.println("BEnz");
	}
}