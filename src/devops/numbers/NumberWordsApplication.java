package devops.numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class NumberWordsApplication {
	@SuppressWarnings("unused")
	private final NumberWords numberWords ;
	private final BufferedReader reader ;
	
	public NumberWordsApplication() {
		numberWords = new NumberWords() ;
		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	}
	
	public void pw(int n, String ch)
	{
		String one[]={" "," One"," Two"," Three"," Four"," Five"," Six"," Seven"," Eight"," Nine"," Ten"," Eleven"," Twelve"," Thirteen"," Fourteen"," Fifteen"," Sixteen"," Seventeen"," Eighteen"," Nineteen"};
		String ten[]={" "," "," Twenty"," Thirty"," Fourty"," Fifty"," Sixty"," Seventy"," Eighty"," Ninety"};
		if(n>19){System.out.print(ten[n/10]+""+one[n%10]);}
		else {System.out.print(one[n]);}
		if(n>0)System.out.print(ch);
	}
	
	public void execute() {
		while( true ) {
			try {
				
				System.out.println( "Enter number (0 to exit): " ) ;
				
				String value = reader.readLine() ;
				int number = Integer.parseInt( value ) ;
				
				
				if(number >0 && number <=999)
				{
					NumberWords numWords = new NumberWords();
					String resStr = numWords.toWords(number);
					System.out.print(resStr);
				}
				else if(number ==0)
					break;
				else 
					System.out.println("Number out of range");
			
			} catch ( NumberFormatException | IOException e ) {
				System.out.println( "Number out of range" ) ;
			}
			
		}
	}

	public static void main(String[] args) {
		new NumberWordsApplication().execute() ;
	}

}
