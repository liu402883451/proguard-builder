package liu;
import java.io.FileWriter;
public class Proguard {

	private static final int count = 3000;
	public static final String[] chars = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e",
			"f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
			"V", "W", "X", "Y", "Z" };

	public static String getProString() {
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < count; i++) {
			int num = (int) (Math.random() * 5 + 5);
			for (int j = 0; j < num; j++) {
				int num2 = (int) (Math.random() * 62);
				stringBuffer.append(chars[num2]);
			}
			stringBuffer.append("\n");
		}
		return stringBuffer.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getContextClassLoader().getResource("").getPath());
		
		FileWriter writer;
        try {
            writer = new FileWriter(Thread.currentThread().getContextClassLoader().getResource("").getPath() + "proguard-text.txt");
            writer.write(getProString());
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
