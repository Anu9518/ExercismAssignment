class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int length = String.valueOf(numberToCheck).length();
		int result = 0;
		int input = numberToCheck;

		while(input>0){
			result += Math.pow( input%10, length);
			input = input/10;
		}

		if(result ==  numberToCheck ){
			return true;
		}
		else{
			return false;
		}
	}

}
