class SY2022bit042 {
	public static void main(String[] args) {
		String[] registrations={"2022bit042","2023bcs601","2024bch010","2021bme102","2022bec102","_2021b028"};
		int validRegCount = 0;
		SY2022bit042 valid = new SY2022bit042();
		for(String registrationNo : registrations) {
			validRegCount += valid.getValidRegistrationsCount(registrationNo);
		}
		System.out.println(validRegCount);
	}
	public int getValidRegistrationsCount(String registrationNo) {
		int count=0;
			if(registrationNo.length() == 10) {
				int year= Integer.parseInt(registrationNo.substring(0,4));
				
				if(year >= 2000 && year <= 2024) {
					String dept = registrationNo.substring(4,7);
					String sequence = registrationNo.substring(7,10);
					
					if("bit".equals(dept) && isNumeric(sequence)) {
						count=1;
					}
					else if("bcs".equals(dept) && isNumeric(sequence)) {
						count=1;
					}
					else if("bch".equals(dept) && isNumeric(sequence)) {
						count=1;
					}
					else if("bme".equals(dept) && isNumeric(sequence)) {
						count=1;
					}
					else {
						count=0;
					}
				}
			}
		return count;
	}
	public boolean isNumeric(String string) {
		for(char c : string.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		return true;	
	}
}
