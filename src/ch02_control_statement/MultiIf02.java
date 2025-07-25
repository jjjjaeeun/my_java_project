package ch02_control_statement;

public class MultiIf02 {
    public static void main(String[] args) {
        int age = 1 ;
        double ticket = 1000.0 ;
        double discount ;

        String comment;
        String ss;

        if (age<8) {
            // discount = 1.0;
            // comment =유아(무료 입장);
            ss="유아(무료 입장)";
        } else if (age<14){
            // discount = 0.5;
            // comment =어린이(50% 할인);
            ss="어린이(50% 할인)";
        }else if (age<20){
            // discount = 0.3;
            // comment =청소년(30% 할인);
            ss="청소년(30% 할인)";
        }else if (age<65) {
            // discount = 0.0;
            // comment =성인(정가);
            ss="성인(정가)";
        }else if (age>=65){
            // discount = 0.4;
            // comment =노인(40% 할인);
            ss="노인(40% 할인)";
        } else {
            ss="";
        }

        ticket = age <8 ?1000.0*0: age<14 ?1000.0 * 0.5:age<20 ? 1000.0*0.7:age>=65 ?1000.0*0.6 : 1000.0;

        String message = age+"살: "+ ss;

        System.out.println(message);
        System.out.println("가격은"+ ticket +"원 입니다.");

        // String message = age + "살" + comment ;
        // System.out.println (message);
        // message = "가격은" + (ticket* (1-discount))+"입니다;
        // System.out.println (message)
    }
}
