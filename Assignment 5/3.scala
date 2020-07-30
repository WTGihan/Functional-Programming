object AssginmentPractice extends App{
  var account1=new Account("123",30029,2000)
  var account2=new Account("456",30030,2000)
  account1.transfer(account2,2000)
  println(account1)
  println(account2)
}

class Account(id:String,n:Int,b:Double){
  val nic:String=id;
  val accountNumber:Int=n;
  var balance:Double=b;
  
  def withdraw(a:Double)= this.balance=this.balance-a
  def deposit(a:Double)= this.balance=this.balance+a
  def transfer(a:Account,b:Double)=
    a.deposit(b)
    withdraw(b)
  override def toString= "["+nic+":"+accountNumber+":"+balance+"]"
}