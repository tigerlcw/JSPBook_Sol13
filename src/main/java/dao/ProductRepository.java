package dao;

import java.util.ArrayList;
import dto.Product;


public class ProductRepository {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();

	public static ProductRepository getInstance(){
		return instance;
	} 

	public ProductRepository() {
		Product phone = new Product("ISBN1234", "2021 ��Ŀ�� 20���� ������ ���� �⺻�� �ֽű�������+��������", 21900);
		phone.setDescription("�������� �н��� �� ���� ���������˻� �հ��� ������!\r\n"
				+ "20������ �ֽű������� �н����� ���� ������ �� �� ������ �ϼ�!\r\n"
				+ "");
		phone.setCategory("���輭");
		phone.author("��Ŀ�� �������������");
		phone.setManufacturer("è�����͵�");
		phone.setUnitsInStock(10);
		phone.setPublicationdate("2021/03/03");
		phone.settotalpage("156"); 
		phone.setCondition("New");
		phone.setFilename("in.jpg");

		Product notebook = new Product("ISBN1235", "���� ���� JSP �� ���α׷���", 27000);
		notebook.setDescription("�ܰ躰�� ���θ��� �����ϸ� ����JSP �� ���α׷���\r\n"
				+ "\r\n"
				+ "JSP�� �̷��� ���� �� �⺻ �ǽ� �� ���� �ǽ� ���� �ܰ躰 �н��� �����ϴ�. ���� �ǽ��� ������ ���������� ���θ� �ϳ��� �ϼ��ϴ� �����̶� ��� ������ ��� ��� ����Ǵ��� �� �� �ִ�.");
		notebook.setCategory("���б���");
		notebook.setManufacturer("�Ѻ���ī����");
		notebook.setUnitsInStock(20);
		notebook.setPublicationdate("2021/01/05");
		notebook.settotalpage("636"); 
		notebook.setCondition("Refurbished");
		notebook.author("�۹̿�");
		notebook.setFilename("jsp.jpg");

		Product tablet = new Product("ISBN1236", "�̰��� �ȵ���̵�� with ��Ʋ�� �ȵ���̵� �Թ��� 3���� �庮, ���+����+ȯ�� �Ϻ� ����!",34000);
		tablet.setDescription("�ֽ� ������ ���� �Ϻ��ϰ� �ǽ��� �� �ִ� ��Ʋ�� �ȵ���̵� �� ���� ����!");
		tablet.setCategory("���б���");
		tablet.setManufacturer("�Ѻ��̵��");
		tablet.setPublicationdate("2021/03/07");
		tablet.settotalpage("658"); 
		tablet.setUnitsInStock(25);
		tablet.author("��ȣ");
		tablet.setCondition("Old");
		tablet.setFilename("ko.jpg");

		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
	
	public Product getProductById(String productId) {
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
	
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
}