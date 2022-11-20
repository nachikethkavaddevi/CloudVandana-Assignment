public class Main
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
	byte[] string = "Hello World".getBytes();
		byte ch = 'o';
		int count = 1;
		int n = (int)string.length;
		for(int i = 0; i < n; i++) {
			if(count > 0) {
				if(string[i] == ch) {
					count--;
				}
				continue;
			} else {
				System.out.print((char)Byte.toUnsignedInt(string[i]));
			}
		}

	}
}
