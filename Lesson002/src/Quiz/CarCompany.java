package Quiz;

public class CarCompany {
	private CarCompany() {}
	private CarCompany instance = new CarCompany();
	public int carCompanyProducts;
	
	private CarCompany() {this.carCompanyProducts +
	public static CarCompany getInstance(){
		if(instance==null()) {
			instance = new CarCompany();
		}
		return instance;
	}
	
	public void showInfo() {
		System.out.println("회사 총 생산량")
	}
}
}