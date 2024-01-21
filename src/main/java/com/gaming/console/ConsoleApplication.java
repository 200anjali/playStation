package com.gaming.console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Scanner;


@SpringBootApplication
public class ConsoleApplication implements CommandLineRunner {

	@Autowired
	private GameSelector gameSelector;
	@Autowired
	private GameRunner gameRunner;

	public static void main(String[] args) {
		SpringApplication.run(ConsoleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Game selectedGame = (Game) gameSelector.getSelectedGame();
		gameRunner.run(selectedGame);
	}
}

@Component
class GameSelector{
	@Autowired
	private ApplicationContext context;

	public Object getSelectedGame() {
		System.out.println("Select a game:");
		System.out.println("Pacman - 1");
		System.out.println("Mario - 2");
		System.out.println("Temple Run - 3");
		System.out.println("Default - 0");

		System.out.print("Enter the number corresponding to your choice: ");
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		scanner.close();

		return switch (userInput) {
			case 1 -> context.getBean("pacman");
			case 2 -> context.getBean("mario");
			case 3 -> context.getBean("templeRun");
			default -> context.getBean(Game.class);
		};
	}
}
