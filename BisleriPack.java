package java_example;

public class BisleriPack {
	private int batchNo, quantity;
	private BisleriBottle bottleType;
	
	public BisleriPack() {
		batchNo = 1;
		quantity = 20;
		bottleType = new SmallBottle();
	}

	public BisleriPack(int batchNo, int quantity, BisleriBottle bottleType) {
		super();
		this.batchNo = batchNo;
		this.quantity = quantity;
		this.bottleType = bottleType;
	}

	public int getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BisleriBottle getBottleType() {
		return bottleType;
	}

	public void setBottleType(BisleriBottle bottleType) {
		this.bottleType = bottleType;
	}
	
	
	

}
