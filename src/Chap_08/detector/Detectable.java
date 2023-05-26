package Chap_08.detector;

public interface Detectable {

    public static final String name = "감지자";        //interface 메소드에서 public static final은 그냥 저절로 있음
    public abstract void detect();  //감지        //interface 메소드에서 public abstract 은 그냥 저절로 있음

}
