import java.util.Scanner;

public class PointsInsideFigure {
	
	double xValue;
	double yValue;
	
	public  PointsInsideFigure()
	{
		String input;
		Scanner sc=new Scanner(System.in);
		
		input=sc.nextLine();
		String[] inputs=input.split(" ");
		xValue= Double.parseDouble(inputs[0]);
		yValue=Double.parseDouble(inputs[1]);
		
	}
	
	

	public static void main(String[] args) {
		
			PointsInsideFigure p=new PointsInsideFigure();	
			//p.pointInput();
				
		//double xValue=Double.parseDouble(pointInput()[0]);
		//double yValue=Double.parseDouble(pointInput()[1]);
		
		boolean door= p.xValue>17.5 && p.xValue <20 && p.yValue >8.5 && p.yValue <=13.5;
		
		boolean house = p.xValue>=12.5 && p.xValue<=22.5 && p.yValue>=6 && p.yValue<=13.5;
		
				
		if(house && !door )
		{System.out.println("Inside");}
		else
		{System.out.println("Outside");}

	}

}
