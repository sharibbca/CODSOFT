
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.Scanner; 

public class wordc_ount {
	public static void main(String[] args)
	{
		test t1=new test();
		Scanner sc =new Scanner(System.in);
		System.out.println("=====================Enter your choice ===============================================");
		System.out.println(" 1 for count  a  word from file \n  2 for count a words from  String \n  3 for exit a program");
		int a =sc.nextInt();
		switch (a) {
			case 1:
			t1.filecount();
				break;
			case 2:
			t1.stringcount();
			
		
			default:
				break;
		}
		
		
	}
}
class test
{

public void filecount()
{
	try {
           
		File Obj = new File("word_count.txt");
		Scanner Reader = new Scanner(Obj);
		while (Reader.hasNextLine()) {
			String data = Reader.nextLine();
			int total = 1 ;
		int i = 0 ;
		while(i<data.length())
		{
			if ((data.charAt(i) == ' ') && (data.charAt(i + 1) != ' '))  {
		total++;  
	 }
	 i++; 
  } 
  System.out.println("number of string in given file is  :" +total);
		}
		
		Reader.close();
	}
	catch (FileNotFoundException e) {
		System.out.println("An error has occurred.");
		e.printStackTrace();
	}
}
void stringcount()
{
	Scanner sc1 =new Scanner(System.in);
	System.out.println("enter String you want to count a word ");
	String ss =sc1.nextLine();
	System.out.println("The given String is: " + ss);
      
      int total = 1;
    
      int i = 0; 
    
      while (i < ss.length()) {
        
         if ((ss.charAt(i) == ' ') && (ss.charAt(i + 1) != ' '))  {
            total++;  
         }
         i++; 
      } 
    
      System.out.println("Number of words in the given string: " +  total);
   } 
}

	
	


