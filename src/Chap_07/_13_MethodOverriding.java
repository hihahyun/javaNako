package Chap_07;

import Chap_07.camera.Camera;
import Chap_07.camera.FactoryCam;
import Chap_07.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 메소드 오버라이딩 : 자식 클래스에서 부모 클래스의 메소드를 덮어쓰기 (재정의)
        // 메소드 오버로딩 : 같은 클래스내에서 똑같은 이름을 가진 메소드를 파라미터의 개수나 파라미터 타입을 다르게 함으로써 여러가지 정의
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }
}
