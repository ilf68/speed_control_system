import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {

        int carSpeed = 50 + 23;

        boolean place = true;    //false for vilage, true for town

        System.out.println("Система расчётов штрафов в Германии(городская черта)");

        int townSpeed = 50;
        int viligeSpeed = 110;
        if (place) {
            int overSpeed = carSpeed - townSpeed;
        }
        else {
           
        }
        int overSpeed = carSpeed - townSpeed;
        int fine = 0;
        int fineVilige = 0;

        if (overSpeed >= 1 && overSpeed <= 10) {
            fine = 30;
            fineVilige = 20;
        } else if (overSpeed <= 15) {
            fine = 50;
            fineVilige = 40;
        } else if (overSpeed <= 20) {
            fine = 70;
            fineVilige = 60;
        } else if (overSpeed <= 25) {
            fine = 115;
            fineVilige = 100;
        } else if (overSpeed <= 30) {
            fine = 180;
            fineVilige = 150;
        } else if (overSpeed <= 40) {
            fine = 260;
            fineVilige = 200;
        } else if (overSpeed <= 50) {
            fine = 400;
            fineVilige = 320;
        } else if (overSpeed <= 60) {
            fine = 560;
            fineVilige = 480;
        } else if (overSpeed <= 70) {
            fine = 700;
            fineVilige = 600;
        } else if (overSpeed > 70) {
            fine = 800;
            fineVilige = 700;
        }

        if (overSpeed <= 0) {
            System.out.println("Скорость в норме");
        } else {
            System.out.println("Скорость превышена на " + overSpeed + " км/ч");
            if (place) {
                System.out.println("Штраф " + fine + " евро");
            } else {
                System.out.println("Штраф " + fineVilige + " евро");
            }
        }


    }
}


