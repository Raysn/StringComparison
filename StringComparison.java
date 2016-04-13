//大文字と小文字を区別せずに指定した文字列のマッチングをするクラス
//参考にしたwebページ: http://www.javadrive.jp/regex/option/index2.html
//参考にしたwebページ: http://javatechnology.net/java/pattern-matching/
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringComparison {
	
	public boolean checkAlphabetPattern( String pattern, String input, String option ) {
	//第1引数が被比較文字列
	//第2引数が比較文字列
		Pattern inputPattern = Pattern.compile( input, Pattern.CASE_INSENSITIVE );
		Matcher m = inputPattern.matcher( pattern );

		switch( option ) {
			case "partial":
				return m.find(); //部分一致

			case "perfect":
				return m.matches(); //完全一致

			default:
				System.out.println( "Unknown Command" );
				return false;
		}
		
	}
	
}
