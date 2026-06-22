class p20
{
	public static void main(String[] args) 
	{
		int num =234;
<<<<<<< HEAD
		int temp = num;
		int rev = 0;
		while (temp != 0)
		{
			rev = (rev * 10) + (temp % 10);
			temp/=10;
=======
		temp = num;
		rev = 0;
		while (temp != 0)
		{
			rev = (0 * 10) + (temp % 10);
			num+=10
>>>>>>> book
		}
		System.out.println("reverse "+rev);
	}
}
