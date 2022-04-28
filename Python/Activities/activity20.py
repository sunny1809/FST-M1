import pandas as pd

dataframe = pd.read_excel('Activity19.xlsx')
print(dataframe)

print("Number of rows and columns in the excel sheet:")
print(dataframe.shape)

print("Data in Email columns only :")
print(dataframe['Email'])

print("Data based on FirstName in ascending order :")
print(dataframe.sort_values('FirstName', ascending=True))
