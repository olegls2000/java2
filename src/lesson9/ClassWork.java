package lesson9;

import data.Auto;
import data.AutoSalon;
import enums.Color;

public class ClassWork {
    //Склад-магазин вместимостью до 6 автомобилей,
    // который может хранить и продавать автомобили, а так же накапливать деньги в кассе.
    //1. Реализовать класс автомобиль у которго есть:
    // цвет (может быть - Красный, белый, черный)
    // применить константы(подумать какого типа они должны быть) ),
    // вес (от 1200 до 2500 кг)
    // и цена (от 80 000 до 400 000).
    // Реализуйте в классе конструктор в котором все параметы автомобиля должны gerirovatsja randomno!.
    // Инкапсулируйте свойства класса так чтоб небыло возможности
    // ввести некорректные данные(проверка в конструкторе+сеттеры).


    //2. Реализуйте класс AutoSalon, который может хранить максимум 5 автомобилей.
    // Склад магазин должен знать сколько автомобилей у него храниться .
    //3. Реализуйте метод "добавить автомобиль на склад" который добавляет автомобиль,
    // и в случае если все места заняты просит продать какой то из автомобилей на складе.
    // Под добавлением автомобиля подразумевается покупка за деньги,
    // которы имеются в кассе и размешение его на любом первом попавшемся свободном месте.

    public static void main(String[] args) throws Exception {
        Auto bmw = new Auto();
        Auto toyota = new Auto(Color.RED, 1_350, 25_000);
        AutoSalon salon = new AutoSalon(500_000l);

        salon.buyAuto(bmw);
        salon.sellAuto();
        salon.printReport();
        salon.sellAuto();
        salon.buyAuto(toyota);

    }
}
