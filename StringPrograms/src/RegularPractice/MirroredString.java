package RegularPractice;

import java.util.Scanner;

public class MirroredString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String input = scanner.next();
        
        // Ensure the input is a single character
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Invalid input. Please enter a single alphabetic character.");
            return;
        }

        char userChar = input.charAt(0);  //MANDATORY LINE -->need to convert into char becoz user give input in string form we need to convert into char format
//        System.out.println("user char is:"+userChar);
        char mirrorChar = checkMirrorchar(userChar);
        
        System.out.println("Mirror character: " + mirrorChar);
    }

    public static char checkMirrorchar(char s)
    {
    	char lower=Character.toLowerCase(s);// Convert the character to lowercase for simplicity
    	char mirrorchar=(char)('a'+('z'-lower));// Find the mirrored character
    	if(Character.isUpperCase(s))//check if Uppercase character then its output also should uppercase
    	{
    		mirrorchar=Character.toUpperCase(mirrorchar);
    	}
		return mirrorchar;
    	
    }
    
    //'z' - lower gives the distance from the character lower to 'z'. For example,
    //if lower is 'b', then 'z' - 'b' is 25 - 1 = 24.
    //	Adding this distance to 'a' gives us the mirror character. Continuing the example,
    //if lower is 'b', then 'a' + 24 gives the character at position 24 from 'a', which is 'y'.
    //OR
    //Calculate the mirror character:
    //lower = 'b', so 'z' - 'b' is 122 - 98 = 24.
    //Add this distance to 'a': mirrorchar = (char) ('a' + 24) = (char) (97 + 24) = 'y'.
    //Since the original character was uppercase, convert 'y' to uppercase: mirrorchar = 'Y'.Calculate the mirror character:
    //lower = 'b', so 'z' - 'b' is 122 - 98 = 24.
    //Add this distance to 'a': mirrorchar = (char) ('a' + 24) = (char) (97 + 24) = 'y'.
    //Since the original character was uppercase, convert 'y' to uppercase: mirrorchar = 'Y'.
	}


