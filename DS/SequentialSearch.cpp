#include <iostream>
#include <cstdlib>
#define SIZE 25


int n = 0;

int squsearch(int[], int, int*, int);

int main()
{
    int flag, i, locn, key, choice;

    int L[SIZE];
    while (1)
    {
        std::cout << "step1 : Input unordered list\n";
        std::cout << "step2 : Search for key using sequential search\n";
        std::cout << "step3 : quit\n";
        std::cout << "Enter Option (1,2,3) : ";
        std::cin >> choice;
        switch (choice)
        {
        case 1:
            std::cout << "\nEnter number of elements : ";
            std::cin >> n;
            std::cout << "\nInput list of elements :";
            for (i = 0; i < n; i++)
            {
                L[i] = 0;
                std::cin >> L[i];
            }

            break;

        case 2:
            std::cout << "Enter the number you want to search : ";
            std::cin >> key;
            flag = squsearch(L, key, &locn, n);

            if (flag == 1)
            {
                std::cout << "\nNumber found\n";
                std::cout << "Location is : " << locn + 1 << "\n";
            }
            else
            {
                std::cout << "\nNumber not found \n";
            }

            break;

        case 3:
            exit(0);

        default:
            std::cout << "Not a valid option \n";
        }
    }
    return 0;
}
int squsearch(int list1[], int tar, int *locn1, int n1)
{
    int count;
    int flag = 0;
    count = 0;
    while (count < n1 && tar != list1[count])
    {
        count++;
    }
    *locn1 = count;

    if (tar == list1[count])
    {
        flag = 1;
    }
    return flag;
}

