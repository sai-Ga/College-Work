#include <iostream>
int main()
{
	int i,j,temp;
	int arr[7];
	
	std::cout << "Enter 7 elements : ";
	
	for(i=0;i<7;i++)
	{
		std::cin >> arr[i];
	}
	
	std::cout << "Inserted Elements .... \n";
	for(i=0;i<7;i++)
	{
		std::cout << arr[i] << "\t";
	}
	std::cout << std::endl;
	
	for(i=1;i<7;i++)
	{
		temp = arr[i];
		j = i - 1;
		
		while(temp<arr[j] && j>=0)
		{
			arr[j+1] = arr[j];
			j = j-1;
			
		}
		arr[j+1] = temp;	
	}
	std::cout << "Sorted Elements ...... \n";
	for(i=0;i<7;i++)
	{
		
		std::cout << arr[i] <<"\t";
	}
	
	return 0;
}

