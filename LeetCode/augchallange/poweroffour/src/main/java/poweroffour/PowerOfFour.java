package main.java.poweroffour;

public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
       return num != 0 && ((num&(num-1))== 0) && (num & 0xAAAAAAAA) == 0;
    }

    public boolean isPowerOfFourII(int num) {
       return num != 0 && ((num&(num-1))== 0) && (num & 0x55555555) != 0;
    }
}
