import random

def main():
    choices = ["グー", "チョキ", "パー"]
    print("じゃんけんゲームへようこそ！")
    print("0: グー, 1: チョキ, 2: パー")

    try:
        player = int(input("あなたの手を選んでください: "))
        if player not in [0, 1, 2]:
            print("0, 1, 2のどれかを入力してください。")
            return

        computer = random.randint(0, 2)
        print(f"あなた: {choices[player]}")
        print(f"コンピュータ: {choices[computer]}")

        if player == computer:
            print("あいこです！")
        elif (player == 0 and computer == 1) or (player == 1 and computer == 2) or (player == 2 and computer == 0):
            print("あなたの勝ちです！")
        else:
            print("あなたの負けです。")
        
        with open("debug.log", "a") as f:
            f.write(f"Player chose: {player}, Computer chose: {computer}\n")

    except ValueError:
        print("数値を入力してください。")

if __name__ == "__main__":
    main()
