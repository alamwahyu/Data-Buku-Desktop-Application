/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package databuku;

import javax.swing.text.*;

public class onlydigit {
    public PlainDocument getOnlyDigit(){
        PlainDocument filterDigit = new PlainDocument(){
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
                StringBuffer buffer = new StringBuffer();
                int s = 0;
                char[] dataInput = str.toCharArray();
                int len = dataInput.length;
                
                for (int i=0; i<len; i++){
                    boolean isOnlyDigit = Character.isDigit(dataInput[i]);
                    if (isOnlyDigit == true){
                        dataInput[s] = dataInput[i];
                        s++;
                    }
                }
                buffer.append(dataInput,0,s);
                super.insertString(offs, new String(buffer), a);
            }
        };
        return filterDigit;
    }
}
