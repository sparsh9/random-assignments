import pandas as pd
df = pd.read_csv("Q5.csv") 

df['Order Date'] = pd.to_datetime(df['Order Date'])
df.groupby([df['Order Date'].dt.strftime('%b'),'Category'])['Amount'].sum()

print(df)
