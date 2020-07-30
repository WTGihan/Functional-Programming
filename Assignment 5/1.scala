object AssginmentPractice extends App{
    var r1=new Rational(2,4)
    var r3=r1.neg
    println(r3)
  }

  class Rational(n:Int,d:Int){
    def numer=n
    def denom=d
    def neg=new Rational(-this.numer,this.denom)
    override def toString= numer+"/"+denom
  }