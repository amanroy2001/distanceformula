package codewithaman;
import java.util.Scanner;
public class disbwtwopoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter x1 and y1");
double x1=sc.nextDouble();
double y1=sc.nextDouble();
System.out.println("enter x2 and y2");
double x2=sc.nextDouble();
double y2=sc.nextDouble();
double dis=Math.sqrt((Math.pow(x2-x1, 2))+ (Math.pow((y2-y1), 2)));
System.out.println("hence the distance between points are "+dis);
	}

}
