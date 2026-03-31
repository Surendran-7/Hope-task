class Name{
    private String name;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }

} 
public class gettersetter{
    public static void main(String[] args) {
        Name n=new Name();
        n.setName("Surendran");
        System.out.println(n.getName());
    }
}
