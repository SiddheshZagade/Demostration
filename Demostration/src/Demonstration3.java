import javax.swing.Box;

class Circle3 {
	
double x,y;
double r;
double circumference(){
	return 2*3.14159*r;
}
 double area (){
	 return(22/7)*r*r;
 }
 }

class box{
	double width ;
	double height;
	double depth;
	double voulme;
	double area(){
		double a;
		a = (width*height*depth*width*depth)*2;
		return a;
	}
	
	double volume(){
		double v;
		v= width*height*depth;
		return v;
		
	}
	
	class Demonstration3 {
		public static void main (String args[]){
			
			Circle3 c = new Circle3();
			Box b = new Box b;
			
			c.x=3.0;c.y=4.0;c.r=5.0;
			b.width = 3.0;b.height=4.0;c.r=5.0;
			
			System.out.println("Circumference Circle"+c.circumference());
			System.out.println("Area Circle"+c.area());
			System.out.println("Area of box"+b.area());
			System.out.println("Volume of box"+b.volume());
				
		}
	}
}