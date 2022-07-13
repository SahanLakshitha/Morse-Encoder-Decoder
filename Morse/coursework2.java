/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author SAHAN LW
 */
/*


*
*  Morse Encoder/Decoder
*
*  Morse code translations, use this to perform encoding/decoding
*/
import java.util.*;


public class coursework2 {
    static String[][] MORSE_CODE1 = { { "-...", "B" }, { ".-", "A" }, { "-.-.", "C" }, { "-..", "D" }, { ".", "E" },
            { "..-.", "F" }, { "--.", "G" }, { "....", "H" }, { "..", "I" }, { ".---", "J" }, { "-.-", "K" },
            { ".-..", "L" }, { "--", "M" }, { "-.", "N" }, { "---", "O" }, { ".--.", "P" }, { "--.-", "Q" },
            { ".-.", "R" }, { "...", "S" }, { "-", "T" }, { "..-", "U" }, { "...-", "V" }, { ".--", "W" },
            { "-..-", "X" }, { "-.--", "Y" }, { "--..", "Z" }, { "-----", "0" }, { ".----", "1" }, { "..---", "2" },
            { "...--", "3" }, { "....-", "4" }, { ".....", "5" }, { "-....", "6" }, { "--...", "7" }, { "---..", "8" },
            { "----.", "9" }, { ".-.-.-", "." }, { "--..--", "," }, { "..--..", "?" }, { ".----.", "'" },
            { "-.-.--", "!" }, { "-..-.", "/" }, { "-.--.", "(" }, { "-.--.-", ")" }, { ".-...", "&" },
            { "---...", ":" }, { "-.-.-.", ";" }, { "-...-", "=" }, { ".-.-.", "+" }, { "-....-", "-" },
            { "..--.-", "_" }, { ".-..-.", "\"" }, { "...-..-", "$" }, { ".--.-.", "@" }, };

   	static String[][] MORSE_CODE2 = { { "-... ", "[B]" }, { ".- ", "[A]" }, { "-.-. ", "[C]" }, { "-.. ", "[D]" }, { ". ", "[E]" },
            { "..-. ", "[F]" }, { "--. ", "[G]" }, { ".... ", "[H]" }, { ".. ", "[I]" }, { ".--- ", "[J]" }, { "-.- ", "[K]" },
            { ".-.. ", "[L]" }, { "-- ", "[M]" }, { "-. ", "[N]" }, { "--- ", "[O]" }, { ".--. ", "[P]" }, { "--.- ", "[Q]" },
            { ".-. ", "[R]" }, { "... ", "[S]" }, { "- ", "[T]" }, { "..- ", "[U]" }, { "...- ", "[V]" }, { ".-- ", "[W]" },
            { "-..- ", "[X]" }, { "-.-- ", "[Y]" }, { "--.. ", "[Z]" }, { "----- ", "[0]" }, { ".---- ", "[1]" }, { "..--- ", "[2]" },
            { "...-- ", "[3]" }, { "....- ", "[4]" }, { "..... ", "[5]" }, { "-.... ", "[6]" }, { "--... ", "[7]" }, { "---.. ", "[8]" },
            { "----. ", "[9]" }, { ".-.-.- ", "[.]" }, { "--..-- ", "[,]" }, { "..--.. ", "[?]" }, { ".----. ", "[']" },
            { "-.-.-- ", "[!]" }, { "-..-. ", "[/]" }, { "-.--. ", "[(]" }, { "-.--.- ", "[)]" }, { ".-... ", "[&]" },
            { "---... ", "[:]" }, { "-.-.-. ", "[;]" }, { "-...- ", "[=]" }, { ".-.-. ", "[+]" }, { "-....- ", "[-]" },
            { "..--.- ", "[_]" }, { ".-..-. ", "[\"]" }, { "...-..- ", "[$]" }, { ".--.-. ", "[@]" }, { "  ", "[ ]" }, };

    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("This program is encode and decode Morse codes.");
		
		selectmode(); // Allow users to select a mode (encode/decode).
		
	}
	
	public static void selectmode(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Would you like to encode (e) or decode (d): ");
		String mode = scan.next();
		System.out.println(" ");
		if (mode.equals("e")){
			encodemode();
		}
		else if (mode.equals("d")){
			decodemode();
		}
		else{
			System.out.println("Invalid input");
			selectmode();
		}
	}
	
	public static void encodemode(){
		Scanner scan =  new Scanner(System.in);
		System.out.print("What message would you like to encode:\n(Please enter your massege in uppercase)\n ");
		
		String massege = scan.nextLine();
		System.out.println();
		System.out.print("Your encoded message is: ");
		
		String[] words = massege.split("");
		
			for (String word : words) {
			// 1 space between letters
				String[] chars = word.split("");
				Decode2Encode(Arrays.toString(chars));
				
			}
		System.out.println();
		anotherMsg();
	}
	
	public static void Decode2Encode(String x){
		for(int i= 0 ; i < 55 ; i++ ){
			if(x.equals(MORSE_CODE2[i][1])){
				String  character = MORSE_CODE2[i][0] ;
				System.out.print(character);
				
			}
			else{
				
			}
		}
	}
	
	public static void decodemode(){
		Scanner scan =  new Scanner(System.in);
		System.out.print("What message would you like to decode: ");
		String message = scan.nextLine();
		System.out.println();
		System.out.print("Your decoded message is: ");//output the decoded massege
		
			// 3 spaces used to separate words 
			String[] words = message.split(" ");
			
				for (String word : words) {
					// 1 space between letters
					String []chars = word.split(" ");
					Encode2Decode(Arrays.toString(chars));
				}
			System.out.println(" ");
			another_msg();	 
	}
	
	public static void Encode2Decode(String x){
		for(int i= 0 ; i < 55 ; i++ ){
			if(MORSE_CODE1[i][0].equals(x)){
				String character = MORSE_CODE1[i][1] ;
				System.out.print(character);
			}
			else{
				
			}
		}
		
	}
	
	public static void another_msg(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Would you like to encode or decode another message? (y/n):");
		String new_msg = scan.next();
		
		if (new_msg.equals("y")){
			selectmode();
		}
		else if (new_msg.equals("n")){
			exit();
		}
		else{
			System.out.println("Invalid response");
			another_msg();
		}
	}
	
	public static void exit(){//exit from the programme
		System.out.println(" ");
		System.out.println("Thankyou for using the programme");
	}
}
