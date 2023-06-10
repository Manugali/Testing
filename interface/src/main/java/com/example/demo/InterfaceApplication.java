package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.game.GameRunner;

@SpringBootApplication
public class InterfaceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(InterfaceApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		//GamingConsole game = new MarioGame();
		//GamingConsole game = new SuperContraGame();
		//GameRunner runner = new GameRunner(game);
		
		runner.runGame();
		
	}

}
