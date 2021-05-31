// Java program to implement Max Heap
public class DS010 {
	private static int[] Heap;
	private static int size;
	private int maxsize;

	// Constructor to initialize an
	// empty max heap with given maximum
	// capacity.
	public DS010(int maxsize)
	{
		this.maxsize = maxsize;
		DS010.size = 0;
		Heap = new int[this.maxsize + 1];
		Heap[0] = Integer.MAX_VALUE;
	}

	// Returns position of parent
	private int parent(int pos) { return pos / 2; }

	// Below two functions return left and
	// right children.
	private static int leftChild(int pos) { return (2 * pos); }
	private static int rightChild(int pos)
	{
		return (2 * pos) + 1;
	}

	// Returns true of given node is leaf
	private static boolean isLeaf(int pos)
	{
		if (pos > (size / 2) && pos <= size) {
			return true;
		}
		return false;
	}

	private static void swap(int fpos, int spos)
	{
		int tmp;
		tmp = Heap[fpos];
		Heap[fpos] = Heap[spos];
		Heap[spos] = tmp;
	}

	// A recursive function to max heapify the given
	// subtree. This function assumes that the left and
	// right subtrees are already heapified, we only need
	// to fix the root.
	private static void maxHeapify(int pos)
	{
		if (isLeaf(pos))
			return;

		if (Heap[pos] < Heap[leftChild(pos)]
			|| Heap[pos] < Heap[rightChild(pos)]) {

			if (Heap[leftChild(pos)]
				> Heap[rightChild(pos)]) {
				swap(pos, leftChild(pos));
				maxHeapify(leftChild(pos));
			}
			else {
				swap(pos, rightChild(pos));
				maxHeapify(rightChild(pos));
			}
		}
	}

	// Inserts a new element to max heap
	public void insert(int element)
	{
		Heap[++size] = element;

		// Traverse up and fix violated property
		int current = size;
		while (Heap[current] > Heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
	}

	public void print()
	{
		for (int i = 1; i <= size / 2; i++) {
			System.out.print(
				" PARENT : " + Heap[i]
				+ " LEFT CHILD : " + Heap[2 * i]
				+ " RIGHT CHILD :" + Heap[2 * i + 1]);
			System.out.println();
		}
	}

	// Remove an element from max heap
	public static int extractMax()
	{
		int popped = Heap[1];
		Heap[1] = Heap[size--];
		maxHeapify(1);
		return popped;
	}

	public static void main(String[] arg)
	{
		System.out.println("The Max Heap is ");
		DS010 maxHeap = new DS010(15);
		maxHeap.insert(5);
		maxHeap.insert(3);
		maxHeap.insert(17);
		maxHeap.insert(10);
		maxHeap.insert(84);
		maxHeap.insert(19);
		maxHeap.insert(6);
		maxHeap.insert(22);
		maxHeap.insert(9);

		maxHeap.print();
		System.out.println("The max val is "
						+ DS010.extractMax());
	}
}
