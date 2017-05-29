import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class IrisDataProjectDemo
{
	public static void main(String[] args)
	{
		//Constructors
		IrisDataFileReader fileReader = new IrisDataFileReader();
		LinkedList<IrisData> unsortedList = new LinkedList<IrisData>();
		LinkedList<IrisData> sortedList = new LinkedList<IrisData>();

		//Declaring Linked Lists
		unsortedList = fileReader.createData(unsortedList);
		sortedList = new LinkedList<IrisData>(unsortedList);

		// sort in ascending order
		Collections.sort(sortedList);

		//Print unsorted list
		System.out.println("\n");
		System.out.println("UnSorted List is: ");
		System.out.println(unsortedList);

		//Print sorted list
		System.out.println("\n");
		System.out.println("Sorted List is: ");
		System.out.println(sortedList);
		int i=0;

		//Reading values.txt file
		IrisDataFileReader valueFileReader = new IrisDataFileReader();
		LinkedList<IrisResultObj> unsortedValuesList = new LinkedList<IrisResultObj>();
		unsortedValuesList = valueFileReader.readValues(unsortedValuesList);

		int length = unsortedValuesList.size();
		int[] sort = new int[length];
       		int[] unsort = new int[length];


/* UNOSRTED LIST */

		for(IrisResultObj irisResultObj: unsortedValuesList)
		{
			for(IrisData irisData : unsortedList)
			{
				irisResultObj.setNoOfObjectsAccessedUnSortedList(irisResultObj.getNoOfObjectsAccessedUnSortedList()+1);
				if(irisData.getSepalLength() == irisResultObj.getSepalLength())
				{
					break;
				}
			}
		}


/* SORTED LIST */

		for(IrisResultObj irisResultObj: unsortedValuesList)
		{
			for(IrisData irisData : sortedList)
			{
				irisResultObj.setNoOfObjectsAccessedSortedList(irisResultObj.getNoOfObjectsAccessedSortedList()+1);
				if(irisData.getSepalLength() == irisResultObj.getSepalLength())
				{
					break;
				}
				else if(irisData.getSepalLength() > irisResultObj.getSepalLength())
				{
					break;
				}
			}

//Printing results for each value.

			System.out.println("\n");
			System.out.println(irisResultObj.unsortedString());
			System.out.println(irisResultObj.sortedString());
			unsort[i] = irisResultObj.getNoOfObjectsAccessedUnSortedList();
	        	sort[i] = irisResultObj.getNoOfObjectsAccessedSortedList();
	        	++i;
		}

/* AVERAGE */

		float sumOfunSort=0;
        	float sumOfSort=0;
        	i = 0;

        	while (i < length)
		{
            		sumOfunSort += (float)unsort[i];
            		++i;
        	}

		float unsortAvg = sumOfunSort / (float)length;
		System.out.println("\n");
        	System.out.println("Average no. of objects accessed in UnSorted List: " + unsortAvg);

		i = 0;
        	while (i < length)
		{
            		sumOfSort += (float)sort[i];
            		++i;
        	}

		float sortAvg = sumOfSort / (float)length;
        	System.out.println("Average no. of objects accessed in Sorted list: " + sortAvg);
		System.out.println("\n");
	}

}
