package Chap_07.camera;

// SpeedCam is a Camera (IS-A)
public class SpeedCam extends Camera { // 자식 클래스
//    public String name;

    public SpeedCam() {
        //this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }

    public void takePicture() {
        //사진 촬영
//        System.out.println(this.name + " : 사진을 촬영합니다.");
        super.takePicture(); // 부모클래스의 메소드
        checkSpeed(); // 자식클래스의 메소드
        recognizeLicensePlate();
    }

//    public void takePicture() {
//        // 사진 촬영
//        System.out.println("사진을 촬영합니다.");
//    }
//
//    public void recordVideo() {
//        // 동영상 녹화
//        System.out.println("동영상을 녹화합니다.");
//    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        //번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override // annotation (주석) // 같은 이름의 메소드를 부모클래스 덮어쓰기 자식클래스에서 재정의
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}
