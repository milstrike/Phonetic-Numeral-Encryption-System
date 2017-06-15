
package mil.system.pnes;

/**
 *
 * @author milstrike
 */
public class dictionary {
    
    private final String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," ","1","2","3","4","5","6","7","8","9","0",".",",","?","!","","~","`","@","#","$","%","^","&","*",":",";","'","/","-","_","+","="};
    private final String[] convertor = {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999","0","11111","2222","3333","4444","5555","6666","77777","8888","99999","00","1","11","111","1111"," ","000","0000","00000","000000","0000000","111111","1111111","11111111","00000000","000000000","0000000000","111111111","1111111111","11111111111","111111111111","00000000000","000000000000"};
    
   
    private String output = "";
    private String output2 = "";
    
    public String changeLetter(String lambda){
        for(int i = 0; i < alpha.length; i++){
            if(lambda.equalsIgnoreCase(alpha[i])){
                output = convertor[i] + " ";
                i = alpha.length;
            }
        }
        return output;
    }
    
    public String changeNumber(String lambda){
        for(int i = 0; i < convertor.length; i++){
            if(lambda.equalsIgnoreCase(convertor[i])){
                output2 = alpha[i];
                i = convertor.length;
            }
        }
        return output2;
    }
    
    public int getArrayLength(){
        return alpha.length;
    }
    
    public String getAlphaCharacter(int i){
        return alpha[i];
    }
    
    public String getConvertorCharacter(int i){
        return convertor[i];
    }
    
}
