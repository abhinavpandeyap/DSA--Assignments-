package Q4;

public class DstackTeaster {

	public static void main(String[] args) {
		Dstack dstack=new Dstack(10);
		dstack.pushTop1(15);
		dstack.pushTop1(21);
		dstack.pushTop1(20);
		dstack.pushTop1(18);
		dstack.display();
		dstack.pushTop2(15);
		dstack.pushTop2(21);
		dstack.pushTop2(20);
		dstack.pushTop2(18);
		dstack.display();

	}

}
