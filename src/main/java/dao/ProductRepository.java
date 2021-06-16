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
		Product phone = new Product("ISBN1234", "2021 해커스 20대기업 인적성 통합 기본서 최신기출유형+실전문제", 21900);
		phone.setDescription("전략적인 학습이 곧 대기업 직무적성검사 합격의 지름길!\r\n"
				+ "20대기업의 최신기출유형 학습부터 실전 대비까지 단 한 권으로 완성!\r\n"
				+ "");
		phone.setCategory("수험서");
		phone.author("해커스 취업교육연구소");
		phone.setManufacturer("챔프스터디");
		phone.setUnitsInStock(10);
		phone.setPublicationdate("2021/03/03");
		phone.settotalpage("156"); 
		phone.setCondition("New");
		phone.setFilename("in.jpg");

		Product notebook = new Product("ISBN1235", "쉽게 배우는 JSP 웹 프로그래밍", 27000);
		notebook.setDescription("단계별로 쇼핑몰을 구현하며 배우는JSP 웹 프로그래밍\r\n"
				+ "\r\n"
				+ "JSP의 이론적 개념 → 기본 실습 → 응용 실습 순의 단계별 학습이 가능하다. 응용 실습이 합쳐져 최종적으로 쇼핑몰 하나를 완성하는 구성이라 배운 내용이 어디에 어떻게 적용되는지 알 수 있다.");
		notebook.setCategory("대학교재");
		notebook.setManufacturer("한빛아카데미");
		notebook.setUnitsInStock(20);
		notebook.setPublicationdate("2021/01/05");
		notebook.settotalpage("636"); 
		notebook.setCondition("Refurbished");
		notebook.author("송미영");
		notebook.setFilename("jsp.jpg");

		Product tablet = new Product("ISBN1236", "이것이 안드로이드다 with 코틀린 안드로이드 입문의 3가지 장벽, 언어+실전+환경 완벽 대응!",34000);
		tablet.setDescription("최신 버전에 맞춰 완벽하게 실습할 수 있는 코틀린 안드로이드 앱 개발 도서!");
		tablet.setCategory("대학교재");
		tablet.setManufacturer("한빛미디어");
		tablet.setPublicationdate("2021/03/07");
		tablet.settotalpage("658"); 
		tablet.setUnitsInStock(25);
		tablet.author("고돈호");
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