class Solution {
	public void leftRotate(int[] array, int k) {
		if ((k == 0) || (k%array.length == 0) || (array.length < 2))
			return;

		k %= array.length;

		int i, temp;
		while (k > 0) {
			for (i = 1; i <= array.length-1; i++) {
				temp = array[i];
				array[i] = array[i-1];
				array[i-1] = temp;
			}

			k--;
		}
	}

	public void rightRotate(int[] array, int k) {
		if ((k == 0) || (k%array.length == 0) || (array.length < 2))
			return;

		k %= array.length;

		int i, temp;
		while (k > 0) {
			for (i = array.length-1; i >= 1; i--) {
				temp = array[i];
				array[i] = array[i-1];
				array[i-1] = temp;
			}

			k--;
		}
	}
}
