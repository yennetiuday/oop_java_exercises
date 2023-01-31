package com.techreturners.cats;

public class DomesticCat implements Cat {
	
	private boolean isSleeping;
	private int catSleptCount;
	
	private static final int AVERAGE_HEIGHT = 23;
	private static final String SOUND = "Purrrrrrr";
	private static final String DOMESTIC = "domestic";
	private static final String DEFAULT_MESSAFE = "Cat should be awake by default";
	private static final String CAT_AWAKE_MESSAFE = "Cat should be awake now";
	private static final String CAT_SLEEPING_MESSAFE = "Cat should be snoozing";
	
	public DomesticCat() {
		this.isSleeping = false;;
		this.catSleptCount = 0;
	}

	public boolean isSleeping() {
		return isSleeping;
	}

	public int getCatSleptCount() {
		return catSleptCount;
	}
	
	public String isAsleep() {
		if(isSleeping) return CAT_SLEEPING_MESSAFE;
		else {
			if (catSleptCount==0) return DEFAULT_MESSAFE;
			else return CAT_AWAKE_MESSAFE;
		}
	}

	@Override
	public void goToSleep() {
		isSleeping = true;
		catSleptCount++;
	}

	@Override
	public void wakeUp() {
		isSleeping = false;
	}
	
	@Override
	public String getSetting() {
		return DOMESTIC;
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
