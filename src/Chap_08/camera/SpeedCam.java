package Chap_08.camera;

import Chap_08.detector.Detectable;
import Chap_08.reporter.Reportable;
import Chap_08.reporter.VideoReporter;

public class SpeedCam extends Camera {
    //퀴즈8
    private Detectable detector;
    private Reportable reportor;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReportor(Reportable reportor) {
        this.reportor = reportor;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void detect() {
        // System.out.println("사고를 감지합니다.");
        this.detector.detect();
    }

    public void report() {
        // System.out.println("화재 신고를 진행합니다.");
        this.reportor.report();
    }
}

