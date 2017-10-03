package java_example;


public class Product {
	String descr;
	float rate;
	int quantity;
	
	
	
	public Product() {
		descr = "8GB pen drive";
		rate = 825.50f;
		quantity = 12;
	}



	public Product(String descr, float rate, int quantity) {
		//super();
		this.descr = descr;
		this.rate = rate;
		this.quantity = quantity;
	}

	
	float getAmount(){
		float amount = rate * quantity;
		return amount;
	}
	
	float getAmount(int discountInPercentage){
		float amount  = getAmount();
		float discountAmount = amount * discountInPercentage / 100.0f;
		float finalAmount = amount - discountAmount;
		return finalAmount;
	}
	
}
