import sys

if(len(sys.argv)<2):
	print "Please Input a num ex) python Fibonacci.py 100"
	exit()
else :
	start = int(sys.argv[1])
	print start

fib1 = 0
fib2 = 1

for i in range(start-2):
	fib3 = fib1 + fib2
	print "F%d = %d, F%d = %d, F%d = %d" % (i,fib1,(i+1), fib2,(i+2), fib3)
	fib1 = fib2
	fib2 = fib3

