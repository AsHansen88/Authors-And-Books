package AuthorsAndBooks;

public class Author extends Book {

  private String name;
  private String gender;
  private String Email;

  private String name2;
  private String gender2;
  private String Email2;

  public Author() {

    setName(name);
    setGender(gender);
    setEmail(Email);

    setName(name2);
    setGender(gender2);
    setEmail(Email2);


    name = "HC Andersen";
    gender = "Male";
    Email = "HC @ndersen";

    name2 = "Brøderene Grimm";
    gender2 = "male";
    Email2 = "Grimm@Eventyr.dk";
  }

  public String getName() {
    return name;
  }

  public String getgender() {
    return gender;

  }

  public String getEmail() {
    return Email;

  }

  public String getName2() {
    return name2;
  }

  public String getgender2() {
    return gender2;

  }

  public String getEmail2() {
    return Email2;

  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setEmail(String email) {
    Email = email;
  }

}

