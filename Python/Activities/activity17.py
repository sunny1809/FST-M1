import pandas as pd

data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

dataframe = pd.DataFrame(data)
print(dataframe)

dataframe.to_csv("Activity17.csv", index=False)
