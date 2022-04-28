friuts =	{
  "banana": "$25",
  "apple": "$80",
  "orange": "$50"
}

Cfruit = input("Which fruit are you looking for ? ").lower()

if (Cfruit in friuts):
    print ("Congratulation ! its available.")
else:
    print("Sorry! We don't have this fruit right now !")


