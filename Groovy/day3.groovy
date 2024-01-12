//println "Hello"
/* 
file= new File('file2.txt')
for (i in file.readLines()){
	if (i=~/.{4}}}/){
		println i
	}
}


name=System.console().readLine "Enter your name : "
mno=System.console().readLine "Enter your m no : "
if (name=~/[a-zA-Z]{2,}/){
	println "Valid Name"
}
else println "Invalid Name"
if (mno=~/^[6-9](\d){9}$/){
	println "Valid m No"
}
else println "Invalid M No"


file =new File ('file2.txt')
println "gmail matching"
for (i in file.readLines()){
	if (i=~/\w+[@][a-zA-Z]+[.][a-zA-Z]{2,4}/){
		println i
	}
}

//exact word pattern
file =new File ('file2.txt')
for (i in file.readLines()){
	if (i=~/\bbabu\b/){
		println i
	}
}

//starting and ending words are same
file =new File ('file2.txt')
for (i in file.readLines()){
	if (i=~/\bgroovy\b.*\bgroovy\b/){
		println i
	}
}

//function
//without arguments
def f1(){
	println "Hi hello"
}
f1()

//with arguments
def f2(a,b){
	println "sum of $a and $b is        : "+(a+b)
	println "difference of $a and $b is : "+(a-b)
	println "product of $a and $b is    : "+(a*b)
	println "division of $a and $b is   : "+(a/b)
}
f2(32,54)
println "#"*40
f2(System.console().readLine ("Enter num1 : ").toInteger(),System.console().readLine ("Enter num2 : ").toInteger())


//Scope of variable
//Global variable (by default any variable in groovy id global)
//Local variable is created using the def Ex:- def a=123

def f1(){
	k=10
	def a=123  //Local variable
}
f1()
println k
println a


def fun(a,b){
	a=a+b
}
println fun(234,234)


def grade


name = System.console().readLine "Enter Your name : "
println "Enter your marks for 5 subjects : "
marks=[]
for (int i=1;i<=5;i++){
	marks.push(system.console.readLine "Enter sub $i :")
}
avg=marks.sum()/marks.size()

println "="*30
println "Hi "+name 
println "Your average mark is %avg"


import arithmetic as ar

println new ar().total(System.console().readLine ("input :").toInteger(),234)


import groovy.json.JsonSlurper 

file=new File('jsonfile.json')
jsonSlurper =new JsonSlurper()
jsonObject =jsonSlurper.parseText(file.readLines())
println jsonObject
println jsonObject.size

//write in file
fo=new File("file2.txt")
fo.append("\nhelooooooooda ")


//write into json file
import groovy.json.JsonOutput
def jsonData=[name:"Poornesh",age:30,city:"example city"]
def filepath='file3.json'
def jsonContent=JsonOutput.toJson(jsonData)
new File(filepath).text=jsonContent
println"success"



//to get the id or refrence number of the variable or the address

str1="groovy"
println System.identityHashCode(str1)
str1=str1.replace("g","k")
println str1
println System.identityHashCode(str1)

//Command line argumnets

host_info=args
name=args[0]
username=args[1]
pass=args[2]
println name
println pass


//Exception handling
num1=10
num2=10
try{
	result=num1/num2
	file =new File('tet.txt')
	file.getText()
	
}
catch(ArithmeticException e){
	println "An arithmetic error occus ${e.message}"
}
catch(Exception e){
	println "An unexpected error occurs ${e.message}"
}


//Json Exception
import groovy.json.JsonOutput
def jsonData=[name :"Jeish",age:30,password:"kabeemkubam"]
def filepath='kjsfds/jerish.json'
try{
	def jsonContent=JsonOutput.toJson(jsonData)
	new File(filepath).text=jsonContent
	println "Data written successfully"
}
catch(Exception e){
	println "Error writing Json file ${e.message}"
}
*/