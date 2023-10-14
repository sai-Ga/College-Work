#include <iostream>
#include <cstring>

class Stack {
private:
   int MAX;
   char* st;
   int top;
   int count;
   int size;

public:
   Stack() : top(-1), count(0), size(20) {
       st = new char[size];
   }

   ~Stack() {
       delete[] st;
   }

   void push(char var) {
       if (top >= size - 1) {
           std::cout << "\nError: stack is full" << std::endl;
           exit(1);
       } else {
           st[++top] = var;
           count++;
       }
   }

   char pop() {
       if (top < 0) {
           std::cout << "\nError: stack is empty" << std::endl;
           exit(1);
       }
       count--;
       return st[top--];
   }

   int stacktop() {
       if (top < 0) {
           std::cout << "\nError: stack is empty" << std::endl;
           exit(1);
       }
       return st[top];
   }

   int emptyStack() {
       return (count == 0);
   }
};

int main() {
   Stack s1;
   char exp[20];
   char ch;
   int num, i;

   std::cout << "Enter the expression: ";
   std::cin >> exp;

   num = std::strlen(exp);

   for (i = 0; i < num; i++) {
       if (exp[i] == '(' || exp[i] == '{') {
           s1.push(exp[i]);
       } else if (exp[i] == ')' || exp[i] == '}') {
           ch = s1.pop();
           if ((exp[i] == ')' && ch == '(') || (exp[i] == '}' && ch == '{')) {
               std::cout << "\n Matching parenthesis found";
           } else {
               std::cout << "\n Error: No matching parenthesis";
           }
       }
   }

   if (s1.emptyStack()) {
       std::cout << "\n Balanced expression" << std::endl;
   } else {
       std::cout << "\n Expression Not Balanced" << std::endl;
   }

   return 0;
}

