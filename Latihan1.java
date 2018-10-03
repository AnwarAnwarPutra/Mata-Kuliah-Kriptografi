
package kriptografi;

public class Latihan1 {
    	public static void main(String[]args){
 		String an = "ANWAR";
		System.out.println("Plaintextnya adalah	:"+an);
		
		String as = encript(an);
		System.out.println("Enkripsinya adalah	:"+as);
		
		String an1 = decript(as);
		System.out.println("Dekripsinya adalah	:"+an1);  
		
		
	}
	public static final String[] an = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," "};
	public static final String[] as = {"D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C"," "};
	
	
	public static String encript(String plaintext){
		String ciphertext = "";
		for(int i=0 ; i<plaintext.length(); i++){
			String s0 = plaintext.substring(i, i+1);
			String s1 = " ";							
			//
			for(int j=0; j<an.length; j++){				
				if(s0.equals(an[j])){					
					s1 = as[j];
					break;
				}
			}
			ciphertext+=s1;
		}
				
		return ciphertext;
	}
	public static String decript(String ciphertext){
		String plaintext = "";
				for(int i=0 ; i<ciphertext.length(); i++){
					String s0 = ciphertext.substring(i, i+1);
					String s1 = " ";							
					//
					for(int j=0; j<as.length; j++){				
						if(s0.equals(as[j])){					
							s1 = an[j];
							break;
						}
					}
					plaintext+=s1;
				}
		return plaintext;
	}
}
