package introduction;

import java.util.Date;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int digitCount = 0;
        int alphabetCount = 0;
		String value="sairamttttr7878";
		for (char c : value.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            } else if (Character.isLetter(c)) {
                alphabetCount++;
            }
        }
		System.out.println(digitCount+" "+alphabetCount);
		if(digitCount>= 8 || alphabetCount>=11)
		{
			System.out.println("not valid");
		}
		else {
			System.out.println("valid");
		}

	}

}
