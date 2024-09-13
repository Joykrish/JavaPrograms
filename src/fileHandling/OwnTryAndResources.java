package fileHandling;

class Myclass implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Closing!!");
	}
	
}
public class OwnTryAndResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Myclass var=new Myclass() ){
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
