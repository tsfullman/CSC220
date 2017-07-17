import array
def initial():
	try:
		degrees = int(input("Enter an integer between -459 and 212: "))
		if degrees>=-459 and degrees<=212:
			print(degrees)
			Calc(degrees)
		else:
			print("Not an int between -459 and 212")
			initial()
	except ValueError:
			print("That is not an integer between -459 and 212.")
			initial()
	

def Calc(degree):
	faren = [0]*20
	celc = [0]*20
	for count in range(0,20):
		print(count)
		faren[count] = degree
		celc[count] = (degree-32)*(5/9)
		degree+=10
		print("faren[%d]: %d \t celc[%d]: %.2f" % (count,faren[count],count,celc[count]))


initial()



