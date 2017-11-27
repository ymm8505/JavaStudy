import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SpliteBossFld {

	public static void main(String[] args) throws IOException {
		// //////////////////////////////////////////////目录已准备好/////////////////////////////////////////////////////
		File file = new File("D:\\boss.txt"); // new121
		String WriteFileName  = "boss去空行去注释";
		BufferedReader reader = null;
		FileWriter fw = new FileWriter("D:\\" + WriteFileName + ".txt");
		try {
			// System.out.println("以行为单位读取文件内容，一次读一整行：");
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1;
			String okLengthStr = "";
			String splitStr[] = {};
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
				
				if ((tempString.trim().length() > 0) // 非空行
						&& !tempString.substring(0, 3).equals("qc:") // qc:开头
						&& !tempString.substring(0, 3).equals("QC：") // QC：开头
						&& !tempString.substring(0, 1).equals("#") // #开头
						&& !tempString.substring(0, 1).equals("*")) // *开头
				{
					tempString = tempString.replaceAll("	", " ");
					tempString = tempString.replace("  "," ");
					tempString=tempString.replaceAll("[' ']+"," ");

					splitStr  =tempString.split(" ");
					
					/*for(int i = 0;i<splitStr.length;i++){
						System.out.print(splitStr[i] + "----->");
					}*/
					String temStr = "          ";
					if (splitStr.length>3){
						temStr = splitStr[3];
						temStr = temStr.replace("-", "-          ");
					}else{
						temStr = "  ";
					}
					if (splitStr.length>4){
						temStr += splitStr[4];
					}else{
						temStr = "           "+temStr;
					}
					System.out.println(temStr);
					fw.write(temStr + "\n");
					//System.out.println("line " + line + ": " + tempString);					
				}
				line++;
			}
			fw.flush();
			fw.close();
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
	}
}