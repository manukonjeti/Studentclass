package mypackage;
class student1{
String studentname;
int rollno;
public String averageMarks;
double marks(double...a ) {
	double total=0;
	for(double x: a) {
	 total += x;
//return total;
	}
	return total;
}
double averageMarks(double a, double b) {
		double c=(a+b)/2;
		return c;
	}

}

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 s1=new student1();
		s1.rollno=38;
		s1.studentname="Manisha";
		s1.averageMarks(50.23, 50.22);
		double Mark=s1.marks(55.44,33.22,23.2,34.23,22.43);
		System.out.println(Mark);
		System.out.println(s1.studentname +"  "+s1.averageMarks(50.23,50.22)  );
		student1 s2=new student1();
		s2.rollno=39;
		s2.studentname="happy";
		s2.averageMarks(52.23, 45.22);
		System.out.println(s2.studentname +"  "+s2.averageMarks(50.23,50.22)  );
	}

}
