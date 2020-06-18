package exercise;
class Dragon
{
  private int age;
  private Lizard _lizard = new Lizard();
  private Bird _bird = new Bird();
  public void setAge(int age)
  {
    this.age = this._bird.age = this._lizard.age = age;
	  
  }
  public String fly()
  {
   return _bird.fly();
  }
  public String crawl()
  {
    return _lizard.crawl();
  }
}