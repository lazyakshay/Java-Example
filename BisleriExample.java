package java_example;

public class BisleriExample {

	public static int getTotalVolume(BisleriPack bPacks[]){
		int vol=0;
		for(BisleriPack bp: bPacks){
			vol += bp.getQuantity()* ((bp.getBottleType().getVolume()));
		}
		return vol;
	}
	
	public static float getTotalCost(BisleriPack bPacks[]){
		float cost=0.0f;
		for(BisleriPack bp: bPacks){
			cost += bp.getQuantity()* ((bp.getBottleType().getCost()));
		}
		return cost;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BisleriPack packs[] = new BisleriPack[3];
		BisleriBottle medium = new MediumBottle();
		BisleriBottle large = new LargeBottle();
		//BisleriBottle small = new SmallBottle();
		
		packs[0] = new BisleriPack();
		packs[1] = new BisleriPack(2, 15, medium);
		packs[2] = new BisleriPack(3, 30, large);
		
		int totalVolume = getTotalVolume(packs);
		float totalCost = getTotalCost(packs);
		
        System.out.println("Total Volume: "+ totalVolume+"ml");
        System.out.println("Total Cost: $"+ totalCost);
        
	}

}
