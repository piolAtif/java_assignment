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
}