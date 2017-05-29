class IrisData implements Comparable<IrisData>
{
	float sepalLength;
	float sepalWidth;
	float petalLength;
	float petalWidth;
	String className;

	public IrisData(float sepalLength, float sepalWidth, float petalLength, float petalWidth, String className)
	{
		this.sepalLength = sepalLength;
		this.sepalWidth = sepalWidth;
		this.petalLength = petalLength;
		this.petalWidth = petalWidth;
		this.className = className;
	}

	@Override
	public int compareTo(IrisData o)
	{
		float comparedSize = o.sepalLength;
		if (this.sepalLength > comparedSize)
		{
			return 1;
		}
		else if (this.sepalLength == comparedSize)
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}

	public String toString()
	{
		return className+":"+sepalLength;
	}

	public float getSepalLength()
	{
		return sepalLength;
	}

	public void setSepalLength(float sepalLength)
	{
		this.sepalLength = sepalLength;
	}

}
