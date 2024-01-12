//println "Hi Hello welcome to day 2"
/*
// A simple atm pin check program
ATM_pin='1234'
count=3
while (true){
	pin = System.console().readLine "Enter your Pin : "
	if (pin==ATM_pin){
		println "You have Successfully Logged in !!"
		break
	}
	else {
		count--;
		println "Wrong Pin .. Attempts remaining $count"
		if (count==0){
			println "You have entered 3 times Wrongly Come again after 24 hrs."
			break
		}
	}
} */

/*
//printing 1 to 10 in  a for in loop
for( i in 1..10){
	println "$i"
}
println "***********************"
for (i in [10,40,29]){
	println i
}
println "***********************"
//printing a string using a for loop
for (i in "hello"){
	println i
}
*/
/*
// printing numbers in a list
my_list=[10,20,491,324,23,42]
for (i in my_list){
	println i
} */
/*
//printing 1 to 10 except 5
for (i in 1..10) {
	if (i==5) continue;
	println i
}
*/
/*
// Fizz Buzz program to determine multiples of 3 and 5
for (i in 1..50){
	if (i%3==0 && i%5==0){
	println "FizzBuzz"
	}
	else if (i%3==0){
		println "Fizz"
	}
	else if (i%5==0){
		println "Buzz"
	}
	else {
		println i
	}
}
*/

/*
//Switch
val=System.console().readLine ("Enter a Number : ").toInteger()
switch(val){
	case 1..2:
		println "the value is 1 or 2"
		break;
	case 3 .. 4:
		println "the value is 3 or 4"
		break;
	case 5:
		println "the value is 5"
		break
	default:
		println "The number is not valid"	
} 
*/
/*
//Regular Expression
key=System.console().readLine "Enter any value : "
switch (key){
	case ~("[A-Za-z]+"):
		println "it is a alphabet"
		break
	case ~("[0-9]+"):
		println "It is a digit"
		break
	case ~("[^a-zA-Z0-9]+"):
		println "It is special character"
		break
	default :
		println "Not Matched"
}
*/

/*
//Variable --Arrays
mylist=[1,2,3,"a","b"]
len =mylist.size()
println "Printing all values in the list : "
for (i in mylist){
	println i
//	if (i=="a"){
//		println "check"
//		i="Linux"
//	}
}
println "Printing the list $mylist"
println "Printing particular index $mylist[0,4]"
println "printing in a particular range $mylist[1..2]"


list=[10,20,30,40,50]
println list
list[1]=800
println list



list=[1,2,4,5,63,2,2,2,345,985,74,42,6,7,5456]
println "total occurances of a number "+ list.count(2);
println list.remove(5)
println list.pop()
println "sorted order "+list.sort()
println "Reversed order "+list.reverse()
list.add(80329)
println list.contains(985)
list.push(28394)
println list.drop(5)
println list



//associative array or hashmap ormdictionary 
emp_det=[101:"jerish",102:"john"]
emp_det[101]= ["jerish","Prodapt","Guindy"]
println emp_det[101][1] 
println emp_det[101]



car_info=["Audi":["Matt Black","A8","1Cr"],"BMW":["Dark blue","m330i","50L"]]
println car_info["BMW"]

for (i in car_info){
	println i
}

car=["Audi":["color":["Matt Black","yelow","red"],"price":"60L"]]
println car["Audi"]["color"][2]
println 

al=[1:"A",2:"B",3:"C",4:"D"]
k=al.keySet()
for (i in k){
	println i +" => "+ al[i]
}

//how to read the data from the file
file_obj=new File('file.txt')
println file_obj.getText()

file=new File ('fil.txt')
if (file.exists()){
	println "File is there"
}
else println "No file "
*/
//getting matched content using file handling
file_obj=new File('file.txt')
k=file_obj.readLines()
for (i in k){
	if (i=~ /^groovy$/){
		println i
	}
}
