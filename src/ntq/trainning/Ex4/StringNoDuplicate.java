package ntq.trainning.Ex4;

public class StringNoDuplicate {
	
	/**
	 * @param inputString
	 * @return
	 */
	public static String findStringNoDuplicate(String inputString) {
		String result = "";
		
		if (inputString.length() > 1) {
			char head = inputString.charAt(0);
			char last = inputString.charAt(inputString.length() - 1);
			if (inputString.charAt(1) != head) {
				result = result + head;
			}
			
			for (int i = 1; i < inputString.length() - 1; i++) {
				char n = inputString.charAt(i);
				char n0 = inputString.charAt(i - 1);
				char n2 = inputString.charAt(i + 1);
				
				if ((n != n0 && n != n2)) {
					result = result + inputString.charAt(i);
				} else if ((n == n0 && result.length() != 0) || (n == n2 && result.length() != 0)) {
					break;
				}
			}
			
			char n3 = inputString.charAt(inputString.length() - 2);
			if (result.length() == 0) {
				if (n3 != last) {
					result = result + last;
				} else {
					System.out.println("Không có chuỗi ký tự nào liền nhau mà không bị duplicate!!!");
				}
			} else {
				char n4 = result.charAt(result.length()-1);
				if ((n3 != last) && (n4 == n3)) {
					result = result + last;
				}
			}
		} else if (inputString.length() == 1) {
			result = result + inputString;
		} else {
			System.out.println("Chuỗi nhập vào không có ký tự nào!!!");
		}
		
		System.out.println(result);
		return result;
	}
}
