def solution(N):
    print(bin(N)[2:])
    # return print(len(max(bin(N)[2:].strip('0').strip('1').split('1'))))
    # print(bin(N)[2:].split('1'))
    return print(len(max(bin(N)[2:].split('1'))))

solution(2147483647)
