import java.math.*;

class Solution {
    public BigInteger solution(String number) {
        BigInteger big = new BigInteger(number);
        BigInteger nine = new BigInteger("9");
        
        return big.remainder(nine);
    }
}