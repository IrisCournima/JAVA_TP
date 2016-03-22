package com.formation.test;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.formation.observer.Horloge;
import com.formation.observer.Observateur;

public class ObserverTest extends JFrame {

	private static final long serialVersionUID=1l;
	private JLabel label = new JLabel();
	private Horloge horloge;
	
	public  ObserverTest(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setSize(200,80);
		
		this.horloge = new Horloge();
		this.horloge.addObservateur(new Observateur() {
			
			@Override
			public void update(String hour) {
				label.setText(hour);
				
			}
		});
		
		Font police = new Font("DS-digital", Font.TYPE1_FONT, 30);
		this.label.setFont(police);
		this.label.setHorizontalAlignment(JLabel.CENTER);
		this.getContentPane().add(this.label, BorderLayout.CENTER);
		this.setVisible(true);
		this.horloge.run();
	}
	

	public static void main(String[] args) {
		ObserverTest fen = new ObserverTest();

	}

}
