#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
bool alex(vector<pair<int, int>> &arr)
{
    int maxValue = arr[0].second;
    for (int i = 1; i < arr.size(); i++)
    {
        if (maxValue > arr[i].second)
        {
            return true;
        }
        maxValue = max(maxValue, arr[i].second);
    }
    return false;
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    vector<pair<int, int>> arr(n);
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i].first >> arr[i].second;
    }
    sort(arr.begin(), arr.end());
    cout << (alex(arr) ? "Happy Alex" : "Poor Alex");
    return 0;
}
