package datastructure;
/*
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.Stack;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		//String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		/*BufferedReader brf = null;
		FileReader fr = null;
		String fileText = "";

		try {
		//	brf = new BufferedReader(new FileReader(textFile));
			fr = new FileReader(textFile);

		}
		catch(FileNotFoundException e){
			e.printStackTrace();

		}
		try {
			br = new BufferedReader(fr);
			String data ="";
			while ((data = brf.readLine()) != null)
			{
				System.out.println(data);
				fileText += data;
			}
		}
		//String text;
		//while ((text = brf.readLine())!=null)
		//{
			//System.out.println(text);
		//}
        Stack<String> wrdMap = new Stack<String>();
		String[] splitWords = textFile.split(" ");

		for (String word : splitWords)
		{
			Integer count = wrdMap.indexOf(splitWords);

			if(count == null)
			{
				count = 0;
			}
			wrdMap.add(word);
		}
		wrdMap.push(textFile);
		System.out.println(wrdMap);

	}

}
*/