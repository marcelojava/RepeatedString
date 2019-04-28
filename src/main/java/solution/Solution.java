package solution;

public class Solution {

    public long repeatedString(String s, long n) {

        long quantidadeVezesCacarterSeRepete = 0;
        long totalCount = 0;
        long tamanhoString = s.length();

        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') quantidadeVezesCacarterSeRepete++;
        }

        if (quantidadeVezesCacarterSeRepete == s.length()) return n;

        long divisor = n / tamanhoString;
        totalCount += divisor * quantidadeVezesCacarterSeRepete;

        long remainder = n % tamanhoString;

        for (int i = 0; i<remainder; i++) {
            if (s.charAt(i) == 'a')
                totalCount++;
        }

        return totalCount;
    }
}
