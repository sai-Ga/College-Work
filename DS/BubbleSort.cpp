#include<iostream>
int main()
{
	int n,i,j,temp;
	int a[5];
	std::cout << "C23101--Saiganesh \n";
	std::cout << "Enter 5 elements : ";
	for (i= 0; i < 5; i++)
	{
		std::cin >> a[i];
	}
	std::cout << "Input list ..... \n";
	
	for(i=0;i<5;i++)
	{
		std::cout << a[i] << "\t";
	}
	std::cout << std::endl;
	for (i=0;i<5;i++)
	{
		for(j= i+1;j<5;j++)
		{
			if (a[j] < a [i])
			{
				temp = a[i];
				a[i] = a[j];
				a[j]= temp;
			}
		}
	}
	std::cout << "Sorted Elements List ... \n";
	for (i= 0 ; i<5 ;i++)
	{
		std::cout << a[i] << "\t";
	}
	return 0;
}

