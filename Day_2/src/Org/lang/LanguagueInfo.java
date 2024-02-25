package Org.lang;

public class LanguagueInfo extends StateDetails{
	
	public void tamilLanguage() {
		System.out.println("Learn the tamil");
	}
	public void englishLanguage() {
		System.out.println("Learn the english");
	}
	public void hindiLanguage() {
		System.out.println("Learn the hindi");
	}

	public static void main(String[] args) {
		
		LanguagueInfo languagueinfo = new LanguagueInfo();
		languagueinfo.tamilLanguage();
		languagueinfo.englishLanguage();
		languagueinfo.hindiLanguage();
		languagueinfo.southIndia();
		languagueinfo.northIndia();
	}

}
