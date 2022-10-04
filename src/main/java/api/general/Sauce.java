package api.general;

public class Sauce implements FoodProduct {

    public static enum SauceType {
        BURGER, BARBECUE, BEARNAISE;
        // BURGER : 240 kcal / 100g
        // BARBECUE : 130 kcal / 100g
        // BEARNAISE : 550 kcal / 100g
    	private SauceType type;
    	
    }

    private static double BASE_PRICE = 1;

    private SauceType type;
    private double weight;

    public Sauce(SauceType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return BASE_PRICE;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s sauce (%.0fg) -- %.2f€", type, weight(), price());
    }

    //v1
    @Override
	//v1    
    public double calories_per_100g() {
    	double rt = .0;
		switch(type) {
		case BURGER:
			rt = 240;
			break;
		case BARBECUE:
			rt = 130;
			break;
		case BEARNAISE:
			rt = 550;
			break;
		}
		return rt;
    }
    
}
