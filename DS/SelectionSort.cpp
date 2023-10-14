#include <iostream>
using namespace std;

int main() {
    int i, j, n, min, temp;
    int arr[5];
    n = sizeof(arr) / sizeof(arr[0]);
    std::cout << "Enter 5 elements: ";

    for (i = 0; i < 5; i++) {
        std::cin >> arr[i];
    }

    std::cout << "Inserted Elements are: \n";
    for (i = 0; i < 5; i++) {
        std::cout << arr[i] << "\t";
    }
    std::cout << std::endl;

    for (i = 0; i < n - 1; i++) {
        min = i;

        for (j = i + 1; j < n; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }

        temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
    std::cout << "Sorted Elements: \n";
    for (i = 0; i < 5; i++) {
        cout << arr[i] << "\t";
    }

    return 0;
}

