void leftRotate(int *array, int n, int k){
    if ((k == 0) || (k%n == 0) || (n < 2))
        return;

    k %= n;

    int i, temp;
    while (k > 0) {
        for (i = 1; i <= n-1; i++) {
            temp = array[i];
            array[i] = array[i-1];
            array[i-1] = temp;
        }

        k--;
    }
}

void rightRotate(int *array, int n, int k){
	if ((k == 0) || (k%n == 0) || (n < 2))
		return;

	k %= n;

	int i, temp;
	while (k > 0) {
		for (i = n-1; i >= 1; i--) {
			temp = array[i];
			array[i] = array[i-1];
			array[i-1] = temp;
		}

		k--;
	}
}
