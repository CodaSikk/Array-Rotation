void reverse(int *array, int startIndex, int endIndex) {
	int temp;

	while (startIndex < endIndex) {
		temp = array[startIndex];
		array[startIndex] = array[endIndex];
		array[endIndex] = temp;

		startIndex++;
		endIndex--;
	}
}

void leftRotate(int *array, int n, int k) {
	k %= n;

	reverse(array, 0, k - 1);
	reverse(array, k, n - 1);
	reverse(array, 0, n - 1);
}

void rightRotate(int *array ,int n, int k) {
	k %= n;

	reverse(array, 0, n - 1);
	reverse(array, 0, k - 1);
	reverse(array, k, n - 1);
}
