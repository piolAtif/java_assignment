class ForEvenOdd{
	public static void printEvenOdd(){

	//=========================for even or odd=======================================//
		EvenOdd.printEven(EvenOdd.isEven(2), 2);
		EvenOdd.printOdd(EvenOdd.isOdd(3), 3);

	//=======================for notEven and Odd==================================//
		EvenOdd.printEven(EvenOdd.isEven(71), 71);
		EvenOdd.printOdd(EvenOdd.isOdd(23), 23);

	//=======================for Even and notOdd==================================//
		EvenOdd.printEven(EvenOdd.isEven(70), 70);
		EvenOdd.printOdd(EvenOdd.isOdd(24), 24);

	//=======================for notEven and notOdd==================================//
		EvenOdd.printEven(EvenOdd.isEven(71), 71);
		EvenOdd.printOdd(EvenOdd.isOdd(24), 24);

	}
}

class BasicFunction{
	public static void main(String args[]){

		ForEvenOdd.printEvenOdd();

		Calculation cal = new Calculation(4);
		int square = cal.square();
		System.out.println("Square of 4 is : "+square);

		int cube = cal.cube();
		System.out.println("Cube of 4 is : "+cube);

		int gcdNumber = cal.gcd(45, 25);
		System.out.println(gcdNumber+" gcdNumber should be equal to 5");

		int lcmNumber = cal.lcm(36, 16);
		System.out.println(lcmNumber+" lcmNumber should be equal yo 144");
	};
};