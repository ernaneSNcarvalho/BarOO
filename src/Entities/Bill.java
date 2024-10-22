package Entities;

public class Bill {
	private char gender;
	private int beer;
	private int barbecue;
	private int softDrink;
	
	public Bill() {
	}

	public Bill(char gender, int beer, int barbecue, int softDrink) {
		this.gender = gender;
		this.beer = beer;
		this.barbecue = barbecue;
		this.softDrink = softDrink;
	}

	public char getGender() {
		return gender;
	}

	public int getBeer() {
		return beer;
	}

	public int getBarbecue() {
		return barbecue;
	}

	public int getSoftDrink() {
		return softDrink;
	}
	
	public double feeding() {
		return beer * 5.00 + softDrink * 3.00 + barbecue * 7.00;
	}
	
	public double ticket() {
		if(gender == 'M') {
			return 10.00;
		}else {
			return 8.00;
		}
	}

	public double cover() {
		if(feeding() <= 30.0) {
			return 4.00;
		}else {
			return 0.0;
		}
	}
	
	public double total() {
		return feeding() + ticket() + cover();
	}

}
