package launcher;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	gui.SimplePresentationScreen  SP = new gui.SimplePresentationScreen(new entities.Student(126690, "Lorenzetti", "Lucio Adriel", "lucioadriell@gmail.com", "https://github.com/Lucio-Lorenzetti/tdp-proyecto-1", "Lugar de la foto"));
            	SP.setVisible(true);
            }
        });
    }
}