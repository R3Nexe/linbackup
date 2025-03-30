import requests

        print(e)
        return None

base=input("enter the base currency(eg:10usd): ").upper()
print("______________________________________")
dig=""
cur=""
for i in base:
    if i.isdigit():
        dig+=i
    if i.isalpha():
        cur+=i
dig=int(dig)
data=convert(cur)
for key,value in data.items():
    value=value*dig
    print(f"{key} : {value}")
print("______________________________________")
