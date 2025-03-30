import random
import time

def currency_converter():
    print("welcome gambler, How much are you willing to bet?")
    money= int(input())
    print("current balance is: ", money)
    print("converting to coins...")
    time.sleep(2)
    
def deposit():
    print("choose the tier of coin")
    print("a tier 1 coin will have 3x return")
    print("a tier 2 coin will have 2x return")
    tier=input()
    
    print("please insert a coin")
def game_logic():
    currency_converter()
    print("welcome to the slot machine!")
    print("Press Enter to start the game")
    input()
    payline=[]
    for i in range(3):
        slot=random.randint(0,9)
        payline.append(l1[slot])
        print(payline[i], end=' ', flush=True)
        time.sleep(1)
    print()
    if payline[0] == payline[1] == payline[2]:
        print("Triplex!!!!.....You win 2X")
    elif payline[0] == payline[1] or payline[0] == payline[2] or payline[1] == payline[2]:
        print("Pair! You win!")
    else:
        print("You lose!")


l1=[1,2,3,4,5,6,7,8,9,10]
game_logic()