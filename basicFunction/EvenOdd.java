class EvenOdd {
	public static boolean isEven(int number){
		return (number%2 == 0);
	};

	public static boolean isOdd(int number){
		boolean odd = !(isEven(number));
		return odd;
	};

	public static void printEven(boolean b, int num){
		System.out.println("Is "+num+" number is even : "+b);
	};

	public static void printOdd(boolean b, int num){
		System.out.println("Is "+num+" number is odd : "+b);
	};
}