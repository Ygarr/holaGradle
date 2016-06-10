package hola;

import org.joda.time.LocalTime;

public class HolaMundo {
	public static void main(String[] args) {


		LocalTime currentTime = new LocalTime();
		System.out.println("It is "+ currentTime +" o`clock");


		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHola());
	}
}

