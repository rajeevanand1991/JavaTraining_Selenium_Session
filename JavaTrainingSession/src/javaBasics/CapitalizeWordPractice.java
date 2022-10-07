package javaBasics;

public class CapitalizeWordPractice {
	
	public static String CapitalizeWord(String str) {
		if(str.length()==1) {
			return str.toUpperCase();
		}
		
		String words[]=str.split("\\s");
		String result="";
		for (String w:words) {
			String first=w.substring(0,1).toUpperCase();//W
			String rest=w.substring(1); //elcome
			result=result+first+rest+" ";//Welcome
			
		}
		return result.trim();
	}

	public static void main(String[] args) {
		String caps=CapitalizeWord("welcome onboard rajeev"); //WelcomeOnboardRajeev
		System.out.println(caps);
	}

}
