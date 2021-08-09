package SecondChapter;

public class Author_2_1 {
    private String name;
    private String email;

    public Author_2_1(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){

        return "SecondChapter.Author[ name = "+name+", email = "+email+"]";
    }

}
