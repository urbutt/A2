#include <iostream>
int main()
{
    int n;
    std::cin >> n;
    int chest = 0, biceps = 0, back = 0;
    int cFlag = true, bFlag = false, backFlag = false;
    for (int i = 0; i < n; i++)
    {
        int in;
        std::cin >> in;
        if (cFlag)
        {
            chest += in;
            cFlag = false;
            bFlag = true;
        }
        else if (bFlag)
        {
            biceps += in;
            bFlag = false;
            backFlag = true;
        }
        else
        {
            back += in;
            backFlag = false;
            cFlag = true;
        }
    }
    std::cout << ((chest > biceps && chest > back) ? "chest" : (biceps > back && biceps > chest) ? "biceps"
                                                                                                 : "back");
    return 0;
}