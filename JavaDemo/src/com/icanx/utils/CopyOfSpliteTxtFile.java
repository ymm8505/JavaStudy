package com.icanx.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyOfSpliteTxtFile {

	public static void main(String[] args) throws IOException {
		// ����������
		// fis = new FileInputStream("d:\\60.txt");
		int i = 0;
		String WriteFileName = 	WriteFileName = "��" + (i++) + "��";
		File file = new File("d:\\60.txt");
		BufferedReader reader = null;
		
		FileWriter fw = new FileWriter("d:\\" + WriteFileName + ".txt");
		try {
			System.out.println("����Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���У�");
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1;
			// һ�ζ���һ�У�ֱ������nullΪ�ļ�����
			while ((tempString = reader.readLine()) != null) {
//				System.out.println(tempString);
				System.out.println("line " + line + ": " + tempString);
				
				
				if (tempString.trim().length() > 3) {
					if ("###".equals(tempString.trim().substring(0, 3))) {
						fw.flush();
						fw.close();
						WriteFileName = "��" + (i++) + "��";
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

		// Reader r = new FileReader("c:/12����Ѯ�ص��ע��Ʊ�Ƽ�.txt");
		// char c = (char) (r.read());
		// System.out.println(c);
	}

}