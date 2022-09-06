package pojo;

public class Product {
	String prod_id;
	String prod_name;
	String prod_category;
	String prod_price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String prod_id, String prod_name, String prod_category, String prod_price) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_category = prod_category;
		this.prod_price = prod_price;
	}
	
	public String getProductId() {
		return prod_id;
	}

	public void setProductId(String prod_id) {
		this.prod_id = prod_id;
	}

	public String getProductName() {
		return prod_name;
	}

	public void setProductName(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProductCategory() {
		return prod_category;
	}

	public void setProductCategory(String prod_category) {
		this.prod_category = prod_category;
	}

	public String getProductPrice() {
		return prod_price;
	}

	public void setProductPrice(String prod_price) {
		this.prod_price = prod_price;
	}
}
