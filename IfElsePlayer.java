import javax.swing.JOptionPane;
public class IfElsePlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String number=JOptionPane.showInputDialog("Enter the number players in the class.");
int player=Integer.parseInt(number);
int groupsize;
if(player<=55&&player>=11){
	groupsize=player/11;
	
}else{groupsize=1;}
JOptionPane.showMessageDialog(null, "There are (is) "+player+" players."+"\nAnd the groupsize is "+groupsize+".");
	}

}
