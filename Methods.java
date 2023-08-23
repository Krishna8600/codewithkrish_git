class Methods
{
	int a = 100;
	int b = 200;
	
	void sum()//sumission of two numbers
	{
		System.out.println(a+b);
	}
	int sub(int num1, int num2)
	{
		if(num1 > num2)
		{
			return num1 - num2;
		}else
		{
			return num2 - num1;
		}
	}
	void div()
	{
		System.out.println(b/a);
	}
	int mul(int num1, int num2)
	{
		if(num2 > num1)
		{
			return num1*10;
		}else
		{
			return num2*20;
		}
	}
	
	public static void main(String[] args)
	{
		Methods me = new Methods();
		me.sum();
		System.out.println(me.sub(49,90));
		me.div();
		System.out.println(me.mul(76,56));
	}
}
	
	
	
	