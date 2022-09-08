from collections import deque
def my_function():
    Array = deque([3, 8, 9, 7, 6])
    K = int(input("enter the number: "))
    while True:
        #K = 1
        # n = 1
        Array.rotate(1)
        print(list(Array))
        K+=1
        if K == 4:
            break
my_function()
