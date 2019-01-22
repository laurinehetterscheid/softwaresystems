package ss.week6.test;

import org.junit.Before;
import org.junit.Test;
import ss.week6.dictionaryattack.DictionaryAttack;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Testprogram for DictionaryAttack.
 * Lab Exercise SoftwareSystems
 * @author Jip Spel
 * @version $Revision: 1.0 $
 */
public class DictionaryAttackTest {

    /** Testvariabele for a <tt>DictionaryAttack</tt> object. */
    private DictionaryAttack dictionaryAttack;

    /** Path to the text file */
    private static final String PATH = ""; //Your path to the test folder /Users/laurine.hetterscheid/SoftwareSystems/Java/ss/softwaresystems/src/ss/week6/test/

    @Before
    public void setUp() {
        dictionaryAttack = new DictionaryAttack();
        try {
            dictionaryAttack.readPasswords(PATH + "LeakedPasswords.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Test for <tt>getPasswordHash</tt>
     * @throws NoSuchAlgorithmException 
     */
    @Test
    public void testGetPasswordHash() throws NoSuchAlgorithmException {
        assertEquals("5f4dcc3b5aa765d61d8327deb882cf99", dictionaryAttack.getPasswordHash("password"));
    }

    /**
     * Test for <tt>checkPassword</tt>
     * @throws NoSuchAlgorithmException 
     */
    @Test
    public void testCheckPassword() throws NoSuchAlgorithmException {
        assertTrue(dictionaryAttack.checkPassword("katrine", "spongebob"));
    }

}
