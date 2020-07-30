object AssginmentPractice extends App{
  var account1=new Account("123",30029,-2000)
  var account2=new Account("456",30030,2000)
  var account3=new Account("789",30050,4000)
//  account1.transfer(account2,2000)
//  println(account1)
//  println(account2)

  var bank:List[Account]=List(account1,account2,account3)

  //List of Accounts with negative balances
  val overdraft=(b:List[Account])=>b.filter(_.balance < 0)
  //Total of all account balances
  val Total=(b:List[Account])  => b.reduce((x:Account,y:Account)=>new Account("ALL Balance",0,(x.balance+y.balance)))
  //Another way find Total
  //    val balance=(b:List[Account]) =>b.map(x=>x.balance)
  //    val sum=(b:List[Account]) =>balance(b).reduce((x,y)=>x+y)

  //If balance is positive deposit interest is 0.05
  //If balance is negative overdraft interest is 0.1
  val interest=(b:List[Account]) => b.map(f = x => if (x.balance > 0) x.balance+x.balance*(0.0005)  else x.balance-x.balance*(0.001))

  println(overdraft(bank))
  println(Total(bank))
  //println(sum(bank))
  println(interest(bank))

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
