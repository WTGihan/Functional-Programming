object AssginmentPractice extends App{
  var x=new Rational(3,4)
  var y=new Rational(5,8)
  var z=new Rational(2,7)
  var result=x-y-z
  println(x)
  println(y)
  println(z)
  println(result)
}

class Rational(n:Int,d:Int){
  require(d>0,"d must be greater than 0")
  def numer=n
  def denom=d

  def +(r:Rational)=new Rational(this.numer*r.denom+this.denom*r.numer,
    this.denom*r.denom)
  def neg=new Rational(-this.numer,this.denom)
  def -(r:Rational)=this+r.neg
  
  override def toString= numer+"/"+denom
}