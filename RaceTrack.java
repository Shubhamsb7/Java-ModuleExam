class RaceTrack{
	public static void main (String... args){
		Car c = new Car(2010,"Porsche",25.0);
		System.out.println(c.getYear());
		System.out.println(c.getMake());
		System.out.println(c.getSpeed());
		c.accelerate();
		
	}
}