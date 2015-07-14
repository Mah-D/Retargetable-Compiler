package util.types;

public class X10DummyStrArray extends X10Type {
	public X10DummyStrArray() {
		super("String[]");
	}
	public boolean equals(Object o)
	{
		if(o instanceof X10DummyStrArray)return true;
		return false;
	}
}