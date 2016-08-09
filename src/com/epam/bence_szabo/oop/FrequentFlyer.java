package com.epam.bence_szabo.oop;

public enum FrequentFlyer implements FrequentFlyerProgram {

	OCCASIONAL(0.0, 0), SILVER(0.02, 20000), GOLD(0.03, 50000);

	private final int MIN_MILES;
	private final double discount;

	private FrequentFlyer(double discount, int MIN_MILES) {
		this.MIN_MILES = MIN_MILES;
		this.discount = discount;
	}

	@Override
	public double getDiscount() {
		return discount;
	}

	public boolean eligible(int miles) {
		return miles > MIN_MILES;
	}

	public FrequentFlyer next() {
		FrequentFlyer[] e = values();
		int i = 0;
		while (e[i] != this) {
			i++;
		}
		i++;
		if (i >= e.length) {
			i = e.length - 1;
		}
		return e[i];
	}

	public boolean hasNext() {
		return next() != this;
	}

}
