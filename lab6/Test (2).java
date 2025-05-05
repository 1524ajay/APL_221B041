class Test{
	public static void main(String[] args) {
		Offering offering = new Coffee();
		offering = new Gin(offering);
		offering = new IceCream(offering);
		offering = new Rum(offering);
		System.out.println(offering.getName() + " " + offering.getPrice());
	}
}