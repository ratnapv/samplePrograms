package JavaExamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDatafromFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String directory="C:\\Users\\Ratnakumar\\git\\samplePrograms\\SamplePrograms\\SampleTextFiles";

		File file = new File(directory);
		File[] files = file.listFiles();
		for(File f: files){
			//String fileName=f.getName();
			String filePath=f.getAbsolutePath();
			String fileName=f.getPath();
			
			//System.out.println(fileName);
			//System.out.println(filePath);
			//readDataFromFile(filePath);
			ReadDatafromFile rd= new ReadDatafromFile();
			rd.listDirectory(directory, 0);
			
		}

	}


	public static void readDataFromFile(String name) throws IOException
	{
		FileReader fr = new FileReader(name);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line = br.readLine()) != null){
			//process the line
			//System.out.println("Text from file is:"+line);
		}
		br.close();
		fr.close();

	}
	
	public void listDirectory(String directory, int level) {
	    File dir = new File(directory);
	    File[] firstLevelFiles = dir.listFiles();
	    if (firstLevelFiles != null && firstLevelFiles.length > 0) {
	        for (File aFile : firstLevelFiles) {
	            for (int i = 0; i < level; i++) {
	                //System.out.print("\t");
	            }
	            if (aFile.isDirectory()) {
	                //System.out.println("[" + aFile.getName() + "]");
	                listDirectory(aFile.getAbsolutePath(), level + 1);
	            } else {
	                //System.out.println(aFile.getName());
	                System.out.println(aFile.getPath());
	                
	            }
	        }
	    }
	}
}

