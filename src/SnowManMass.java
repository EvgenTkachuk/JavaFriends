import com.sun.source.tree.CompilationUnitTree;

import static java.lang.Math.*;

public class SnowManMass {
    public static void main(String[] args) {
        double snowSphere1 = 1;
        double snowSphere2 = 0.5;
        double snowSphere3 = 0.2;
        double densityCoefficient = 0.7;
        double volumeSphere =((double)4/3* PI*pow(snowSphere1, 3)+
                (double)4/3* PI* pow(snowSphere2, 3)+
                (double)4/3* PI* pow(snowSphere3, 3));
        double massSnowman = densityCoefficient * volumeSphere;
//        double RoundMassSnowman = (massSnowman,3);
        System.out.printf("Radius of first sphere: %.1f meter.%n", snowSphere1);
        System.out.printf("Radius of second sphere: %.1f meter.%n", snowSphere2);
        System.out.printf("Radius of third sphere: %.1f meter.%n", snowSphere3);
        System.out.println("According to above data...");
        System.out.printf("Volume all spheres: %.3f M\u00B3.%n", volumeSphere);
        System.out.printf("SnowMan mass: %.3f kg.%n", massSnowman);


    }
}
