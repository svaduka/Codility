from collections import deque
def my_function():
    Myarray =deque([3,8,9,7,6,5])
    K = int(input("Enter a number"))
    n = -1
    while True:
        Myarray.rotate(n)
        print(list(Myarray))
        K += 1
        if K == 4:
             break
my_function()