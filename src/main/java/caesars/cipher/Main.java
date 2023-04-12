package caesars.cipher;
import java.util.Scanner;  // Import the Scanner class


public class Main {

	public static void main(String[] args) {
		System.out.println("hi");
		String message = "a";
		int offset = 1;
		CaesarsCipher caesarsCipher = new CaesarsCipher();
		String cipheredMessage = caesarsCipher.cipher(message, offset);
		System.out.println("Origial Message " + message);
		System.out.println("Offset " + offset);
		System.out.println("Ciphered message  " + cipheredMessage);
		
	}

}
