class Calculation{
	private int number;

	public Calculation(int number){
		this.number = number;
	};

	public int square(){
		return (int)Math.pow(this.number, 2);
	};

	public int cube(){
		return (int)Math.pow(this.number, 3);
	}

	public int gcd(int number1, int number2){
		int temp = number1%number2;
		if(temp != 0)
			return gcd(number2, temp);
		return number2;
	}

	public int lcm(int number1, int number2){
		int gcd = gcd(number1, number2);
		return (number1/gcd)*number2;
	}
}