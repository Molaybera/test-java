class sem1{
    int m11,m12,m13;
    float avg1;
    sem1(){
        m11 = 5;
        m12= 10;
        m13 = 20;
    }
    float calavg1(){
        avg1 = (float)(m11+m12+m13)/3;
        return avg1;
    }
}
class sem2 extends sem1{
    int m21,m22,m23;
    float avg2;
    sem2(){
        m21 = 20;
        m22 = 30;
        m23 = 40;
    }
    float calavg2(){
        float avg2 = (float)(m21+m22+m23)/3;
        return avg2;
    }
}
public class Exp14 extends sem2{
    int m31,m32,m33;
    float avg3;
    Exp14(){
        m31 = 25;
        m32 = 35;
        m33 = 45;
    }
    float calavg3(){
        float avg3 = (float)(m31+m32+m33)/3;
        return avg3;
    }
    float totalavg(){
        return(avg1+avg2+avg3)/3;
    }
    public static void main(String[] args) {
        Exp14 m1 = new Exp14();
        System.out.println(m1.calavg1());
        System.out.println(m1.calavg2());
        System.out.println(m1.calavg3());
        System.out.println(m1.totalavg());
    }
}
