import java.util.Scanner;

public class PointsInsideHouse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				
		double xValue=sc.nextDouble();
		double yValue=sc.nextDouble();
		
		boolean door= xValue>17.5 && xValue <20 && yValue >8.5 && yValue <=13.5;
		
		boolean house = xValue>=12.5 && xValue<=22.5 && yValue>=6 && yValue<=13.5;
		
		boolean roofl= xValue>=12.5 && xValue<=17.5 && yValue<=8.5 && xValue+yValue>=21;
		
		boolean roofr= xValue<=22.5 && xValue>=17.5 && yValue<=8.5 && xValue+yValue>=14;
		
		if(house && !door || roofl || roofr )
		{System.out.println("Inside");}
		else
		{System.out.println("Outside");}

	}

}
