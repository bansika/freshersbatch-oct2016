abstract class Shapes{
	abstract void draw();
}

class MyPoint extends Shapes{
	void draw(){
		System.out.println("Mypoint.Shape");
	}
}

class MyCube extends Shapes{
	void draw(){
		System.out.println("MyCube.Shape");
	}
}

class MyRect extends Shapes{
	void draw(){
		System.out.println("Myrect.Shape");
	}
}

class MyLine extends Shapes{
	void draw(){
		System.out.println("Myline.Shape");
	}
}

public class Shape{
	public static void main(String args[]){
		Shapes s[] = new Shapes[4];
		s[0] = new MyCube();
		s[1] = new MyRect();
		s[2] = new MyPoint();
		s[3] = new MyLine();
		for(int i= 0 ;i<s.length;i++){
			s[i].draw();
		}
	}
}