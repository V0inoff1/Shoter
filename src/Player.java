//package Weapones;

import Weapones.*;

class Player {
    public static Weapones.Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapones.Weapon[] { new Pistol(), new MachineGun(), new RPG(), new Slingshot(), new WaterGun() };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot >= this.getSlotsCount() || slot < 0) {
            System.out.println(" Выберите оружие " + (this.getSlotsCount() - 1));
        } else {
            Weapones.Weapon weapon = weaponSlots[slot];
            weapon.shot();
        }
    }
}