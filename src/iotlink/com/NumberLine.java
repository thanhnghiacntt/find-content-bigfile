package iotlink.com;

public class NumberLine {
	private int length;
	private int count;
	private String[] array;
	public NumberLine(int num) {
		length = num;
		array = new String[length];
		count = 0;
	}
	
	public void push(String value) {
		array[count] = value;
		count++;
		if(count >= length) {
			count = 0;
		}
	}
	
	public String toString() {
		String str = "";
		for (String string : array) {
			str += string + "\n";
		}
		return str;
	}
	
}
