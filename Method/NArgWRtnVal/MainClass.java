class MainClass{
	public static void main(String args[]){
		Demo d1 = new Demo();
		d1.a = 10;
		d1.b = 20;
		int value = d1.add();
		System.out.println(value);
		System.out.println(d1.add());
	}
}