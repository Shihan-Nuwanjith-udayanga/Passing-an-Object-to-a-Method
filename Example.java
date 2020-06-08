import java.util.*;
class Box{
	double length;
	double height;
	double width;
	
	public void printVolume(){
		double volume=length*width*height;
		System.out.println("Volume of the Box : "+volume);
	}
	public void setSize(Box b){
		setSize(b.length,b.width,b.height);
	}
	public void setSize(double length,double width,double height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
}
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input length : ");
		double length=input.nextDouble();
		System.out.print("Input width : ");
		double width=input.nextDouble();
		System.out.print("Input height : ");
		double height=input.nextDouble();
		System.out.println();
		
		Box b1=new Box();
		b1.setSize(length,width,height);
		b1.printVolume();
		
		Box b2=new Box();
		b2.printVolume();
		
		b2.setSize(b1);
		b2.printVolume();
	}
}
		
