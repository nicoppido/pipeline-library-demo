package net.test.init

public class SayHello{

  protected String name;

  public SayHello(String name){
    this.name = name;
  }

  public void hello(context){
    context.echo "Hello, ${name}.";
  }
}