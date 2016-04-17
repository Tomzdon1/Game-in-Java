
public class Animate implements Runnable {
	
	private Blocks bp;
	
	 public Animate(Blocks b){	
		bp=b;
		 
	 }
	public void run(){
		
		while(true){
			bp.update();
			try{
			Thread.sleep(10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}
