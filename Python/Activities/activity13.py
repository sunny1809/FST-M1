from typing import List


def sum(num):
    sum = 0
    for i in num:
        sum += i
    return sum

List = [1,2,5,7,8]
callList = str(sum(List))
print("The sum of all the element is : "+callList)
