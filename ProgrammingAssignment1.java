class SY2022bit042 {
	public static void main(String[] args) {
		String[] registrations={"2022bit042","2023bcs601","2024bch010","2021bme102","2022bec102","_2021b028"};
		int validRegCount = 0;
		SY2022bit042 valid = new SY2022bit042();
		for(String registrationNo : registrations) {
			validRegCount += valid.getValidRegistrationsCount(registrationNo);
		}
	}
	public int getValidRegistrationsCount(String registrationNo) {
		int count=0;
			if(registrationNo.length() = 10) {
				String first4chars = registrationNo.substring(0,3);
				String last3chars = regitrationNo.substring(7,9);
				
				if(isNumeric(first4hcars) && isNumeric(last3chars)) {
					String middle3chars = registrationNo.substring(4,6);
					
					if(isAlphabetic(middle3chars)){
						count=1;
					}
				}	
			}
		return count;
	}
	public int isNumeric(String string) {
		int count=0;
		for(char c : string.toCharArray()) {
			if(Character.isDigit(c)) {
				count++;
			}
		}
		return count;	
	}
	public int isAlphabetic(String string) {
		int count=0;
		for(char c : string.toCharArray()) {
			if(Character.isLetter(c)) {
				count++;
			}
		}
		return count;	
	}
}
