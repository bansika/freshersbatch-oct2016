 class Date {
	private int day;
      	private int month;
	private int year;
	public Date() {
		this.day = 25;
		this.month = 7;
		this.year = 2010;
}
public Date(int day, int month, int year) {
      this.day = day;
      this.month = month;
      this.year = year;
}
public String toString()
{
return this.day+"/"+this.month+"/"+this.year;
}
public static void swap(Date dt[]){
Date temp;
temp=dt[0];
dt[0]=dt[1];
dt[1]=temp;
               
        }
}

public class DateTest {
public static void main(String args[]) {
Date d[]=new Date[2];

d[0] = new Date(17, 4, 1995);
d[1]= new Date(18,4,1995);
System.out.println("date1"+d[0]);
System.out.println("date2"+d[1]);

 Date.swap(d);
System.out.println("date1"+d[0]);
System.out.println("date2"+d[1]);


               

               
    
}
}


