/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posistexam;

import java.util.HashSet;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author mca
 */
public class OwnerData {
    int ownerID;
    float value;
    String ownerName;

    public OwnerData(int ownerID, float value, String ownerName) {
        this.ownerID = ownerID;
        this.value = value;
        this.ownerName = ownerName;
    }
    
    
    

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
    
    
    public String encrypt(String strClearText,String strKey) throws Exception{
	String strData="";
	
	try {
		SecretKeySpec skeyspec=new SecretKeySpec(strKey.getBytes(),"Blowfish");
		Cipher cipher=Cipher.getInstance("Blowfish");
		cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
		byte[] encrypted=cipher.doFinal(strClearText.getBytes());
		strData=new String(encrypted);
		
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception(e);
	}
	return strData;
    
        
    }
}
