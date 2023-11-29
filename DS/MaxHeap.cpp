#include<bits/stdc++.h>
using namespace std;

class heaptree
{
    int n,heap[20],i,parent,data,last;
    public :
        heaptree()
        {
            last=-1;
        }
        void get()
        {
            cout<<"\nEnter the Range: ";
            cin>>n;
            for(i=0;i<n;i++)
            heap[i]=0;
        }
        void insertheap()
        {
            if(last>=n-1)
            cout<<"\n Heap is full";
            else
            {
                cout<<"\nEnter the element: ";
                cin>>data;
                last++;
                heap[last]=data;
                reheapup(last);
            }
        }
        void reheapup(int newindex)
        {
            if(newindex!=0)
            { 
                parent=(newindex-1)/2;
                if(heap[newindex]>=heap[parent])
                {
                    int temp;
                    temp = heap[newindex];
                    heap[newindex]=heap[parent];
                    heap[parent]=temp;
                    reheapup(parent);
                }
                else
                return;
            }
        }
        void dispay()
        {
            cout<<"\nHeap Tree: ";
            for(i=0;i<n;i++)
            cout<<heap[i]<<"\t";
        }
        
};
int main()
{
    int ch;
    heaptree h;
    h.get();
    cout<<"\n 1:insert";
    cout<<"\n 2:display";
    do
    {
        cout<<"\n enetr choice";
        cin>>ch;
        switch(ch)
        {
            case 1: h.insertheap();
            break;
            case 2: h.dispay();
            break;
            case 3: exit(0);
        }
        }while(ch!=3);
        return 0;
    
}
