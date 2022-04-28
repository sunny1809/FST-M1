def sum(num):
    if num > 0:
        return num +sum(num-1)
    else:
        return 0

recursive = sum(10)
print(recursive)


            