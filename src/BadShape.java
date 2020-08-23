// 如果不使用面向抽象编程的方法，通过继承实现各种各样的shape的话，可能会使用switch语句来解决各种不同的shape
//随着shape 种类增加，代码将越来越繁琐，而且每增加一种shape都要修改代码
//而在抽象类的设计模式中，增加一种shape不需要修改抽象类，也不需要修改main方法的代码
public class BadShape {
	private String type;
	private double width;
	private double length;
	private double r;
	
	public double area() {
		switch (type){
			case "Rect":
				return width * length;
			case "Circle":
				return Math.PI * r * r;
			default:
				return 0;
		}
	}
}
