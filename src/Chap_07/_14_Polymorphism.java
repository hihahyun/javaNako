package Chap_07;

import Chap_07.camera.Camera;
import Chap_07.camera.FactoryCam;
import Chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성
        // Camera라는 클래스로 서로다른 객체를 만들수있다.

        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다. Students is a person)
        // class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a person)

        Camera camera= new Camera(); // 부모클래스는 부모클래스의 객체를 만들수있다. //부모클래스 객체이름 = new 자식클래스
        //FactoryCam factoryCam = new FactoryCam();
        Camera factoryCam = new FactoryCam(); //부모클래스는 자식클래스의 객체를 만들수있다.
        //SpeedCam speedCam = new SpeedCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("---------------------------");
        
        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();
        
        for(Camera cam : cameras) {
            cam.showMainFeature();
        }

        // 자식클래스의 메소드는 호출불가능. 객체생성시 부모클래스로 생성해서
        System.out.println("----------------------------");
//        factoryCam.detectFire();
//        speedCam.checkSpeed();
//        speedCam.recognizeLicensePlate();

        // 자식클래스의 메소드 호출하는 방법
        //instanceof 를 통해서 이 객체가 이 클래스의 인스턴스인지 여부를 확인을 하고
        // 그렇다면 형변환을 통해서 그 클래스의 메소드에 접근할수있다.
        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }
        
        if (factoryCam instanceof FactoryCam) {
            //factoryCam.detectFire();
            ((FactoryCam)factoryCam).detectFire();  // 형변환하려면 (클래스) 객체
        }
        
        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }

        // Object 클래스는 최상위 클래스
        // 모든 클래스는 기본적으로 자바에서 object라는 클래스를 상속하고 있고
        // object클래스 배열을 쓰면 어떤 형태이던간에 모든 클래스의 객체를 집어넣을 수 있다.
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();
    }
}
