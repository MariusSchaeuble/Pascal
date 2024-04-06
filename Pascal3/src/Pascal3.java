import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigDecimal;
import java.text.DecimalFormat;

import java.math.BigInteger;





public class Pascal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long s = 7; //anzahl an stellen pro block
		
		long n = 6; //anzahl zeilen
		
		
		
		
		
	
		
		
		
		//Ausgabe
		
		
		
		long as = 1;
		BigInteger nf = new BigInteger("1");
		BigInteger kf = new BigInteger("1");
		BigInteger nkf = new BigInteger("1");
	
		BigInteger h = new BigInteger("1");
	
		BigInteger z = new BigInteger("1");
		
		BigInteger o = new BigInteger("10");
		
		PrintWriter pWriter = null;
        try {
            pWriter = new PrintWriter(new BufferedWriter(new FileWriter("Ausgabe.txt")));
            
     for (int i = 1;i<=n;i++) { //i = zeile
    		
    	 
    	
    	 
    	 for (int j = 1; j<=(i-1);j++) {
    		 
    		 nf = nf.multiply(new BigInteger("" + j));
    		 
    		 
    		 
    	 }

    	 if ((s)%2==0) {
    	 for (int a = 1;a<= (n-i); a++) { //s stellige zahlen zulassen
    		 
    		
    			 
    			 
    		 
     		for (int b = 1; b<= (s/2);b++) {
     			pWriter.print(" ");
     		}
    	 }
    		 }else {
    			 
    			 for (int b = 1; b<= ((s/2)*(n-i));b++) {
    	     			pWriter.print(" ");
    	     		}
    			 
    		 }
     	
    
    	 
    	 for (int c = 1; c<=i;c++) { //c = stelle
    		 
    		 
    		
    		 
    		 for (int d = 1; d<=i-c;d++) {
    			 
    			 
    			 nkf = nkf.multiply(new BigInteger(""+d));
    			 
    			 
    		 }
    		
    	
    		 
    		 for (int e = 1; e<=c-1;e++) {
    			 
    			 
    			 kf = kf.multiply(new BigInteger(""+e));
    			 
    		 }
    		
    		 
    		 
    		 
    			
    		
    			
    			z = nf.divide(new BigInteger("" + (nkf.multiply(new BigInteger(""+kf)))));
    			
    			 
    			 while (!((z.compareTo(h)==1 || z.compareTo(h)==0) && ((z.compareTo(o))==-1))) {
    				 
    				h = h.multiply(new BigInteger(""+10));
    				o = o.multiply(new BigInteger(""+10));
    				 as++;
    					
    			 }
    		
    				
    					
    				
    	
    			
    			 if ((((s-as))%2)==0)  {
    				
    					
    				 
        			 
        			 for (int d3 = 1;d3<=((s-as)/2);d3++) {
        				 
        				 pWriter.print(" ");
        			 }
        			 
    		    		
        		
        			 pWriter.print(z.toString());
        		
        			 for (int d4 = 1;d4<=((s-as)/2);d4++) {
        				 
        				 pWriter.print(" ");
        			 }
        		
        			
    				 } else {
    					 
    					 for (int f = 1;f<=((s-as)/2);f++) {
            				 
            				 pWriter.print(" ");
            			 }
    					 pWriter.print(" ");
        		    		
            		
            			 pWriter.print(z.toString());
            		
            			 for (int d2 = 1;d2<=((s-as)/2);d2++) {
            				 
            				 pWriter.print(" ");
            			 } 
    		 
    	 }
    			
    	 
    			
    		
    		kf = kf.subtract(new BigInteger(""+kf));
    		nkf = nkf.subtract(new BigInteger(""+nkf));
    		kf = kf.add(new BigInteger(""+1));
    		nkf = nkf.add(new BigInteger(""+1));
    		
    		
    	h = h.subtract(new BigInteger(""+h));
    		h = h.add(new BigInteger(""+1));
    			
    		o = o.subtract(new BigInteger(""+o));
    		o = o.add(new BigInteger(""+10));
    			as = 1;
    			 
    			 
    	 }
    			 
    			 
    			 
    	 nf = nf.subtract(new BigInteger(""+nf));
 		nf = nf.add(new BigInteger(""+1));								// Ende Zeilen
    	
    	 pWriter.println("");
    	 
    	      }
    		
    	 
       
    	 } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (pWriter != null){
                pWriter.flush();
                pWriter.close();
            }
        }
		
		
		
	}

}
	
