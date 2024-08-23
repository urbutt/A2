#include <iostream>
#include <algorithm>
int main()
{
    int n, k, l, c, d, p, nl, np;
    std::cin >> n >> p >> l >> c >> d >> p >> nl, np;
    int TotalDrink = (k * l) / nl;
    int TotalSlices = c * d;
    int TotalSalt = p / np;

    int min = std::min(TotalDrink, TotalSalt, TotalSlices);
    std::cout << min;
    return 0;
}
