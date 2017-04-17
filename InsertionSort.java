/*recursive Insertion Sort*/
void recursiveInsertionSort(int[] arr, int n){
	if(n==0 || n==1) return arr;
	recursiveInsertionSort(arr, n-1);
	//insert Nth number into sorted array
	int key = arr[n-1];
	int i = n-2;
	while(i<=n-2 && key<arr[i]){
		arr[i+1] = arr[i];
		i--;
	}
	arr[i+1] = key;
}

/*Iterative Insertion Sort*/
void recursiveInsertionSort(int[] arr, int n){
	if(n==1) return arr;
	int i = 1;
	int j = i-1;
	while(i<n){
		int key = arr[i];
		while(arr[j]>key && j>=0){
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = key;
		i++;
	}	
}
