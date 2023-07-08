import random
# Simple password generator using a combination of letters and characters
chars = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSTUVWXYZ`~!@#$%^&*)(_+;:<>?/'

print("Hello, welcome to this passowrd generator")
print("Enter how many passowrd you would like generated, and with how many characters")


numOfPass = int(input("How many passwords would you like generated?: "))
lenOfPass = int(input("How many characters in each passowrd?: "))

print("\nhere are the passwords")

for password in range(numOfPass):
    passwords = ''
    for c in range(lenOfPass):
        passwords += random.choice(chars)
    print(passwords)

