package src;
import src.controller.WiseListController;

public class Main {

  public static void main(String[] args) {
    WiseListController controller = new WiseListController();

    System.out.println("======= 명언 앱 =======");
    System.out.println("등록 / 목록 / 삭제 / 수정");

    controller.act();
  }
}