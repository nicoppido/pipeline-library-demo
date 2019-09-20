package net.test.build

public class BuildUtils{

    protected String shContent;

    public BuildUtils(){
        this.shContent = "mvn -B -DskipTests clean package";

    }

    public void build(context){
        context.sh shContent;
        def files = context.findFiles(glob: 'src/main/java/com/mycompany/app');
        for(int i = 0; i<files.size(); i++){
            context.echo i.toString();
            context.echo """${files[i].name} ${files[i].path}""";
        }
    }
}

