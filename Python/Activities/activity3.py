user1 = str(input ("Player 1 - Please enter your name: "))
user2 = str(input ("Player 2 - Please enter your name: "))

user1_answer = input("Welcome "+user1+" ! Please enter your choice : ").lower()
user2_answer = input("Welcome "+user2+" ! Please enter your choice : ").lower()

if user1_answer == user2_answer:
    print("Match TIE!")
elif user1_answer == 'rock':
    if user2_answer == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif user1_answer == 'scissors':
    if user2_answer == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif user1_answer == 'paper':
    if user2_answer == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")