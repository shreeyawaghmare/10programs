
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year = 2020;
boolean leap = false;
//dividing the year by 4
if (year % 4 == 0) {
	
	
	
//if the year is century 
	if (year % 100 == 0) {
	
	//if the year is divided by 400
		// then it is a leap year
		if (year % 400 == 0)
			leap = true;
		else 
			leap = false;
	}
	//if the year is not century
	else leap = true;
	
}
else leap = false;
if(leap)
	System.out.println(year + " Is a leap year.");
else 
	System.out.println(year + " Is not a leap year.");

	}

}
