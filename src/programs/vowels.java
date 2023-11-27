package programs;
import java.util.*;
public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character: ");
		ch=s.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("Vowel: "+ch);
			break;
			default :
				System.out.println("Consonants : "+ch);
				
	
		}

	}

}
