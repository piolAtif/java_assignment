class BasicFunction{

	public static void main(String args[]){

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

	};

};