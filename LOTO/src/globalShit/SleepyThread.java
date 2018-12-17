package globalShit;

public class SleepyThread {
	static Thread t = new Thread();
	public static void so(String input){
		System.out.println(input);
	}
	public static void st2(String input){
		
		try{
			t.sleep(2000);
		}catch(Exception e){}
		System.out.println(input);
	}
	
	public static void st3(String input){
		try{
			t.sleep(3000);
		}catch(Exception e){}
		System.out.println(input);
	}
	
	public static void st1(String input){
		try{
			t.sleep(1000);
		}catch(Exception e){}
		System.out.println(input);
	}
	
	public static void stHalf(String input){
		try{
			t.sleep(500);
		}catch(Exception e){}
		System.out.println(input);
	}
}
