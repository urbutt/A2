#include <iostream>
int main()
{
    int n, c;
    std::cin >> n >> c;
    int prices[n], max = 0;
    for (int i = 0; i < n; i++)
    {
        std::cin >> prices[i];
    }
    for (int i = 0; i < n - 1; i++)
    {
        int temp = prices[i] - prices[i + 1] - c;
        if (temp > max)
        {
            max = temp;
        }
    }
    std::cout << max;
    return 0;
}