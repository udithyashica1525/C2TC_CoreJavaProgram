package day4;

public class ExecutorJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b1 = new Base();

		// private, default and protected members can't access

		/*
		 * b1.varPrivate=21; b1.methodPrivate(); b1.varDefault=11; b1.methodDefault();
		 * b1.varProtected=31; b1.methodProtected();
		 */

		b1.methodPublic();
		b1.varPublic = 41;
		b1.methodPublic();
	}

}
