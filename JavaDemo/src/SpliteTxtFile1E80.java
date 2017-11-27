import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SpliteTxtFile1E80 {

	public static void main(String[] args) throws IOException {
		// 创建流对象
		// fis = new FileInputStream("d:\\60.txt");
		int i = 0;
		String WriteFileName = 	WriteFileName = "第newText章";
		File file = new File("d:\\newText.txt");
		BufferedReader reader = null;
		FileWriter fw = new FileWriter("d:\\" + WriteFileName + ".txt");
		
		
		ArrayList<String> abc = new ArrayList<String>(100);
		
		ArrayList<String> okTitle = new ArrayList<String>(100);
		for(int ii = 1 ; ii < 100; ii ++){
			if(ii<10){
				abc.add("00"+ii);
			}else{
				abc.add("0"+ii);
			}
		}
		//System.out.println(abc.toString());
		try {
//			System.out.println("以行为单位读取文件内容，一次读一整行：");
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1;
			String okLengthStr = "";
			// 一次读入一行，直到读入null为文件结束
			while ((tempString = reader.readLine()) != null) {
//				System.out.println(tempString);
//				System.out.println("line " + line + ": " + tempString);
				for(int m =0;m <abc.size();m++){
//					if(tempString.length()>13){
						if(tempString.contains(abc.get(m))){
							tempString = tempString.replace("<p>","").replace("</p>", "").replace("☆、", "").trim();
							tempString = "<p>"+tempString+"</p>";
							
							//String MDian_navPoint = "<navPoint id=\"num_"+tempString.substring(0, 3)+"\" playOrder=\""+(1+Integer.parseInt(tempString.substring(0, 3)))+"\">";
							//String MDian_NavLabel = "<navLabel><text>"+tempString+"</text></navLabel>";
							//String MDian_content = "<content src=\"../ch02.html#jxwy"+tempString.substring(0, 3)+"\"/> </navPoint>";
							
							//System.out.println(MDian_navPoint.concat(MDian_NavLabel).concat(MDian_content));
							
							
							
								//System.out.println(tempString);
								String mm = abc.get(m); //001
								String newP = "<p id=\"jxwy"+mm+"\">";
		//						System.out.println(newP);
								tempString = tempString.replace("<p>", newP);
								tempString = tempString.replace("p", "h3");
//								System.out.println(tempString);
								okTitle.add(tempString);
							}
//					}
				}
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
		//System.out.println(okTitle.toString());
		 
		 
		 
		 
	}

}