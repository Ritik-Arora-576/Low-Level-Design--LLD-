public class Originator{
    private String content;

    public Originator(String content){
        this.content = content;
    }

    public void setContent(String str){
        this.content = str;
    }

    public String getContent(){
        return this.content;
    }

    public Momento createMomento(){
        return new Momento(this.content);
    }

    public String restoreFromMomento(Momento momento){
        return momento.getSavedContent();
    }
}