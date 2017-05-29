class IrisResultObj
{
	public float getSepalLength()
	{
		return sepalLength;
	}

	public void setSepalLength(float sepalLength)
	{
		this.sepalLength = sepalLength;
	}

	float sepalLength;
	int noOfObjectsAccessedSortedList=0;
	int noOfObjectsAccessedUnSortedList=0;

	public IrisResultObj(float sepalLength)
	{
		this.sepalLength = sepalLength;
	}

	/* FOR SORTED LIST */

	public int getNoOfObjectsAccessedSortedList()
	{
		//System.out.println("No. of objects accessed in sorted list: "+noOfObjectsAccessedSortedList);
		return noOfObjectsAccessedSortedList;
	}

	public void setNoOfObjectsAccessedSortedList(int noOfObjectsAccessedSortedList)
	{
		this.noOfObjectsAccessedSortedList = noOfObjectsAccessedSortedList;
	}

	/* FOR UNSORTED LIST */

	public int getNoOfObjectsAccessedUnSortedList()
	{
		return noOfObjectsAccessedUnSortedList;
	}

	public void setNoOfObjectsAccessedUnSortedList(int noOfObjectsAccessedUnSortedList)
	{
		this.noOfObjectsAccessedUnSortedList = noOfObjectsAccessedUnSortedList;
	}

	public String sortedString()
	{
		return "No. of objects accessed in Sorted List for "+sepalLength+": "+noOfObjectsAccessedSortedList;
	}

	public String unsortedString()
	{
		return "No. of objects accessed in UnSorted List for "+sepalLength+": "+noOfObjectsAccessedUnSortedList;
	}
}
