package Chap_08;

//import Chap_08.reporter.NormalReporter;
//import Chap_08.reporter.Reportable;
//import Chap_08.reporter.VideoReporter;
import Chap_08.camera.FactoryCam;
import Chap_08.detector.AdvancedFireDetector;
import Chap_08.detector.Detectable;
import Chap_08.detector.FireDetector;
import Chap_08.reporter.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 단일상속 (extends)
        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("  ");

        Reportable normalReporter2 = new NormalReporter();
        normalReporter2.report();

        Reportable videoReporter2 = new VideoReporter();
        videoReporter2.report();

        System.out.println("-------------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetector);
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(normalReporter);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
