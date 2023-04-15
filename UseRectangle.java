package javaÊµÑé3°ü2;

public class UseRectangle {
	public static void main(String[] args){
		Rectangle rec=new Rectangle(1.0,2.0,"red");
		System.out.println(rec.getWidth()+" "+rec.getHeight()+" "+rec.getColor());
		System.out.println(rec.getArea());
		rec.setColor("blue");
		rec.setHeight(3.0);
		rec.setWidth(4.0);
		System.out.println(rec.getWidth()+" "+rec.getHeight()+" "+rec.getColor());
		System.out.println(rec.getArea());
	}
}
class Rectangle{
	private double width;
	private double height;
	private String color;
	Rectangle(double width,double height,String color){
		this.width=width;
		this.height=height;
		this.color=color;
	}
	public double getArea(){
		return this.width*this.height;
	}
	public double getWidth(){
		return this.width;
	}
	public double getHeight(){
		return this.height;
	}
	public String getColor(){
		return this.color;
	}
	public void setColor(String color){
		this.color=color;
	}
	public void setWidth(double width){
		this.width=width;
	}
	public void setHeight(double height){
		this.height=height;
	}
}
