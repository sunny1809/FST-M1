userinput = int(input("How many fibonacci number you want to generate : "))

def fibonacci (number) : 
    if number <= 1 :
        return number
    else:
        return (fibonacci(number - 1) + fibonacci(number-2) )  

if userinput <= 0 :
    print ("Please provide a postivite number !")
else :
    print("Fibonnaci Series are given below : ")
    for i in range(userinput) :
        print (str(fibonacci (i)))     
        