import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class IrisDataFileReader
{

	public LinkedList<IrisData> createData(LinkedList<IrisData> unsortedList)
	{

		String csvFile = "IRIS.txt";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		IrisData irisDataObj = null;

		try
		{

			br = new BufferedReader(new FileReader(csvFile));

			while ((line = br.readLine()) != null)
			{
				// use comma as separator
				String[] lineData = line.split(cvsSplitBy);

				irisDataObj = new IrisData(Float.valueOf(lineData[0]), Float.valueOf(lineData[1]),
						Float.valueOf(lineData[2]), Float.valueOf(lineData[3]), lineData[4]);
				unsortedList.add(irisDataObj);
			}
		}

		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

		catch (IOException e)
		{
			e.printStackTrace();
		}

		finally
		{
			if (br != null)
			{
				try
				{
					br.close();
				}

				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		System.out.println("Done");
		return unsortedList;
	}

	public LinkedList<IrisResultObj> readValues(LinkedList<IrisResultObj> unsortedList)
	{
		String csvFile = "values.txt";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		IrisResultObj irisResultObj = null;

		try
		{

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null)
			{
				// use comma as separator
				String[] lineData = line.split(cvsSplitBy);

				for(int i=0; i<lineData.length; i++ )
				{

				irisResultObj = new IrisResultObj(Float.valueOf(lineData[i]));
				unsortedList.add(irisResultObj);

				}

			}
		}

		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

		catch (IOException e)
		{
			e.printStackTrace();
		}

		finally
		{
			if (br != null)
			{
				try
				{
					br.close();
				}

				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		System.out.println("Done");
		return unsortedList;
	}

}
