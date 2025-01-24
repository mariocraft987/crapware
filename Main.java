package main;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello, world!");
		
		JOptionPane.showMessageDialog(null, "This is a small program created by AtomicBolts, \nit is best you run it in a virtual machine. \n\nDiscord: mariocraft987\nWebsite: atomicbolts.nekoweb.org","Message", JOptionPane.OK_OPTION);
		
		if (JOptionPane.showConfirmDialog(null, "Are you sure you want to run this?", "WARNING",
		        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			
			if (JOptionPane.showConfirmDialog(null, "You really sure?", "WARNING",
			        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

				if (JOptionPane.showConfirmDialog(null, "(IF I WERE YOU I WOULD PRESS THE NO BUTTON)", "WARNING",
				        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					
					if (JOptionPane.showConfirmDialog(null, "Last Chance", "WARNING",
					        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						runVirus();
					}
					
				}
				
			}

		}

	}
	
	public static void runVirus() {
		JFrame window = new JFrame();
		
		window.setTitle("CrapWare");
		window.setSize(400, 350);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
