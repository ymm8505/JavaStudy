import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SpliteTxtFile {

	public static void main(String[] args) throws IOException {
					/*File fileMulu = new File("d:\\替嫁娇妻目录.txt");   // new121
					
			//		把目录准备好
					//用户判断 哪一行是标题的数组
					ArrayList<String> abcMulu = new ArrayList<String>(1470);
					BufferedReader readerMulu = null;
					try {
			//			System.out.println("以行为单位读取文件内容，一次读一整行：");
						readerMulu = new BufferedReader(new FileReader(fileMulu));
						String tempString = null;
						int line = 1;
						String okLengthStr = "";
						// 一次读入一行，直到读入null为文件结束
						while ((tempString = readerMulu.readLine()) != null) {
								abcMulu.add(tempString);
			//				}
						}
//						System.out.println(abcMulu.toString());
						readerMulu.close();
					}catch (IOException e) {
						e.printStackTrace();
					} finally {
						if (readerMulu != null) {
							try {
								readerMulu.close();
							} catch (IOException e1) {
							}
						}
					}*/
////////////////////////////////////////////////目录已准备好/////////////////////////////////////////////////////

		File file = new File("D:\\boss.txt");   // new121
		String WriteFileName = 	WriteFileName = "boss去空格空行";
		BufferedReader reader = null;
		FileWriter fw = new FileWriter("D:\\" + WriteFileName + ".txt");
		try {
//			System.out.println("以行为单位读取文件内容，一次读一整行：");
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1;
			String okLengthStr = "";
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
				System.out.println("line " + line + ": " + tempString);
//				tempString = "<p>"+tempString+"</p>";
//				for(int m =0;m <abcMulu.size();m++){
//					
//						if(tempString.contains(abcMulu.get(m))&& tempString.trim().equals(abcMulu.get(m).toString()) ){
//							
////							tempString = tempString.replace("<p>","").replace("</p>", "").replace("☆、", "").replace("正文", "").trim();
//							tempString = "<h3>"+tempString+"</h3>";
////							String MDian_navPoint = "<navPoint id=\"num_"+(m+1)+"\" playOrder=\""+(m+2)+"\">";
////							String MDian_NavLabel = "<navLabel><text>"+tempString+"</text></navLabel>";
////							String MDian_content = "<content src=\"../ch02.html#qsyfyxf"+(m+1)+"\"/> </navPoint>";
////							System.out.println(MDian_navPoint.concat(MDian_NavLabel).concat(MDian_content));
//								//System.out.println(tempString);
////								String mm = abc.get(m); //001
//								String newP = "<h3 id=\"qsyfyxf"+(m+1)+"\">";
//		//						System.out.println(newP);
//								tempString = tempString.replace("<h3>", newP);
//								System.out.println(tempString);
//								tempString = tempString.replace("<p>", "");
//								tempString = tempString.replace("</p>", "");
////								System.out.println(tempString);
//								//okTitle.add(tempString);
//							}
////					}
//				}
//				tempString = tempString.replace("\\r","");
//				tempString = tempString.replace("\\s","");
				
				if(    (tempString.trim().length()>0) 
					&& !tempString.substring(0, 3).equals("qc:")
					&& !tempString.substring(0, 3).equals("QC：")
					&& !tempString.substring(0, 1).equals("#") 
					&& !tempString.substring(0, 1).equals("*") )
				fw.write(tempString+"\n");
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