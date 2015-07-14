package jplasmax10.visitor;

public class Pair implements Comparable{
	int ranking = -1;
	StringBuffer code = null;
	public StringBuffer getSetCode() {
		return code;
	}
	public void setSetCode(StringBuffer setCode) {
		this.code = setCode;
	}
	public Pair(int ranking, String myName) {
		this.ranking = ranking;
		this.myName = myName;
	}
	String myName = "";
	public Pair(String myName) {
		this.myName = myName;
	}
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public int compareTo(Pair c){
		if(c.ranking>this.ranking){
			return 0;
		}else{
			return 1;
		}
		
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Pair p = new Pair("");
		if(o instanceof Pair){
			p = (Pair)o;
		}else{
			return 0;
		}
		
		if(p.ranking>this.ranking){
			return 0;
		}else{
			return 1;
		}
		
	}
	public boolean equals(Object o){
		Pair p = null;
		if(o instanceof Pair){
			p = (Pair)o;
		}else{
			return false;
		}
		if(p.myName.equals(this.myName)){
			return true;
		}else{
			return false;
		}
	}
	
}
