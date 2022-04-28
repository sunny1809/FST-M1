List_Elements = list(input("Enter values (comma separated): ").split(","))
sum = 0

for i in List_Elements:
  sum += int(i)

print(sum)