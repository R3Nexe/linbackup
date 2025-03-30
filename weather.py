import requests
import datetime
import time


API_KEY="0ae67cfb262df518786df01ea142cc7a"
CITY="Bhubaneswar"
URL=WEATHER_URL = f"http://api.openweathermap.org/data/2.5/weather?q={CITY}&appid={API_KEY}&units=metric"

INTERVAL= 60


def getWeather():
    try:
        response=requests.get(URL)
        data= response.json()
        if data["cod"]!="404":
            main=data["main"]
            temperature=main["temp"]
            humidity=main["humidity"]
            pressure=main["pressure"]
            weather=data["weather"]
            weather_description=weather[0]["description"]
            return temperature,humidity,pressure,weather_description
        else: return "weather not found"
    except Exception as e:
        return f"Error: {e}"
    


def update(temperature,humidity,pressure,weather_description):
    print("_________________________")
    print(f"Time: {datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
    print("_________________________")
    print(f"Temperature: {temperature}C\nHumidity: {humidity}%\nPressure: {pressure}hPa\nDescription: {weather_description}")
    print("_________________________\n\n")
    
if __name__=="__main__":
    while True:
        update(*getWeather())
        time.sleep(INTERVAL)