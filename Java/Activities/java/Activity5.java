abstract class Book{
    String Title;
abstract void setTitle(String Title);
    String getTitle(){
        return Title;
    }
}
class MyBook extends Book {
    public void setTitle(String Title){
        this.Title=Title;
    }
}
public class Activity5{
    public static void main(String[] args){
        String Title="Was I Ever Enough";
        MyBook mb=new MyBook();
        mb.setTitle(Title);
        System.out.println("The title is:"+mb.getTitle());

    }
}  


