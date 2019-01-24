/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfranc.com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


/**
 *
 * @author imad
 */
public class TestImad {
    
 @Test  

 
    //Teste de la fonction hashCode
	public void testhashCode() {
		Couple couple = new Couple("Boufenchouche", "Imad");
		Markov m = new Markov();
		m.couples.put(couple, null);
		int res = m.hashCode();
		assertNotNull(res);
		System.out.println(res);
    
        }
 @Test       
        //Teste du text vide 
        public void TexteVide() { 
            Markov m2 = new Markov();
            m2.readFile("cosette.txt");
            int prev = m2.couples.size();
            assertEquals(0, prev);
        
}
  @Test       
       public void testGenerate() { 
           Markov m2 = new Markov();
           m2.readFile("phrases.txt");
           Couple couple1 = new Couple("Hello", "word" ); 
           String i = m2.generateText(couple1, 1);
           assertEquals("Hello word", i);
           
        
        

        
}
       
}
