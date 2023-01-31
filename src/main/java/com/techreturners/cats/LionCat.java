package com.techreturners.cats;

public class LionCat implements Cat {
	
	private static final int AVERAGE_HEIGHT = 1100;
	private static final String SOUND = "Roar!!!!";

	@Override
	public String isAsleep() {
		return null;
	}

	@Override
	public void goToSleep() {
	}

	@Override
	public void wakeUp() {
	}

	@Override
	public String getSetting() {
		return null;
	}

	@Override
	public int getAverageHeight() {
		return AVERAGE_HEIGHT;
	}

	@Override
	public String eat() {
		return SOUND;
	}

}
