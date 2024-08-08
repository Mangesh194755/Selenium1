package prac2021;

import com.github.javafaker.Faker;

public class FakerEx1 {

	public static void main(String[] args) {
		
		Faker fake = new Faker();
		
		String cityName = fake.address().city();
		
		System.out.println(cityName);
	}

}
