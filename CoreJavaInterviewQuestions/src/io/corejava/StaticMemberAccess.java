package io.corejava;

abstract class AA {
	protected abstract int getK();
}

class BB extends AA {
	public static int CHILD_K = 10;

	@Override
	protected int getK() {
		return CHILD_K;
	}

}

public class StaticMemberAccess extends BB {
	
	static {
		System.out.println(CHILD_K);
		CHILD_K = 20;
		System.out.println(CHILD_K);
	}

	{
		CHILD_K = 50;
		System.out.println(CHILD_K);
	}

	@Override
	protected int getK() {
		CHILD_K = 30;
		return CHILD_K;
	}

	public static void main(String[] args) {
		System.out.println(StaticMemberAccess.CHILD_K);
		System.out.println(new StaticMemberAccess().getK());
	}

}
