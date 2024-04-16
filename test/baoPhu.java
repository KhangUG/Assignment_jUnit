import static org.junit.Assert.*;
import org.junit.Test;

public class baoPhu {
    
    @Test
    public void testIsPrimeWithPrimeNumber() {
        assertTrue(PrimeChecker.isPrime(2));
        assertTrue(PrimeChecker.isPrime(3));
        assertTrue(PrimeChecker.isPrime(5));
        assertTrue(PrimeChecker.isPrime(7));
        assertTrue(PrimeChecker.isPrime(11));
        assertTrue(PrimeChecker.isPrime(13));
        assertTrue(PrimeChecker.isPrime(17));
        assertTrue(PrimeChecker.isPrime(19));
    }
    
    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        assertFalse(PrimeChecker.isPrime(1));
        assertFalse(PrimeChecker.isPrime(4));
        assertFalse(PrimeChecker.isPrime(6));
        assertFalse(PrimeChecker.isPrime(8));
        assertFalse(PrimeChecker.isPrime(9));
        assertFalse(PrimeChecker.isPrime(10));
        assertFalse(PrimeChecker.isPrime(12));
        assertFalse(PrimeChecker.isPrime(15));
    }
    
    @Test
    public void testIsPrimeWithNegativeNumber() {
        assertFalse(PrimeChecker.isPrime(-2));
        assertFalse(PrimeChecker.isPrime(-3));
        assertFalse(PrimeChecker.isPrime(-5));
        assertFalse(PrimeChecker.isPrime(-7));
    }
    
    @Test
    public void testIsPrimeWithZeroAndOne() {
        assertFalse(PrimeChecker.isPrime(0));
        assertFalse(PrimeChecker.isPrime(1));
    }
    
    @Test
    public void testIsPrimeWithLargePrimeNumber() {
        assertTrue(PrimeChecker.isPrime(997));
        assertTrue(PrimeChecker.isPrime(991));
        assertTrue(PrimeChecker.isPrime(983));
    }
}
