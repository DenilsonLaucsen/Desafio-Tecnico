package questao04;

public class Teste {
    
    public static void main(String[] args) {
		System.out.println(processar(null));
		System.out.println(processar("ab"));
		System.out.println(processar("abc"));
		System.out.println(processar("abcd"));
		System.out.println(processar("abcdefg"));

	}

	public static String processar(String s) {
		char pos1;
		char pos2;
		char pos3;
		String newString;
		if (s == null) {
			return null;
		} else {
			if (s.length() <= 3) {
				return s.toUpperCase();
			} else {
				pos1 = s.charAt(0);
				pos2 = s.charAt(1);
				pos3 = s.charAt(2);
				newString = ""+pos3+ pos2+pos1+s.substring(3);
				return newString.toUpperCase();
			}
		}
	}
    
}
