package src;
import src.controller.WiseListController;

import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    WiseListController controller = new WiseListController();
    Scanner sc = new Scanner(System.in);

    System.out.println("======= 명언 앱 =======");
    System.out.println("등록 / 목록 / 삭제 / 수정");

    boolean result = true;
    while(result) {
      System.out.print("명령) ");
      String s1 = sc.nextLine();

      switch (s1) {
        case "등록":
          controller.register();
          break;
        case "목록":
          controller.list();
          break;
        case "삭제":
          boolean result2 = true;
          while (true) {
            controller.delete();
            break;
          }
          break;
        case "수정":
          controller.change();
          break;
        case "종료":
          result = false;
        default:
      }
    }
  }
}