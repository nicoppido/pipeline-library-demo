package net.test.build

public class BuildUtils{

    protected String shContent;

    public BuildUtils(){
        this.shContent = "mvn -B -DskipTests clean package";

    }

    public void build(context){
        context.sh shContent;
    }
}

