#include <iostream>
using namespace std;

string moveX(string s) {
    if (s.length() == 0) return s;
    if (s[0] == 'x')
        return moveX(s.substr(1, s.length()-1)) + s[0];
    else
        return s[0] + moveX(s.substr(1, s.length()));
}

int main() {
    string s;
    cin >> s;
    string result = moveX(s);
    cout << result << endl;
}
/*
to compile command g++ movex.cpp -o movex.exe
to run movex.exe
*/