import javax.swing.JOptionPane;
public class IfElseTrip {
public static void main(String [] args){
	String number=JOptionPane.showInputDialog("Enter the number of people that are going to the trip.");
	int numpeople=Integer.parseInt(number);
	int groupsize = 0;
	if(numpeople>10){
		groupsize=numpeople/2;
	
	}else if (numpeople>=3){
		groupsize=numpeople/3;
	}else 		{JOptionPane.showMessageDialog(null, "The number of people has to be at least 3.");
	return;}

 JOptionPane.showMessageDialog(null, "There are "+numpeople+" people going to the trip."+"\nAnd the groupzise is "+groupsize+".");
}
}
