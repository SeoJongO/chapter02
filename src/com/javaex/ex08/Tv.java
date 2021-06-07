package com.javaex.ex08;

public class Tv {
	// 필드
	private int channel;
	private int volume;
	private boolean power;

	// 생성자
	public Tv() {

	}

	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	// 게터
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	// 일반

	// power
	public void power(boolean on) {
		if (on == true) {
			this.power = true;
		} else {
			this.power = false;
		}
	}

	// channel
	public void channel(int channel) {
		this.channel = channel;
		if (1 > channel) {
			this.channel = 1;
		} else if (255 < channel) {
			this.channel = 255;
		} else {
			this.channel = channel;
		}
	}

	public void channel(boolean up) {
		if (up == true) {
			this.channel++;
		} else {
			this.channel--;
		}
		if (1 > channel) {
			this.channel = 1;
		} else if (255 < channel) {
			this.channel = 255;
		}
	}

	// volume
	public void volume(int volume) {
		this.volume = volume;
		if (0 > volume) {
			this.volume = 0;
		} else if (100 < volume) {
			this.volume = 100;
		} else {
			this.volume = volume;
		}
	}

	public void volume(boolean up) {
		if (up == true) {
			this.volume++;
		} else {
			this.volume--;
		}
		if (0 > volume) {
			this.volume = 0;
		} else if (100 < volume) {
			this.volume = 100;
		}
	}

	// status
	public void status() {
		System.out.println("채널: " + channel);
		System.out.println("음량: " + volume);
		System.out.println("전원: " + power);
		System.out.println("============");
	}

}
