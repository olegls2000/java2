package lesson19;

import data.Auto;
import data.SimpleCircle;

import java.util.Arrays;

public class ClassWork {


    public static void main(String[] args) {
        //Design Patterns:
        //Creational:
        //Builder

        /*Vehicle auto = new Vehicle();
        auto.setBody(new Body());
        auto.setEngine(new Engine());
        auto.setWheels(Arrays.asList(new Wheel(), new Wheel()));*/

        VehicleBuilder builder = new VehicleBuilder();
        builder.addBody(new Body());
        System.out.println("Do Some logic ....");
        builder.addWheels(Arrays.asList(new Wheel(), new Wheel()));
        System.out.println("Do Some logic ....");
        builder.addEngine(new Engine());
        Vehicle auto = builder.build();
        //auto is fully ready!!!

        Vehicle auto2 = builder
                .addEngine(new Engine())
                .addBody(new Body())
                .addWheels(Arrays.asList(new Wheel(), new Wheel()))
                .build();

        //Singleton:
        SingleObject object = SingleObject.getInstance();
        SingleObject object1 = SingleObject.getInstance();

        //Observer:

        //"Получение данных от метеорологической станции (класс WeatherData, рассылатель событий)
        // и использование их для выведения на экран (класс CurrentConditionsDisplay, слушатель событий).
        // Слушатель регистрируется у наблюдателя с помощью метода registerObserver
        // (при этом слушатель заносится в список observers).
        // Регистрация происходит в момент создания объекта currentDisplay,
        // т.к. метод registerObserver применяется в конструкторе.
        // При изменении погодных данных вызывается метод notifyObservers,
        // который в свою очередь вызывает метод update у всех слушателей, передавая им обновлённые данные"

        Subscriber postimees = new PostimeesChanel();
        Subscriber delfi = new DelfiChanel();
        Subscriber err = new ERRChanel();

        MeteoStation meteoStation = new MeteoStation();

        meteoStation.subscribe(postimees);
        meteoStation.subscribe(delfi);
        meteoStation.subscribe(err);

        meteoStation.checkForecast();

        meteoStation.checkForecast();

        meteoStation.checkForecast();

        System.out.println("======================================================");

        //Iterator

        Auto[] autos = {new Auto(), new Auto(),new Auto() };
        MyContainer<Auto> autoContainer = new MyContainerImpl(autos);
        MyIterator<Auto> iterator = autoContainer.iterator();
        while (iterator.hasNext()) {
            Auto autoI = iterator.next();
            System.out.println(autoI);
        }


        SimpleCircle[] circles = {new SimpleCircle(5), new SimpleCircle(6)};
        MyContainer<SimpleCircle> circlesContainer = new MyContainerImpl(autos);
        MyIterator<SimpleCircle> iteratorC = circlesContainer.iterator();
        while (iteratorC.hasNext()) {
            SimpleCircle circle = iteratorC.next();
            System.out.println(circle);
        }

    }
}
