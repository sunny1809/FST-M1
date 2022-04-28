import pandas as pd
from pandas import ExcelWriter

data = {
	'FirstName':["Abhijit", "Sourav", "Samar"],
	'LastName':["Dey", "Das", "Roy"],
	'Email':["abhijit@xyz.com", "sourav@abc.com", "samar@mnc.com"],
	'PhoneNumber':["9876543218", "1234567890", "9876543217"]
}

dataframe = pd.DataFrame(data)
print(dataframe)

writer = ExcelWriter('Activity19.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)
writer.save()
