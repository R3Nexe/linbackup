import curses
import time
from curses import wrapper
import random

def start(stdscr):
    stdscr.clear()
    stdscr.addstr(1,1,"Type tester")
    stdscr.addstr(2,1,"press any key to start")
    stdscr.refresh()
    stdscr.getkey()

def display_text(stdscr, target, current, wpm=0):
    stdscr.addstr(1,10,target,curses.color_pair(3))
    stdscr.addstr(2,2,f"WPM:{wpm}")
    for i,char in enumerate(current):
        correctChar=target[i]
        color=curses.color_pair(1)
        if char!=correctChar:
            color=curses.color_pair(2)
        stdscr.addstr(1,i,char,color)

def wpm_test(stdscr):
    time_limit=10
    word_list= ["apple", "river", "mountain", "chair", "orange", "bottle", "window", "garden",
             "pencil", "clock", "mirror", "table", "house", "school", "bridge", "forest",
             "planet", "rocket", "flower", "ocean", "desert", "cloud", "stone", "animal",
             "guitar", "paper", "train", "village", "color", "machine", "summer", "winter",
             "spring", "night", "dream", "coffee", "energy", "street", "laptop", "shadow",
             "crystal", "flame", "water", "moon", "light", "star", "story", "glass", "tree",
             "hill", "storm", "rain", "wind", "sky", "music", "book", "voice", "bird", "smile",
             "earth", "fire", "air", "dust", "sand", "snow"]
    target=" ".join(random.choices(word_list,k=100))
    currText=[]
    wpm=0
    starttime=time.time()
    while True:
        elapsedTime=time.time()-starttime
        remainingTime=max(0,int(time_limit-elapsedTime))

        display_text(stdscr,target,currText,wpm)
        stdscr.refresh()
        if remainingTime==0:
            break

        try:
            stdscr.nodelay(True)
            inputKey=stdscr.getkey()
        except:
            continue

        if inputKey== "\x1b":
            break
        if inputKey in ("KEY_BACKSPACE", "\b", "\x7f"):
            if len(currText)>0:
               currText.pop()
        elif len(currText)<len(target):
            currText.append(inputKey)

    typed_text="".join(currText)
    words=len(typed_text.split())
    wpm=(len(typed_text.split())/time_limit*60)
    stdscr.clear()
    stdscr.addstr(2, 2, f"Time's up!")
    stdscr.addstr(3, 2, f"Words typed: {words}")
    stdscr.addstr(4, 2, f"Characters typed: {len(typed_text)}")
    stdscr.addstr(5, 2, f"Estimated WPM: {wpm:.2f}")
    stdscr.addstr(7, 2, "Press any key to exit.")
    stdscr.refresh()
    time.sleep(5)
    stdscr.nodelay(False)  # Wait for keypress to exit
    stdscr.getkey()

def main(stdscr):
    curses.init_pair(1,curses.COLOR_GREEN,curses.COLOR_BLACK)
    curses.init_pair(2,curses.COLOR_RED,curses.COLOR_BLACK)
    curses.init_pair(3,curses.COLOR_WHITE,curses.COLOR_BLACK)
    start(stdscr)
    wpm_test(stdscr)
wrapper(main)
