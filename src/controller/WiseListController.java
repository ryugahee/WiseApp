
package src.controller;

import src.dao.WiseListDao;
import src.singleton.Singleton;
import src.view.WiseListView;

public class WiseListController {
  WiseListDao dao = new WiseListDao();
  WiseListView view = new WiseListView();
  Singleton inst1 = Singleton.getInstance();

  boolean result = true;
  public void act() {
    while(result) {
      view.print("명령) ");
      String s1 = inst1.sc.nextLine();

      switch (s1) {
        case "등록":
          dao.register();
          break;
        case "목록":
          dao.list();
          break;
        case "삭제":
            dao.delete();
            break;
        case "수정":
          dao.change();
          break;
        case "종료":
          result = false;
          break;
      }
  }
  }
}
