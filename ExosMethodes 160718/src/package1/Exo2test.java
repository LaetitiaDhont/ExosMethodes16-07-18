package package1;

public class Exo2test {
//�crire une m�thode qui calcule la moyenne de trois nombres impairs.
// Je commence par d�clarer mes variables avec trois nombres impairs.
// Je d�clare aussi ma variable qui contiendra ma moyenne en double car elle est potentiellement d�cimale.
	
	public static double computeAverage() {
	
	double number1 = 3;
	double number2 = 15;
	double number3 = 49;
	
	// Je veux la moyenne de ses trois variables, donc j'effectue mon addition.
	
	double sum = number1 + number2 + number3;
	double divide = sum / 3;
	return divide;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("La moyenne c'est " + " " + computeAverage());
	}

}
