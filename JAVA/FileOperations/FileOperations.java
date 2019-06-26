import java.io.*;
class FileOperations
{
	public static void main(String[] args)throws IOException 
	{
		//creating object for fileReader, BufferedReader class
		//Read data from a.txt
		FileReader fr=new FileReader("a.txt");
		BufferedReader br=new BufferedReader(fr);
		//data is a string to store the entire data of file
		//s is a string that stores one line of file only
		String data="",s="";
		//Iterate until file ends
		while((s=br.readLine())!=null)
		{
			//copy s to data and add new line at the end
			data = data + s +"\n";
		}
		//Eliminate last new line character
		data = data.substring(0, data.length() - 1);
		//close the fileReader, BufferedReader objects
		br.close();
		fr.close();
		//create objects for FileWriter, BufferedWriter class
		//write data onto b.txt
		FileWriter fw = new FileWriter("b.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		//Write data onto text file
		bw.write(data);
		//close the FileWriter, BufferedWriter objects
		bw.close();
		fw.close();
	}
}