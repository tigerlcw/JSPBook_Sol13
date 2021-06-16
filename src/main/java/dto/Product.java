package dto;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = -4274700572038677000L;

	private String productId; //���� ��ǰID
	private String pname;	// ���� ��ǰ��
	private Integer unitPrice; // ���� ����
	private String author; // �۰�
	private String manufacturer; //���ǻ�
	private String publicationdate; //������
	private String totalpage; //�� ������
	private String description; //���� ����
	private String category; 	
	private long unitsInStock; //���
	private String condition;//�űԵ��� or �߰��� or E-Book
	private String filename;//�̹������ϸ�
	private int quantity;//��ٱ��Ͽ���������

	public Product() {
		super();
	}

	public Product(String productId, String pname, Integer unitPrice) {
		this.productId = productId;
		this.pname = pname;
		this.unitPrice = unitPrice;
	}

	public String getProductId() {
		return productId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}			
	
	public void author(String author) {
		this.setAuthor(author);
	}
	public void publicationdate(String publicationdate) {
		this.setPublicationdate(publicationdate);
	}
	
	public String gettotalpage() {
		return totalpage;
	}
	
	public void settotalpage(String totalpage) {
		this.totalpage = totalpage;
	}


	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublicationdate() {
		return publicationdate;
	}

	public void setPublicationdate(String publicationdate) {
		this.publicationdate = publicationdate;
	}
	
}
