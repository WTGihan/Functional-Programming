object AssginmentPractice extends App{
  val p1=new Point(1,3)
  val p2=new Point(5,6)
  val p3=p1+p2
  val p4=p1.move(2,3)
  val p5=p1.distance(p2)
  val p6=p1.invert()
  println(p3)//Question 1 get answer
  println(p4)//Question 2 get answer
  println(p5)//Question 3 get answer
  println(p6)//Question 4 get answer
}

case class Point(a:Double,b:Double){
  def x:Double=a
  def y:Double=b
  //Question 1
  def +(that:Point)=Point(this.x+that.x,this.y+that.y)
  //Question 2
  def move(dx:Double,dy:Double)=Point(this.x+dx,this.y+dy)
  //Question 3
  def distance(that:Point):Double=math.sqrt((this.x-that.x)*(this.x-that.x)+(this.y-that.y)*(this.y-that.y))
  //Question 4
  def invert()=Point(this.x+this.y-this.x,this.y+this.x-this.y)

}