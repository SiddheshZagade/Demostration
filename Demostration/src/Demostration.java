	
	class Circle {
		
		double x,y;
		double r;
		
		double circumference() {
			return (22/7)*r*r;
		}
		
		double area(){
			return (22/7)*r*r;
		
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Circle c = new Circle () ;
c.x = 0.0;
c.y =0.0;
c.r = 5.0;
System.out.println("Circumference"+c.circumference());
System.out.println("Area"+c.area());
	}

	
