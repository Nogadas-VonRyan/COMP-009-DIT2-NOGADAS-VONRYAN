package COMP009;

import java.util.Scanner;
import java.io.File;
import javax.sound.sampled.*;

public class MP3Player {
	public static boolean stopSystem = false;
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (!stopSystem) {
			choice();
		}
		
		System.out.print("\nEnding System: Thank you.");
		scan.close();
	}

	public static void play(String filePath) {
		try {
			File audioFile = new File(filePath);
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();

			System.out.println("\nStarting song: " + filePath + "\n");
			System.out.println("Press enter to stop playing.");
			scan.nextLine();
			System.out.println("Song ended. \n");

			clip.close();
			audioStream.close();
		} catch (Exception e) {
			System.out.println("except");
			e.printStackTrace();
		}
	}

	public static void choice() {
		System.out.print("Choose a song [Enter the number]: \n" + 
						 "1.) Hey Kids - Noragami \n" + 
						 "2.) Sincerely - Violet Evergarden\n" + 
						 "3.) Kaibutsu - Beastars \n" + "Your input: ");
		int input = scan.nextInt();
		scan.nextLine();
		
		switch (input) {
		case 1:
			play("noragami.mp3");
			break;
		case 2:
			play("violet.mp3");
			break;
		case 3:
			play("beastars.mp3");
			break;
		default:
			System.out.println("Input not valid. Must only be within 1 - 3.");
		}
		
		System.out.print("Do you want to stop using the system? [1] Stop, [Any number] Continue: ");
		input = scan.nextInt();
		
		if(input == 1) {
			stopSystem = true;
		}
		
		System.out.println("================\n");
	}
}
