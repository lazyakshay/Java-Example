package java_example;

public class MealExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Meal frenchMeal = new Meal();
      frenchMeal.mainCourse = "Burger";
      frenchMeal.sideDish = "french Fries";
      frenchMeal.drink = "Red Wine";
      frenchMeal.price = 225.50f;
      
      
      Meal indianMeal = new Meal();
      indianMeal.mainCourse = "Dal and Bati";
      indianMeal.sideDish  = "Chat Item";
      indianMeal.drink = "Chai";
      indianMeal.price = 555.25f;
      
      System.out.println("French Meal mainCourse is : " + frenchMeal.mainCourse);
      System.out.println("Indian Meal Drink is  : " + indianMeal.drink);
      System.out.println("Indian Meal Price is  : " + indianMeal.price);
     
      
      frenchMeal.displayMeal();
      indianMeal.displayMeal();
      
	}

}
