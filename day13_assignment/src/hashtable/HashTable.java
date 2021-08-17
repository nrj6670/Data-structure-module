package hashtable;
// Implement hash table with Bucket size as 1
public class HashTable implements HashTableIntf {
	class Bucket {
		int key;
	}

	/*
		class Bucket {
			private int key;
			public Bucket() {}
			public boolean Add(int key) {} // Implement chaining.
			public boolean Search(int key) {}
		}
	 */
	Bucket[] ht;
	int size;

	public HashTable(int size) {
		this.size = size;
		ht = new Bucket[size];
	}

	private int HashFunctionModN(int key) {
		return key % size;
	}
	
	private int HashFunctionFolding(int key) {
		int sum = 0;
		
		while(key / 10 != 0 || sum != 0) {
			int lastDigit = key % 10;
			key = key / 10;
			sum += lastDigit;
			if(key == 0) {
				key = sum;
				sum = 0;
			}
		}
		return key % size;
	}
	
	private int HashFunctionMiddleSquare(int key) {
		key = (int)Math.pow(key, 2);
		key = (int)Math.pow(key, 2);
		int result = 0;
		int tempKeyValueHolder = key;
		int digitCount = 0;
		
		while(tempKeyValueHolder != 0) {
			tempKeyValueHolder /= 10;
			digitCount += 1;
		}
		result = key % (int)Math.pow(10, digitCount - 1);
		result = result / 10;
		
		return result % size;
	}

	@Override
	public boolean Add(int key) {
		// Find the bucket id of the key, using hash function.
		int bucketId = HashFunctionModN(key);
		System.out.println("For key " + key + ", bucketId is " + bucketId);
		System.out.println("->output of folding hash function : " + HashFunctionFolding(key));
		System.out.println("->output of middle square hash function : " + HashFunctionMiddleSquare(key));
		// Check if storing key will result in collision.
		if (ht[bucketId] != null) {
			// Bucket stores some key.
			if (ht[bucketId].key != key) { // ht[bucketId].Search(key)
				// Key is not the one that we are trying to store.
				// = Collision.
				System.out.println("Collision for key " + key);
				System.out.println("->PERFORMING LINEAR PROBING");
				//return false;
				
				while(ht[bucketId] != null) {
					bucketId = (bucketId + 1) % size;
				}
				ht[bucketId] = new Bucket();
				ht[bucketId].key = key; // ht[bucketId].Add(key);
				System.out.println("Added key " + key);
				return true;
			}
			// Handle duplicate key by doing nothing.
			System.out.println("Duplicate key " + key);
			return true;
		}

		ht[bucketId] = new Bucket();
		ht[bucketId].key = key; // ht[bucketId].Add(key);
		System.out.println("Added key " + key);

		return true;
	}

	@Override
	public boolean Search(int key) {
		// Find the bucket id of the key, using hash function.
		int bucketId = HashFunctionModN(key);
		System.out.println("For key " + key + ", bucketId is " + bucketId);

		if (ht[bucketId] != null) {
			if (ht[bucketId].key == key) {
				System.out.println("Found key " + key);
				return true;
			}
			System.out.println("Not found key " + key);
			return false;
		}

		System.out.println("Bucket empty");
		return false;
	}

	@Override
	public boolean Delete(int key) {
		// TODO Auto-generated method stub
		return false;
	}

}
