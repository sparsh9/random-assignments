a = input()
l = list(a)
out = []
for i in l:
    if i=='[' or i==']' or i==',' or i==' ':
        continue
    else:
        b = int(i)
        out.append(b)  
print(out)