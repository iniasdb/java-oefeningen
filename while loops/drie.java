
public class drie {

	public static void main(String[] args) {
		int jaar = 1999; 
        long bevolking = 6000000000L;
        
          while (bevolking >= 6000000) {      
                jaar = jaar - 40;
                bevolking = bevolking / 2;
                System.out.println(jaar);

          }
          
    
    }
}
