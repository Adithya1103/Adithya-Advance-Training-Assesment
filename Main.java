
public class Main {
	public void createBooks() {
		Main bk[] = new Main [2];		 
	      bk Main [0] = new Main("Java Programing ", 350.50);
	      bk[1] = new Book("Let Us C", 200.00);
	      for(int i = 0; i<bk.length; i++) {
		         ((Object) bk[i]).display();
		         System.out.println(" ");
	      }
	    
	      }
	
	public void showBooks() {
		  	createBooks();
		
	}
	public static void main(String args[])  {
	    Main c1 = new Main();  
		c1.showBooks();
	   
	      }
	   }


    

