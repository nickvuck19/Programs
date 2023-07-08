# Quiz game inspired by BroCode


def newgame():
    guesses = []
    correct_guesses = 0
    question_num = 1

    for key in questions:
        print("----------------------")
        print(key)
        for i in options[question_num-1]:
            print(i)
        guess = input("Enter A,B,C, or D: ")
        guess = guess.upper()
        guesses.append(guess)

        correct_guesses += answer(questions.get(key), guess)
        question_num += 1

    display_score(correct_guesses, guesses)

def answer(answer, guess):

    if answer == guess:
        print("Correct")
        return 1
    else:
        print("Wrong")
        return 0

def display_score(correct_guesses, guesses):
    print("-------------")
    print("Results:")
    print("-------------")

    print("Answers: ", end = " ")
    for i in questions:
        print(questions.get(i), end = " ")
    print()

    print("Guesses: ", end = " ")
    for i in guesses:
        print(i, end = " ")
    print()

    score = int((correct_guesses / len(questions)) * 100)
    print("Your score: " + str(score) + "%")

def playAgain():
    pass

questions = {"What was GOTY 2014?":"A",
          "Who was the first president of the United States?":"B",
          "Who won the 2014 World Cup?":"C",
          "Which soccer team is from the English Premier League?":"D"
          }

options = [["A. Dragon Age: Inquisition", "B. Dark Souls 3", "C. NBA 2K14", "D. FIFA 14"],
           ["A. Abraham Lincoln", "B. George Washington", "C. Grover Cleveland", "D Willem DaFoe"],
           ["A. Brazil", "B. France", "C. Germany", "D. England"],
           ["A. Bayern Munich", "B. Chicago Fire", "C. Real Madrid", "D. Manchester City"]]

newgame()