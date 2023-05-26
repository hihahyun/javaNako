package Chap_07;

public class BlackBox {
    //설계도
    //인스턴스 변수 : 서로다른 객체에서 서로 다른값
    String modelName; //모델명
    String resolution; //해상도
    int price; // 가격
    String color; // 색상
    int serialNumber; // 시리얼 번호


    //클래스변수 : 이 클래스로부터 만들어지는 모든 객체에 똑같은 값을 가짐
    static boolean canAutoReport = false;


    // 생성자
    static int counter = 0; // 시리얼 번호를 생성해주는 역할 (처음엔 0이었다가 ++연산을 통해서 값을 증가시킴)

    BlackBox() {
        System.out.println("기본생성자 호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber );
    }

    BlackBox(String modelName, String resolution, int price, String color) {
        this(); // 기본생성자 호출

        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { //일반영상
            return 9;
        } else if (type == 2) { //이벤트영상
            return 1;
        }
        return 10;
    }

    // showDataTime : 날짜정보 표시여부
    // showSpeed : 속도정보 표시여부
    // min : 영상 기록 단위 (분)
    void record(boolean showDataTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDataTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

//    void record(){
//        System.out.println("녹화를 시작합니다.");
//        System.out.println("영상에 날짜정보가 표시됩니다.");
//        System.out.println("영상에 속도정보가 표시됩니다.");
//        System.out.println("영상은 5분 단위로 기록됩니다.");
//    }


    // static이 붙지 않은 메소드들은 각 객체마다 서로다른 동작을 한다. 객체가 가지고 있는 인스턴스 변수가 다르기 때문에.
    void record() {
        record(true, true, 5);
    }

    // static이 붙지 않은 메소드들은 각 객체마다 서로다른 동작을 한다. 객체가 가지고 있는 인스턴스 변수가 다르기 때문에.
    static void callServiceCenter() {
        System.out.println("서비스 센트(1588 - 0000) 로 연결합니다.");
        //modelName = "test"; // 인스턴스 변수는 객체가 만들어져야 만들어지는 인스턴스 변수이기 때문에 static클래스 메서드 내에서 직접 접근은 불가
        canAutoReport = false; // static으로 선언한 클래스 변수는 static 클래스 메서드 내에서 바로 사용 가능
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;} // 클래스 인스턴스 변수의 모델명 += 파라미터 모델명

    //Getter & Setter
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution (String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if(price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
