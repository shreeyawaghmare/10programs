
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number = 123, originalNumber, remainder, result = 0;
originalNumber = number;
while (originalNumber !=0)
{
	remainder = originalNumber % 10;
	result += Math.pow(remainder, 5);
	originalNumber /= 10;
}
if(result == number)
	System.out.println(number + " Is an armstrong no. ");
else 
	System.out.println(number + " Is not an armstrong no. ");

}
	}


