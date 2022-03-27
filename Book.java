package AuthorsAndBooks;

public class Book {

  private String titel;
  private String Numsider;

  private String titel2;
  private String Numsider2;

  private String titel3;
  private String Numsider3;

  private String titel4;
  private String Numsider4;

  private String titel5;
  private String Numsider5;

  public Book() {

    setTitel(titel);
    setNumsider(Numsider);

    setTitel(titel2);
    setNumsider(Numsider2);

    setTitel(titel3);
    setNumsider(Numsider3);

    setTitel(titel4);
    setNumsider(Numsider4);

    setTitel(titel5);
    setNumsider(Numsider5);


    //Books HC Andersen

    titel2 = "Den lille havfrue";
    Numsider2 = "60";

    titel = "Fyrtøjet";
    Numsider = "50";

    //Books of Grimm

    titel3 = "Den gamle kone";
    Numsider3 = "3";

    titel4 = "Fiskeren og hans kone";
    Numsider4 = "6";

    titel5 = "Frøkongen eller jernhenrik";
    Numsider5 = "4";


  }

  public String getTitel() {

   return this.titel;

  }


  public String getNumsider() {

    return this.Numsider;

  }

  public String getNumsider2() {
    return this.Numsider2;
  }

  public String getTitel2() {
    return this.titel2;
  }

  public String getTitel3() {

    return this.titel3;

  }

  public String getNumsider3() {

    return this.Numsider3;
  }
    public String getNumsider4() {
      return this.Numsider4;
    }

    public String getTitel4() {
      return this.titel4;
    }

    public String getNumsider5() {
      return this.Numsider5;
    }

    public String getTitel5() {
      return this.titel5;
    }

  public void setTitel(String titel) {
    this.titel = titel;
  }


  public String setNumsider(String Numsider) {
    this.Numsider = Numsider;
    return Numsider;

  }


}






