package AuthorsAndBooks;

public class main extends Book{


  public static void main(String[] args) {

    new main().go();

    }
    void go() {

    new Author();
    Author author = new Author();

    System.out.print(author.getName() + " ");
      System.out.print(author.getgender() + " ");
      System.out.print(author.getEmail() + " " + '\n');
      System.out.print(author.getTitel() + " ");
      System.out.print(author.getNumsider() + " " + '\n');
      System.out.print(author.getTitel2() + " ");
      System.out.print(author.getNumsider2() + " " + '\n');
      System.out.println(" ");

      System.out.print(author.getName2() + " ");
      System.out.print(author.getgender2() + " ");
      System.out.print(author.getEmail2() + " " + '\n');
      System.out.print(author.getTitel3() + " ");
      System.out.print(author.getNumsider3() + " " + '\n');
      System.out.print(author.getTitel4() + " ");
      System.out.print(author.getNumsider4() + " " + '\n');
      System.out.print(author.getTitel5() + " ");
      System.out.print(author.getNumsider5() + " ");


    }

  }