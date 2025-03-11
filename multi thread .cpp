#include <iostream>
#include <thread>
using namespace std;
void fun1(char ch)
{
	for (int i = 0; i < 30; i++)
	{
		cout << " " << ch;
	}
}

void fun2()
{
	for (int i = 0; i < 30; i++)
	{
		cout << " #";
	}
}

int main()
{
	thread t1(fun1, '*');

	thread t2(fun2);
	t1.join();
	t2.join();

	return 0;
}