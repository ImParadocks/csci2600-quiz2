import java.lang.Math;


public class HelloWorld {  
    public static void main(String[] args) {  
        System.out.println("Hello, World!");  
        int x = 1;
        
        for (int i = 1; i<9 ; i++){
        	System.out.print(i);
        	System.out.print(" ");
        	System.out.println(Math.sqrt(i));
        }
    }  
}