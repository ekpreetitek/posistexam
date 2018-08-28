/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posistexam;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;


/**
 *
 * @author mca
 */
public class PosistExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException, Exception {
        // TODO code application logic here
      TreeSet set = new TreeSet();
      OwnerData data= new OwnerData(1,50.5f,"A");
      OwnerData data2=new OwnerData(2, 17.7f, "B");
      OwnerData data3= new OwnerData(3,10.50f,"C");
      
      
      Date date= new Date(2018, 8, 28);
      
      Node node = new Node(date, data, 1, "root00", null, null, null);//1.Creation of Genesis node
      Node node2=new Node(date, data2,2, "child10",null, null, null);
      Node node3=new Node(date, data3,3, "child01", null, null, null);
      set.add(node);  
      set.add(node2);
      set.add(node3);
      
      
      //2.Creating a set of child nodes
     HashSet set_of_nodes = new HashSet();
     set_of_nodes.add(node);
     set_of_nodes.add(node2);
     set_of_nodes.add(node3);
     
     //3.Create child node that originates from particular node
     OwnerData data4= new OwnerData(3,10.50f,"C");
     Node child_node=new Node(date, data4,4, "child010", "child10", null, null);
        
     
     
     //4.Encrypting data
     String encrypted_data=data.encrypt(""+data.getValue(),"123");
        System.out.println(""+encrypted_data);
     
      
        
      
    }
}
