import random

''''
 1 for snake
 -1 for water 
 0 for gun
 '''
computer = random.choice([-1, 1, 0])
youstr = input("Enter your choice (1, -1, 0): ")
you = int(youstr) 

reversedict = {1: "Snake", -1: "Water", 0: "Gun"}

print(f"You chose {reversedict[you]}\nComputer chose {reversedict[computer]}")

if(computer == you):
    print("It's a draw!")
else:

    if(computer == -1 and you == 1):    
        print("You win!")
    elif(computer == -1 and you == 0):  
        print("You lose!")
    elif(computer == 1 and you == -1):  
        print("You lose!")
    elif(computer == 1 and you == 0):   
        print("You win!")
    elif(computer == 0 and you == 1):   
        print("You lose!") 
    elif(computer == 0 and you == -1):  
        print("You win!")  
    else:
        print("Something went wrong")
