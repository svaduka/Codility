def maxConsecutive1(input):
    input = bin(2147483647)

    input = input[2:]
    print(input)

    print(max(map(len, input.split('1'))))


if __name__ == '__main__':
    maxConsecutive1(input)