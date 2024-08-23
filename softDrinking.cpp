#include <iostream>
int main()
{
    int n, k, l, c, d, p, nl, np;
    std::cin >> n >> k >> l >> c >> d >> p >> nl >> np;
    std::cout << std::min((k * l) / nl, std::min(c * d, p / np)) / n;
}
