
#include<bits/stdc++.h>
using namespace std;

int32_t main()
{

     int arr[5]  = {1,2,3,4,5}; 
     cout<<&arr[0]<<endl; 
     //6422268
     for(int i =0; i < 5; i++){
        cout<<&arr[i]<<" "; 
     }
    return 0;
}