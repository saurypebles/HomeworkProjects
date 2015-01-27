import java.util.Scanner;

public class PointsInsideFigure {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				
		double xValue=sc.nextDouble();
		double yValue=sc.nextDouble();
		
		boolean door= xValue>17.5 && xValue <20 && yValue >8.5 && yValue <=13.5;
		
		boolean house = xValue>=12.5 && xValue<=22.5 && yValue>=6 && yValue<=13.5;
		
		
		
		if(house && !door )
		{System.out.println("Inside");}
		else
		{System.out.println("Outside");}

	}

}
