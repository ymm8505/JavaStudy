import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyOfSpliteTxtFile {

	public static void main(String[] args) throws IOException {
		// 创建流对象
		// fis = new FileInputStream("d:\\60.txt");
		int i = 0;
		String WriteFileName = 	WriteFileName = "第" + (i++) + "章";
		File file = new File("d:\\60.txt");
		BufferedReader reader = null;
		
		FileWriter fw = new FileWriter("d:\\" + WriteFileName + ".txt");
		try {
			System.out.println("以行为单位读取文件内容，一次读一整行：");
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1;
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
//				System.out.println(tempString);
				System.out.println("line " + line + ": " + tempString);
				
				
				if (tempString.trim().length() > 3) {
					if ("###".equals(tempString.trim().substring(0, 3))) {
						fw.flush();
						fw.close();
						WriteFileName = "第" + (i++) + "章";
						fw = new FileWriter("d:\\" + WriteFileName + ".txt");
					}
				}
				
				fw.write(tempString+"\n");
				line++;
				
			}
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}

		// Reader r = new FileReader("c:/12月中旬重点关注股票推荐.txt");
		// char c = (char) (r.read());
		// System.out.println(c);
	}

}