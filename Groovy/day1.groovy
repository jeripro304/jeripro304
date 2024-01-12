/*
class day1{
	static main(args){
		print "Hello World"
	}
} */

/*
println "Hello World" 
println "Hello World"
print Hi groovy
print "bye"  */

/*
a=10
b=2.4
c="Groovy"
d='Python'
bool=true
println a.getClass()
println b.getClass()
println c.getClass()
println d.getClass()
println bool.getClass()

println "the variable a value is : $a"
println 'the variable a value is : $a'
*/
/*
a= 'hi ' hello' //not accept
b= "hi " hello" //not accept 
c= 'hi " hello '//accept
d= "let me ask ' a question " //accept
e= 'hi \' hello' /accept
f= "this is \" inbetween" //accept
println a
println c
println d
println e
println f  */
/*
str= "Hello Groovy"
println str[0..5]
println str.length() */
/*
str ="Hello Groovy"
println str.length()
println str.substring(1,2)
println str.indexOf(9)
println str.replace("o","i")
println str.toLowerCase()
println str.toUpperCase()
println str.reverse()
println str.split(" ") */

/*
file_info="22Dec2023 192.161.1.10 80 192/161.1.11 88 web.cgi"
println file_info.split(" ")[1..4].join(" ")
*/
/*
name =System.console().readLine "Enter your name: "
println "hi your name is  : $name "

num1=System.console().readLine "Enter num1 : "
num2 =System.console().readLine "Enter num2 : "
println "Sum of $num1 and $num2 is : ${num1+num2}"
*/

/*
num1=System.console().readLine "Enter num1 : "
//num1=num1 as int
num1=num1.toInteger()
println num1.getClass()
*/
/*
a=10
b=13
println a>b 
println a<b
println a==b
println a!=b
*/

//Conditional statements
/*
num1 =System.console().readLine "Enter the num1 "
num1 =num1 as int 
if(num1> 0)
{
	println "number is positive"
}

x = System.console().readLine"Enter number: "
x = x.toInteger()
if(x%2==0)
{
	println "Even"
}
else
{
	println "Odd"
}
println "Success"
 
 
// is a 3 digit number
x = System.console().readLine"Enter number: "
x = x.toInteger()
if(x>99 && x<1000)
{
	println "Yes $x is a 3 digit number"
}
else
{
	println "No $x is not a 3 digit number"
}
*/

/*
num1 =System.console().readLine "Enter  :"
num1 =num1 as int 
if (num1 >0)
{
	println "$num1 is positive"
}
else if (num1<0)
{
	println "$num1 is negative"
}
else{
	println "it is $num1"
}
println "Successs" */

/*
println "\n\n\n\n\n\t\t\t\tFood Menu\n\t\t\t\t**** ****"
println "\n\t\t\t\t1.Veg Menu\n\t\t\t\t2.NonVeg Menu\n\t\t\t\t3.Jain Menu"
print "\t\t\t "
menu=System.console().readLine " Enter option : "
menu =menu as int */

/*
num1=System.console().readLine ("Enter num1 : ").toInteger()
num2=System.console().readLine ("Enter num2 : " ) .toInteger()
println "This script performs arithmetic operations\n1.sum\n2.sub\n3.mul\n4.div\n5.mode\n6.exponent"
println "Enter the operations to perform : "
op=System.console().readLine ("Enter operation : ").toInteger()
if (op==1){
	println "the sum of two numbers is ${num1+num2}"
}
else if (op==2){
	println "the sub of two numbers is ${num1-num2}"
}
else if (op==3){
	println "the product of two numbers is ${num1*num2}"
}
else if (op==4){
	println "the division of two numbers is ${num1/num2}"
}
else if (op==5){
	println "the mode of two numbers is ${num1%num2}"
}
else if(op==6){
	println "the exponent of two numbers is ${num1**num2}"
}
else{
	println "invalid option"
}
*/
/*
num1=System.console().readLine ("Enter num : ").toInteger()
if (num1>0)
{
	println "$num1 is positive"
	if (num1<10){
		println "$num1 is single digit"
		if (num1%2==0){ println "$num1 is single digit even number" }
		else println "$num1 is single digit odd number"
	}
	else {println "$num1 is not a single digit"}
	
}
else if (num1 <0){println "$num1 is negative"} */
/*
i=1
while (i<10){
	println i++
}

while (i>0){
println i--

} */

i=1
while (i<=10){
	if (i==5){
	i++
	continue}
	println i++;
}