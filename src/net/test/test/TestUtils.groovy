package net.test.test

public class TestUtils{

    protected String shContent;

    public TestUtils(){
        this.shContent = "mvn test";

    }

    public void test(context){
        context.sh shContent;
    }

}
