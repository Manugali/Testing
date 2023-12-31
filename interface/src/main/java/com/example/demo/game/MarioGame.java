package com.example.demo.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {
	
	@Override
	public void up() {
		System.out.println("Jump");
	}
	@Override
	public void down() {
		System.out.println("Go in Hole");
	}
	@Override
	public void left() {
		System.out.println("Backward");
	}
	@Override
	public void right() {
		System.out.println("Forward");
	}

}
