import java.util.*;
import java.math.BigInteger;
class Solution {
    public int superPow(int a, int[] arr) {
        StringBuilder sb=new StringBuilder();
        for(int x:arr){
            sb.append(x);
        }
        BigInteger p= new BigInteger(sb.toString());
        BigInteger b= BigInteger.valueOf(a);
        BigInteger mod=BigInteger.valueOf(1337);
        BigInteger ans=b.modPow(p,mod);
        return ans.intValue();
    }
}