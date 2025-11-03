package methodsandvariables;

public class StringAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringAssignment s1 = new StringAssignment();
		
		int count = s1.numOfChar("banana", 'a');
		
		System.out.println(count);
	

	}
	
	public int numOfChar(String str, char c) {
		// str = banana
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
	

}
