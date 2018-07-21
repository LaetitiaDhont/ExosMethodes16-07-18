package package1;

public class Exo1test {
	// Écrire une méthode qui trouve le plus petit nombre parmi 15 nombres.
	// Je commence par déclarer mes quinze variables
	// Mes variables doivent être dans une seule méthode, donc je déclare ma méthode dès le début.
	// Mon plus petit nombre est une variable de type int, donc ma méthode sera forcément de type int.
	
	public static int smallestNumber() {
		
	int number1 = 62;
	int number2 = 23;
	int number3 = 32;
	int number4 = 4;
	int number5 = 13;
	int number6 = 41;
	int number7 = 123;
	int number8 = 78;
	int number9 = 26;
	int number10 = 37;
	int number11 = 20;
	int number12 = 52;
	int number13 = 63;
	int number14 = 57;
	int number15 = 1;
	int smallestNumber;
	
	// Je veux comparer mes variables entre elles, donc je commence avec ma méthode if pour les comparer. 
	
	if (number1 < number2) {
		smallestNumber = number1;
	}
	
	// Si le number1 est inférieur au number2, alors le plus petit nombre c'est le number1.
	// Sinon mon plus petit nombre c'est le number2.
	// Ma variable smallestNumber va stocker l'une de de ses deux variables.
	// Dans ce cas ci par exemple, number1 = 62 et number2 = 23 donc ma smallestNumber va garder number2.
	
	else {
		smallestNumber = number2;
		
	}
	
	/* Notre comparaison va comparer le number1 ou le number2 en fonction de celui qui est le plus petit 
	 * , et il va le comparer à tout les autres.
	 */
	
	if (number3 < smallestNumber) {
		smallestNumber = number3;
	}
	
	if (number4 < smallestNumber) {
		smallestNumber = number4;
	}
	
	if (number5 < smallestNumber) {
		smallestNumber = number5;
	}
	
	if (number6 < smallestNumber) {
		smallestNumber = number6;
	}
	
	if (number7 < smallestNumber) {
		smallestNumber = number7;
	}
	
	if (number8 < smallestNumber) {
		smallestNumber = number8;
	}
	
	if (number9 < smallestNumber) {
		smallestNumber = number9;
	}
	
	if (number10 < smallestNumber) {
		smallestNumber = number10;
	}
	
	if (number11 < smallestNumber) {
		smallestNumber = number11;
	}
	
	if (number12 < smallestNumber) {
		smallestNumber = number12;
	}
	
	if (number13 < smallestNumber  ) {
		smallestNumber = number13;
	}
	
	if (number14 < smallestNumber) {
		smallestNumber = number14;
	}
	
	if (number15 < smallestNumber) {
		smallestNumber = number15;
	}
	
	// On veut afficher le plus petit nombre, donc notre méthode doit retourner au type int smallestNumber.
	
	return smallestNumber;
	
	}
	
	// J'appelle ma méthode pour afficher mon plus petit nombre.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Le plus petit nombre c'est" + " " + smallestNumber());

	}

}
