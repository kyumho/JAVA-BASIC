package oop1;

public class MusicPlayer {

    int volumn = 0;
    boolean isOn = false;


    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volumn);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    void volumnDown() {
        volumn--;
        System.out.println("음악 플레이어 볼륨:" + volumn);
    }

    void volumnUp() {
        volumn++;
        System.out.println("음악 플레이어 볼륨:" + volumn);
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

}
