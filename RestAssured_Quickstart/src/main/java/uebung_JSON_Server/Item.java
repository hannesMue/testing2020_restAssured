package uebung_JSON_Server;
import java.util.Date;

public class Item {
	String itemName;
	String item_id;
	String itemPrice;
	Date itemRelease;
	boolean availableInStock;
	String itemCategorie;
	int id;
	
	public Item() {
		
	}
	public Item(String itemName, String item_id, String itemPrice, Date itemRelease, boolean availableInStock,
			String itemCategorie, int id) {
		
		this.itemName = itemName;
		this.item_id = item_id;
		this.itemPrice = itemPrice;
		this.itemRelease = itemRelease;
		this.availableInStock = availableInStock;
		this.itemCategorie = itemCategorie;
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Date getItemRelease() {
		return itemRelease;
	}
	public void setItemRelease(Date itemRelease) {
		this.itemRelease = itemRelease;
	}
	public boolean isAvailableInStock() {
		return availableInStock;
	}
	public void setAvailableInStock(boolean availableInStock) {
		this.availableInStock = availableInStock;
	}
	public String getItemCategorie() {
		return itemCategorie;
	}
	public void setItemCategorie(String itemCategorie) {
		this.itemCategorie = itemCategorie;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
