//day 4
/*
class jerish{
	def a
	def myfun(){
		println "hi hello"
		a=300
	}
	
	def fun2(){
		
		println a
	}
	
}
obj=new jerish()
obj.myfun()
obj.fun2()


//constructors

class x{
	def x(){
		println "Hello Constructor"
	}
	def m1(){
		
	}
	def m2(){
		
	}
}
obj=new x()


//parameterized constructor
class x{
	def a
	x(a){
		this.a=a
	}
	def m1(){
		println a
	}
	def m2(){
		
	}
}

obj=new x(100)
obj.m1()


//Creating a banking app

class BankApp{
	final bankName="SBI"
	
	def cusname
	def cusaccno
	def bal
	def address
	def BankApp(cusname,cusaccno,bal,address){
		this.cusname=cusname
		this.cusaccno=cusaccno 
		this.bal=bal
		this.address=address
	}
	def withDraw(amount){
		if (amount>this.bal){
			println "Entered amount is higher than the balance"
		}
		else{
			this.bal=this.bal-amount
			println "Your withdrawal is successful"
		}
	}
	def deposit(cash){
		this.bal=cash+this.bal
		println "Amount Deposited in your account $cusaccno"
	}
	def balEnq(){
		println "Your available balance is $bal in your account $cusaccno"
	}
	def customerDet(){
		println "="*30
		println "$bankName Bank\nHi $this.cusname\nAccount No : ${this.cusaccno}\nAvailable balance : ${this.bal}\nYour Address : ${this.address}"
		println "="*30
	}
	
	
}
obj=new BankApp("jerish",1234,10000,"chennai")
obj.withDraw(800)
obj.deposit(5900)
obj.balEnq()
obj.customerDet()

println "Welcome to our Banking Service"
flag=true

println "1.Aldready a Customer .. .. Login!"
println "2.Dont have an account Create one"
option=System.console().readLine("Enter the option ").toInteger()
	
switch(option){
	case 1:
		break
	case 2:
		name = System.console().readLine ("Enter your name :")
		random5DigitNumber = (Math.random() * 90000 + 10000) as int
		
		break
	case 3:
		println "Exiting ..."
		break
}
*/
import JavaClass as jc
def obj=new jc()
obj.message()


