package jp.alj;

public class VarKeyword {

	public static void main(String[] args) {
  
    var str = "Java 10"; // infers String
    var list = new ArrayList<String>(); // infers ArrayList<String>
    var stream = list.stream(); // infers Stream<String>s
		
	}

}
