package ipcutter;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		IPCutter obj = new IPCutter("196.0.0.1");
		int[] result = obj.getIpLst();
		for(int num : result) {
			System.out.println(num);
		}
		

	}

}
