import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;

public class TheKeyListener implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if ((e.isControlDown()) && (e.getKeyCode() == KeyEvent.VK_Z)){
			TheProccesingClass.undo();
		}
		else if ((e.isControlDown()) && (e.getKeyCode() == KeyEvent.VK_Y)){
			TheProccesingClass.redo();
		}
		
		else if ((e.isControlDown()) && (e.getKeyCode() == KeyEvent.VK_L)){
			TheProccesingClass.clear();
		}
		else if ((e.isControlDown()) && (e.getKeyCode() == KeyEvent.VK_H)){
			TheProccesingClass.help();
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
