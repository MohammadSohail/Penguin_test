#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    double weight[n+1];
    for(int i = 0; i < n; i++){
        cin >> weight[i];
    }

    sort(weight,weight+n);

    int left = 0, right = n - 1;
    int cnt = 0;

    while(left <= right){
        if(left == right){
            cnt++;
            break;
        }
        if(weight[left] + weight[right] <= 3.0){
            left++;
            right--;
            cnt++;
        }
        else{
            right--;
            cnt++;
        }
    }
    cout << cnt << endl;
    return 0;
}
