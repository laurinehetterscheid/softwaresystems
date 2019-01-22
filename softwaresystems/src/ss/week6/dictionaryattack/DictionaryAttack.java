package ss.week6.dictionaryattack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.codec.binary.Hex;

import ss.week6.cards.Card;


public class DictionaryAttack {
	private Map<String, String> passwordMap;
	private Map<String, String> hashDictionary;

	/**
	 * Reads a password file. Each line of the password file has the form:
	 * username: encodedpassword
	 * 
	 * After calling this method, the passwordMap class variable should be
	 * filled with the content of the file. The key for the map should be
	 * the username, and the password hash should be the content.
	 * @param filename
	 * @throws IOException 
	 */
	public void readPasswords(String filename) throws IOException {
		this.passwordMap = new HashMap<>();
		
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		
		String line = reader.readLine();
		
		while (line != null) {
			String[] splitLine = line.split(":", 2);
			String username = splitLine[0];
			String password = splitLine[1];
			passwordMap.put(username, password);
		}
		
		reader.close();		
		        
	}

	/**
	 * Given a password, return the MD5 hash of a password. The resulting
	 * hash (or sometimes called digest) should be hex-encoded in a String.
	 * @param password
	 * @return
	 * @throws NoSuchAlgorithmException 
	 */
	public String getPasswordHash(String password) throws NoSuchAlgorithmException {

		final MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		messageDigest.reset();
		messageDigest.update(password.getBytes(Charset.forName("UTF8")));
		final byte[] resultByte = messageDigest.digest();
		final String result = new String(Hex.encodeHex(resultByte));
		
		System.out.println("Hashed password is: " + result);
    	return result;
	}
	
	
	/**
	 * Checks the password for the user in the password list. If the user
	 * does not exist, returns false.
	 * @param user
	 * @param password
	 * @return whether the password for that user was correct.
	 * @throws NoSuchAlgorithmException 
	 */
	public boolean checkPassword(String user, String password) throws NoSuchAlgorithmException {
        
		if(passwordMap.containsKey(user)) {
			String savedPassword = passwordMap.get(user);
			if(getPasswordHash(savedPassword).equals(password)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Reads a dictionary from file (one line per word) and use it to add
	 * entries to a dictionary that maps password hashes (hex-encoded) to
     * the original password.
	 * @param filename filename of the dictionary.
	 * @throws IOException 
	 * @throws NoSuchAlgorithmException 
	 */
    public void addToHashDictionary(String filename) throws IOException, NoSuchAlgorithmException {
    	
    	// read a file
    	BufferedReader reader = new BufferedReader(new FileReader(filename));
    	String line = reader.readLine();
    	
    	// compute the (MD5) hash of each line (use getPasswordHash)
    	String hashedPassword = getPasswordHash(line);
    	
    	
    	// fill a dictionary (a Map) that can map a password hash back to the original password
    	this.hashDictionary = new HashMap<>();
    	hashDictionary.put(hashedPassword, line);
    	
    	
        
    }
	/**
	 * Do the dictionary attack.
	 */
	public void doDictionaryAttack() {
		Map<String, String> foundPasswords = new HashMap<>();
		
		// whenever a password is found, print out both the username and the password
		for(Map.Entry<String, String> entry1 : passwordMap.entrySet()) {
			
			for(Map.Entry<String, String> entry2 : hashDictionary.entrySet()) {
				
				if(hashDictionary.containsKey(entry1.getValue())) {
					
					foundPasswords.put(entry1.getKey(), entry2.getValue());
					System.out.println(foundPasswords.toString());
					
				}
			}
		}
	}
	public static void main(String[] args) {
		DictionaryAttack da = new DictionaryAttack();
		// To implement
		da.doDictionaryAttack();
	}

}
