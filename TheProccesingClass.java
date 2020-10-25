import java.util.ArrayList;
import java.util.regex.PatternSyntaxException;

public class TheProccesingClass {

	static String x = "";
	static String y = "";
	static String input;
	static String output;
	static Thread t;
	public static ArrayList<String> allInps = new ArrayList<String>();
	public static int allInpAt;
	
	public static String help =
		   	"ctrl + h = help \n" 
			+ "ctrl + z = undo \n"
			+ "ctrl + y = redo \n"
			+ "ctrl + l = clear \n";
	
	private static void prepare(){
		x = ReplaceGui.x.getText();
		y = ReplaceGui.y.getText();
		input = ReplaceGui.inp.getText();
		output = "";
		
	}

	
	public static void replace() {
		prepare();
		
		t = new Thread(new Runnable(){

			@Override
			public void run(){
				
				ReplaceGui.inp.setFocusable(false);
				ReplaceGui.inp.setText("");
				
				while (!(t.isInterrupted())){
					try{
				output = input.replace(x, y);}catch (PatternSyntaxException e){e.printStackTrace();}
				t.interrupt();}
			
				ReplaceGui.inp.setFocusable(true);
				ReplaceGui.inp.setText(output);
				if(allInps.size() == 0){
					allInps.add(input);
				}
				allInps.add(output);
				allInpAt ++;
				
				

				ReplaceGui.createAndCopy.setText("Create");
			}
		});
		
		t.start();
		
	}
	

	public static void stopT(){
		t.interrupt();
		ReplaceGui.inp.setText(input);
		ReplaceGui.createAndCopy.setText("Create");
	}
	
	
	public static void undo(){
		
		if(allInpAt > 0){
		allInpAt --;
		ReplaceGui.inp.setText(allInps.get(allInpAt));
	 
		}
		
	}
	
	public static void redo(){
		if(allInpAt +1 < allInps.size()){
		allInpAt ++;
		ReplaceGui.inp.setText(allInps.get(allInpAt)); }
	}
	
	public static void clear(){
		ReplaceGui.x.setText("");
		ReplaceGui.y.setText("");
		ReplaceGui.inp.setText("");
	}
	
	public static void help(){

		ReplaceGui.inp.setText(help);
	}
	
	

}
