import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class TheActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ReplaceGui.createAndCopy){
			if (ReplaceGui.createAndCopy.getText().equals("Cancel")){
				ReplaceGui.createAndCopy.setText("Stopping...");
				TheProccesingClass.stopT();

				
			}
			else{

				ReplaceGui.createAndCopy.setText("Cancel");
				TheProccesingClass.replace();
			}
		} else {
			
		}

	}

}
