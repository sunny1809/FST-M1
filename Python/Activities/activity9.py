List_1 = [1,2,3,4,5,6]
List_2 = [7,8,9,10,12]
List_3 =[]

print ("First list is : ", List_1)
print ("Second list is : ", List_2)

for i in List_1:
    if ( i%2 != 0):
        List_3.append(i)

for i in List_2:
    if (i%2 == 0):
        List_3.append(i)

print ("New list is : ", List_3)


