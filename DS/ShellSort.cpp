#include<iostream>
//shell sort
void shellSort(int arr[], int n){
	for (int interval =n/2;interval>0;interval /=2){
		for (int i = interval; i<n;i +=1){
			int temp = arr[i];
			int j;
			for (j=i;j>=interval && arr[j-interval]>temp;j-= interval){
				arr[j]=arr[j-interval];
			}
			arr[j]	= temp;
		}
	}
}
void printarray(int arr[],int size){
	for(int i=0;i<size;i++){
		std::cout<<arr[i]<<"  ";
	}
	std::cout<<std::endl;
}

int main(){
	int n;
	std::cout<<"Enter size of the array";
	std::cin>>n;
	int data[n];
	std::cout<<"Input unordered list of elements to be sorted:\n";
	for (int i=0;i<n;i++){
		std::cin>>data[i];
	}
	shellSort(data,n);
	std::cout<<"Sorted array: \n";
	printarray(data,n);
}
