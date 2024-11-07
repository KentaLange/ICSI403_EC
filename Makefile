.DEFAULTGOAL := all

clean:
	rm *.class

build:
	javac *.java

run: closestpair.class 
	java -cp ../ closestpair.ClosestPairDriver

all: build run