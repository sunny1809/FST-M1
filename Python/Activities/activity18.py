import pandas as pd

dataframe = pd.read_csv("Activity17.csv")

print("CSV file have follwoing data :")
print(dataframe)

print("Below is the values in the Usernames column:")
print(dataframe["Usernames"])

print("Username from second row: ", dataframe["Usernames"][1])
print( "Password from second row: ", dataframe["Passwords"][1])

print("Usernames column in ascending order:")
print(dataframe.sort_values('Usernames',ascending=True))

print("Passwords column in descending order:")
print(dataframe.sort_values('Passwords', ascending=False))
