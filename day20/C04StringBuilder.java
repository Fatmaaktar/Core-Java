package day20;

public class C04StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        // sb1.append("Java Ogrenmek Kolaydir");
        sb1.append("sb1");
        String str = "fatma";
        sb2.append("sb2");
//        System.out.println(sb1==sb2);//string builderde hep false doner!!!
//        System.out.println(sb1.equals(sb2));//string builderde hep false doner!!!

        //    System.out.println(sb1);
        //   System.out.println(sb1.indexOf("a"));
        //   System.out.println(sb1.insert(3,"Java"));
        //    System.out.println(sb1.insert(3,"Java",1,2));
        //   System.out.println(sb1.replace(3,8,"Ali"));
        //   System.out.println(sb1.reverse());
        // sb1.setCharAt(3,'k');
        //  System.out.println(sb1);
        //System.out.println(sb1.subSequence(3,7));
//        System.out.println(sb1.toString());
//        System.out.println(sb2.capacity());
//        System.out.println(sb2.length());
//        sb2.trimToSize();//kapasite ve lenghti esitliyor
//        System.out.println(sb2.capacity());
//        System.out.println(sb2.length());
        //  System.out.println(sb1.compareTo(sb2));
        long Timestrbaslangic = System.nanoTime();
        double second1 = (double) Timestrbaslangic / 1000000000;
        System.out.println(second1);
        for (int i = 0; i < 1000; i++) {
            str = str + 1;
        }
        long Timestrbitis = System.nanoTime();
        double second2 = (double) Timestrbitis / 1000000000;
        System.out.println(second2);
        System.out.println("************************************");
        long TimeSb1baslangic = System.nanoTime();
        double second3 = (double) Timestrbaslangic / 1000000000;
        System.out.println(second3);
        for (int i = 0; i < 1000; i++) {
            sb1 = sb1.append(i);
        }
        long Timesb1bitis = System.nanoTime();
        double second4 = (double) Timestrbaslangic / 1000000000;
        System.out.println(second4);
    }

}
