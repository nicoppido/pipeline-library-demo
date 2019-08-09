package net.test.init

public class SayHello{

  protected String name;

  public SayHello(String name){
    this.name = name;
  }

  public void hello(context){
    context.echo "Hello, ${name}.";
    context.echo "Running ${context.env.BUILD_ID} on ${context.env.JENKINS_URL}";
  }
}
