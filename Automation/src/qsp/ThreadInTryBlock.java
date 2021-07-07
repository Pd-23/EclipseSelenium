package qsp;

public class ThreadInTryBlock {
public static void main(String[] args) {
	int i=0;
	while(i<100) {
		   try {
			   Thread.sleep(1000);
		    System.out.println("hi");;
	
		   }
		   catch(Exception e) {
			   i++;
		    System.out.println("bye");
		   }
		  }
}
}
