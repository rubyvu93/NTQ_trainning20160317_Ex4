package ntq.trainning.Ex4;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Hãy nhập tên chuỗi vào màn hình:");
		Scanner scanIn = new Scanner(System.in);
		String StrInput = scanIn.nextLine();
		System.out.println("Chuỗi nhập vào là:");
		System.out.println(StrInput);
		System.out.println("Kết quả sau khi chạy là:");
		StringNoDuplicate.findStringNoDuplicate(StrInput);
	}

}
