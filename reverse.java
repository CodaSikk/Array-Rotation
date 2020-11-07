class Solution {
	public void leftRotate(int[] array, int k) {
		k %= array.length;

		reverse(array, 0, k - 1);
		reverse(array, k, array.length - 1);
		reverse(array, 0, array.length - 1);
	}

	public void rightRotate(int[] array, int k) {
		k %= array.length;

		reverse(array, 0, array.length - 1);
		reverse(array, 0, k - 1);
		reverse(array, k, array.length - 1);
	}

	public void reverse(int[] array, int startIndex, int endIndex) {
		int temp;

		while (startIndex < endIndex) {
			temp = array[startIndex];
			array[startIndex] = array[endIndex];
			array[endIndex] = temp;

			startIndex++;
			endIndex--;
		}
	}
}
