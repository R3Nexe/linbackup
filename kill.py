import psutil
import os
import subprocess
import time


gameName= "VALORANT.exe"

appsToClose= [{"name": "EpicGamesLauncher.exe","path":"C:\Program Files (x86)\Epic Games\Launcher\Portal\Binaries\Win64\EpicGamesLauncher.exe"},
              {"name":"TouchPortal.exe","path":"C:\Program Files (x86)\Touch Portal\TouchPortal.exe"},
              {"name":"spacedeskService.exe","path":"C:\Program Files\datronicsoft\spacedesk\spacedeskService.exe"}]

def isrunning(processname):
    for process in psutil.process_iter(['name']):
        if process.info['name']==processname:
            return True
    return False
def killproc(processname):
    for process in psutil.process_iter('name'):
        if process.info['name'==processname]:
            try:
                process.kill()
                print(f"{processname} has been killed")
            except (psutil.NoSuchProcess, psutil.AccessDenied):
                pass
def start_app(command):
    try: 
        subprocess.Popen(command,shell=True)
        print(f"started {command}")
    except Exception as e:
        print(f"failed to start {command} : {e}")
    
def main():
    apps_killed =False
    while True:
        game_running = isrunning(gameName)

        if game_running and not apps_killed:
            print(f"game detected, killing bg apps...")
            for app in apps_killed:
                killproc(app['name'])
                apps_killed=True

        elif not game_running and apps_killed:
            print(f"game closed. restarting apps")
            for app in apps_killed:
                start_app(app['path'])
                apps_killed=False
        time.sleep(30)

if __name__=="__main__":
    main()