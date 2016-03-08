package skeleton;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FermetureFenetre extends WindowAdapter{
	
	public void windowClosing(WindowEvent E) {
		System.out.println("Fenetre en cours de fermeture");
		System.exit(0);
	}

}
