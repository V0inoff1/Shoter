import Weapones.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        Weapon[] weapons = new Weapon[5];
        weapons[0] = new Pistol();
        weapons[1] = new MachineGun();
        weapons[2] = new RPG();
        weapons[3] = new Slingshot();
        weapons[4] = new WaterGun();

        System.out.format("У игрока %d слотов с оружием," + " введите номер, чтобы выстрелить," + " -1 чтобы выйти%n",
                player.getSlotsCount());

        int slot;
        while (true) {
            slot = Integer.parseInt(scanner.nextLine());
            if (slot == (-1)) {
                break;
            } else if (slot <= (-2)) {
                System.out.println(" Повторите ввод");
                continue;
            } else {
                player.shotWithWeapon(slot - 1);
            }
        }
        System.out.println("Game over!");
    }
}
