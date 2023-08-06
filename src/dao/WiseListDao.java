package src.dao;

import src.dto.WiseList;
import src.singleton.Singleton;

import java.util.ArrayList;
import java.util.List;

public class WiseListDao {
    Singleton inst2 = Singleton.getInstance();
    List<WiseList> list = new ArrayList<>();
    int num =1;

    public void register() {
        System.out.print("명언 : ");
        String s3 = inst2.sc.nextLine();
        System.out.print("작가 : ");
        String s2 = inst2.sc.nextLine();
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
        int s6 = inst2.sc.nextInt();
        inst2.sc.nextLine();
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
        int s8 = inst2.sc.nextInt();
        inst2.sc.nextLine();

        for(int j=0;j<list.size();j++) {
            WiseList wiseList = list.get(j);
            if (wiseList.getNum() == s8) {
                System.out.print("명언 수정 : ");
                String newSentence = inst2.sc.nextLine();

                System.out.print("작가 수정 : ");
                String newAuthor = inst2.sc.nextLine();

                wiseList.setSentence(newSentence);
                wiseList.setAuthor(newAuthor);

                System.out.println(s8 + "번 명언이 수정되었습니다.");

            }
        }
    }
}
