package hw2;

public class Category {
 
	int categoryId;
	String categoryName;
	
	public Category(){
		categoryId = 0;
		categoryName = null;
		}
	
	public Category(int categoryId , String categoryName) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
}
