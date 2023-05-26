package Chap_08;

import Chap_08.camera.Camera;
import Chap_08.camera.FactoryCam;
import Chap_08.camera.SpeedCam;

import javax.swing.*;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // abstract
        // 추상클래스 (아직 완성되지 않은 클래스)
        // 추상 메소드 (추상 클래스에서만 사용 가능한, 껍데기만 있는 메소드)  //추상클래스에 추상메소드가 있다면 자식클래스에서는 추상메소드가 있어야한다.

       // Camera camera = new Camera();  //추상클래스에서는 객체를 만들 수 없다.
        FactoryCam factoryCam = new FactoryCam();  // 추상클래스를 상속한 자식클래스에서는 객체 생성가능
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();

        Camera factoryCam2 = new FactoryCam();
        factoryCam2.showMainFeature();

        Camera speedCam2 = new SpeedCam();
        speedCam2.showMainFeature();
        }
    }

