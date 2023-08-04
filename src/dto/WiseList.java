package src.dto;

public class WiseList {
    private int num;
    private String sentence;
    private String author;

    public WiseList(int num, String author, String sentence) {
      this.num = num;
      this.author = author;
      this.sentence = sentence;
    }

    public int getNum() {
      return num;
    }

    public String getAuthor() {
      return author;
    }

    public void setAuthor(String author) {
      this.author = author;
    }

    public String getSentence() {
      return sentence;
    }

    public void setSentence(String sentence) {
      this.sentence = sentence;
    }

    @Override
    public String toString() {
      return "" + num + " / "+ author + " / " + sentence;
    }

  }

