package databuku;

import java.util.*;   
public class RandomGenerator 
{  
    private static Random random = new Random();  
  
    public static String generateActivationCode(int length) {  
        String code = new String("");  
        for (int i = 0; i < length; i++) {  
            code += (char) (random.nextInt(10) + '0');  
        }  
        return code;  
    }  
} 