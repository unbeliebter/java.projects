package bwinf.Woerter;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
	
	Scanner input= new Scanner(System.in);
	    
	private String finalText="";
		public void read(String path, String filename)throws Exception
	    {
			String searchLine = "";
            String words = "";
            int line = 0;
            File file = new File(path + filename);

            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            
            while ((st = br.readLine()) != null){
                System.out.println(st);
                if (isEven(line)){
                    searchLine = st;
                    finalText = st;
                }else {
                    words = st;
                }
                line++;
                if (isEven(line)){
                    findWords(searchLine, words);
                }

            }
			
	    }
		private void findWords(String line, String words){
            String searchedWord[] = line.split(" ");
            String word[] = words.split(" ");
            int lengthOfSearchedWord = 0;
            int lengthOfWord =  0;


            for (int i=0; i<searchedWord.length; i++){
                String[] searchedWordLetters = searchedWord[i].split("");
                lengthOfSearchedWord = countMissingChars(searchedWord[i]);
                //int posOfLetter[] = new int[lengthOfSearchedWord];
                int posOfLetter[] = searchLetters(searchedWordLetters, lengthOfSearchedWord, "^[a-zA-Z]*$");
                for (int j=0; j< word.length; j++){
                    String[] wordLetters = word[j].split("");
                    lengthOfWord = wordLetters.length;
                    if (lengthOfWord == lengthOfSearchedWord){
                        if (posOfLetter[0] >= 0){
                            for (int pos : posOfLetter) {
                                if (wordLetters[pos].equalsIgnoreCase(searchedWordLetters[pos])) {
                                    replaceInFinalText(word[j], i);
                                }
                            }
                        }else{
                            if (lengthOfSearchedWord == lengthOfWord){
                                replaceInFinalText(word[j], i);
                                break;
                            }
                        }
                    }
                }
            }

        }

        private int[] searchLetters(String[] word, int length, String regex){
            int[] positions = new int[length+1];
            positions[0] = -1;
            int i = 0;
            int pos = 0;
            for (String letter : word){
                if (letter.matches(regex)) {
                   positions[i] = pos;
                   i++;
                }
                pos++;
            }
            return positions;
        }

        private boolean isEven(int number){
            if (number % 2 == 0){
                return true;
            }else {
                return false;
            }
        }

        private void setFinalText(String text){
            finalText =  text;
        }

        private int countMissingChars(String word){
            int count = 0;
            String[] chars = word.split("");
            for (int i=0; i<chars.length; i++) {
                if (chars[i].matches("^[a-zA-Z]*$") || chars[i].equals("_")) {
                    count++;
                }
            }
            return count;
        }

        private void replaceInFinalText(String newText, int pos){
            String text = finalText;
            String[] oldText = finalText.split(" ");
            Boolean specialCharacter = oldText[pos].length() == newText.split("").length;

            if (!specialCharacter){
                String[] character = oldText[pos].split("");
                int[] positions = searchLetters(character, character.length,"[,.;:!?]");
                newText = newText + character[positions[0]];
                text = text.replaceAll(oldText[pos], newText);
            }else{
                text = text.replaceAll(oldText[pos], newText);
            }

            setFinalText(text);
        }

        public String getFinalText(){
            return finalText;
        }
    
}
	       
			
			/*
	  			File file = new File(path + filename);
	        
	        String sp1="";
	        String sp2 ="";
	       // String Output="";
	        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
				String st;
				int k = 0;
				while ((st = br.readLine()) != null)
				{
					if(k==0)
					{
						String 	alf1=st;
						sp1= alf1;
				    System.out.println(alf1);
				    	k++;
					}
					if(k==1)
					{
						st = br.readLine();
					String  alf2=st;
					sp2=alf2;
					String speicher="";
					System.out.println(alf2);
					durchführung(sp1,sp2,speicher);
					
					
					}
					
					
				}
				
	        }
	    }		
				
	        private void durchführung(String sp1,String sp2,String speicher) {
	    		// TODO Auto-generated method stub
	        	
	        	String mS=sp1;
	    		String l=sp2;
	    		String[] t=mS.split(" ");
	    		String[] j = l.split(" ");
	    		
	    		String a="";
	    		
	    		for(String s:j)
	    		{	
	    		while(s!=null)
	    		{
	    			
	    			 a=s;
	    			 int i=a.length();
	    			for(String ü:t)
	    			{	
	    				String ö=ü;
	    				int p=ö.length();
	    				if(i==p)
	    				{
	    					for(int z=0;z<i;i++)
	    					{
	    						char w = s.charAt(z);
	    						char e= ö.charAt(z);
	    						int d=0;
	    						while(d==0)
	    						{
	    							if(w==e)
	    							{
	    								String [][] alf =new String[1][1];
	    								alf[z][0]= ö;
	    								speicher=speicher+ö;
	    							}
	    							d++;
	    						}
	    						
	    						
	    						
	    					}
	    				}
	    			}
	    			
	    			
	    		}
	    		System.out.println("The encoded text ist:");
				System.out.println(speicher);
	    		}
	        }
}
				
					*/
			
	    
		
	

