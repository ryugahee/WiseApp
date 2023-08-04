
package src.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import src.dto.WiseList;

public class WiseListController {
  Scanner sc = new Scanner(System.in);
  List<WiseList> list = new ArrayList<>();
  int num =1;

  public void register() {
      System.out.print("명언 : ");
      String s3 = sc.nextLine();
      System.out.print("작가 : ");
      String s2 = sc.nextLine();
      list.add(new WiseList(num, s2, s3));
      System.out.println(num + "번 명언이 등록되었습니다.");
      num++;
  }

  public void list() {
    System.out.println("번호 / 작가 / 명언");
    System.out.println("---------------------");
    for (int j = 0; j <= list.size() - 1; j++) {
      System.out.println(list.get(j));
    }
  }

  public void delete() {
    System.out.println("삭제할 정보 id를 입력해주세요.");
    System.out.print("명령) ");
    int s6 = sc.nextInt();
    for(int j=0;j<list.size();j++) {
      WiseList wiseList = list.get(j);
      if (wiseList.getNum() == s6) {
        list.remove(j);
        System.out.println((s6) + "번 명언이 삭제되었습니다.");
      } else {
        System.out.println((s6) + "번 명언은 존재하지 않습니다.");
      }
    }
  }

  public void change() {
    System.out.println("수정할 정보 id를 입력하세요");
    System.out.print("명령) ");
    int s8 = sc.nextInt();
    for(int j=0;j<list.size();j++) {
      WiseList wiseList = list.get(j);
      if (wiseList.getNum() == s8) {
        System.out.println("명언(기존) : " + wiseList.getSentence());
        wiseList.setSentence("변경된 명언 출력");
        System.out.println("명언 : " + wiseList.getSentence());
        System.out.println("작가(기존) : " + wiseList.getAuthor());
        wiseList.setAuthor("변경된 이름 출력");
        System.out.println("작가 : " + wiseList.getAuthor());
      }
    }
  }


}
