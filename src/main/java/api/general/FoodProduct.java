package api.general;

public interface FoodProduct extends Product, Food {
	public default double calories() {
		return weight() * calories_per_100g(); 
	}
}
