//Node Class 
class Node<T extends Comparable<T>>
{
	private T data;

	//two nodes, one is left and one is right
	Node<T> left;
	Node<T> right;

	//setting values to Nodes
	public Node(T data)
	{
		this.data = data; 
		this.right = null;
		this.left = null;
	}

	//function that returns data
	public T returnData()
	{
		return this.data;
	}

	//function that sets data to x
	public void setData(T x)
	{
		this.data = x;
	}
}
