/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package submission3;

class RabbitProblem {
    public static int rabbits(int months) {
        if (months <= 1)
            return months;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= months; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        int months = 6;
        System.out.println("Rabbit pairs after " + months + " months: " + rabbits(months));
    }
}
