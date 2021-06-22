def sortByLength(inputArray, n):
    for i in range(1, n): 
        temp = inputArray[i] 
        j = i - 1
        while j >= 0 and len(temp) < len(inputArray[j]): 
            inputArray[j + 1] = inputArray[j] 
            j -= 1
        inputArray[j + 1] = temp 


if __name__ == "__main__": 
	arr =   ["abc", "","aaa","a","zz"]
	n = len(arr) 
	sortByLength(arr, n) 
	print(arr)
